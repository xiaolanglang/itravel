package com.itravel.sys.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bkweb.common.util.AccountUtils;
import com.bkweb.common.utils.Encodes;
import com.bkweb.common.web.Result;
import com.bkweb.sys.account.entity.Account;
import com.bkweb.sys.account.service.CAccountService;
import com.bkweb.sys.security.SystemAuthorizingRealm.Principal;
import com.bkweb.sys.security.UsernamePasswordToken;
import com.bkweb.sys.user.entity.User;
import com.bkweb.sys.user.service.UserService;
import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("")
public class LoginController extends BaseController {

	@Autowired
	private CAccountService accountService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "${travelPath}/loginresult")
	@ResponseBody
	public Object loginResult(Model model) {
		return new Result("200", "success");
	}

	@RequestMapping(value = "${travelPath}/login", method = RequestMethod.GET)
	public String login(Model model) {
		Principal principal = AccountUtils.getPrincipal();
		if (principal != null) {
			return "redirect:" + adminPath + "/mine";
		}
		return "mobile/mine/login";
	}

	@RequestMapping(value = "${travelPath}/login", method = RequestMethod.POST)
	@ResponseBody
	public Object loginFailed(Model model) {
		Principal principal = AccountUtils.getPrincipal();
		if (principal != null) {
			return new Result("200", "success");
		}
		return new Result("500", "用户名或者密码错误");
	}

	@RequestMapping(value = "${travelPath}/loginout")
	@ResponseBody
	public Object loginOut(Model model) {
		AccountUtils.getSubject().logout();
		return new Result("200", "succsee");
	}

	@RequestMapping(value = "${travelPath}/register/check")
	@ResponseBody
	public Object checkRegister(Account account) {
		boolean flag = accountService.checkRegister(account);

		if (flag) {
			return new Result("200", "succsee");
		}
		return new Result("500", "failed");
	}

	@RequestMapping(value = "${travelPath}/register", method = RequestMethod.POST)
	@ResponseBody
	public Object register(Account account, String name) {
		boolean flag = accountService.checkRegister(account);

		if (flag) {
			String pw = account.getPassword();
			String passWord = Encodes.getMD5Password(account.getUsername(), account.getPassword());
			account.setPassword(passWord);
			accountService.save(account);
			User user = new User(account);
			user.setName(name);
			userService.save(user);

			UsernamePasswordToken token = new UsernamePasswordToken();
			token.setUsername(account.getUsername());
			token.setPassword(pw.toCharArray());
			AccountUtils.getSubject().login(token);
			Principal principal = AccountUtils.getPrincipal();
			if (principal != null) {
				return new Result("200", "succsee");
			}
		}

		return new Result("500", "该用户已经存在");
	}
}
