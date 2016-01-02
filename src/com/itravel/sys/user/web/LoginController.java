package com.itravel.sys.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("${travelPath}/login")
public class LoginController extends BaseController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String loginIndex(Model model) {
		return "mobile/mine/login";
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public String login(Model model) {
		return "redirect:" + adminPath + "/mine/";
	}
}
