package com.itravel.sys.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bkweb.common.util.AccountUtils;
import com.bkweb.sys.security.SystemAuthorizingRealm.Principal;
import com.bkweb.sys.user.entity.User;
import com.bkweb.sys.user.service.UserService;
import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("")
public class LoginController extends BaseController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "${travelPath}/login", method = RequestMethod.GET)
	public String loginIndex(Model model) {
		Principal principal = AccountUtils.getPrincipal();
		if (principal != null) {
			User user = new User(AccountUtils.getAccount());
			user = userService.findList(user, false, "account").get(0);
			model.addAttribute("user", user);
			return "redirect:/";
		}
		return "mobile/mine/login";
	}

	@RequestMapping(value = "${travelPath}/login", method = RequestMethod.POST)
	public String loginFailed(Model model) {
		return "redirect:" + adminPath + "/mine";
	}

	@RequestMapping(value = "${travelPath}/loginout")
	public String loginOut(Model model) {
		AccountUtils.getSubject().logout();
		return "redirect:" + adminPath + "/mine";
	}
}
