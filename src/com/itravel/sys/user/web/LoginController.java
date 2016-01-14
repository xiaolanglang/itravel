package com.itravel.sys.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bkweb.common.util.AccountUtils;
import com.bkweb.common.web.Result;
import com.bkweb.sys.security.SystemAuthorizingRealm.Principal;
import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("")
public class LoginController extends BaseController {

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
		return new Result("500", "failed");
	}

	@RequestMapping(value = "${travelPath}/loginout")
	@ResponseBody
	public Object loginOut(Model model) {
		AccountUtils.getSubject().logout();
		return new Result("200", "succsee");
	}
}
