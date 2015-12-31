package com.itravel.sys.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("${travelPath}/login")
public class LoginController extends BaseController {
	@RequestMapping("")
	public String login(Model model) {
		return "mobile/mine/login";
	}
}
