package com.itravel.modules.page.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("${travelPath}/mine")
public class MineController extends BaseController {
	@RequestMapping("")
	public String mine(Model model) {
		return "mobile/mine/index";
	}
}
