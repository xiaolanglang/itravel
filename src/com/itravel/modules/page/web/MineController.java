package com.itravel.modules.page.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bkweb.common.util.AccountUtils;
import com.bkweb.sys.security.SystemAuthorizingRealm.Principal;
import com.bkweb.sys.user.entity.User;
import com.bkweb.sys.user.service.UserService;
import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("${travelPath}/mine")
public class MineController extends BaseController {

	@Autowired
	private UserService userService;

	@RequestMapping("")
	public String mine(Model model) {
		Principal principal = AccountUtils.getPrincipal();
		if (principal != null) {
			User user = new User(AccountUtils.getAccount());
			user = userService.findList(user, false, "account").get(0);
			model.addAttribute("user", user);
		}
		return "mobile/mine/index";
	}
}
