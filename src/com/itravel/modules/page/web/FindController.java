package com.itravel.modules.page.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("${travelPath}/find")
public class FindController extends BaseController {
	@RequestMapping("")
	public String find(Model model) {
		return "mobile/find/index";
	}

}
