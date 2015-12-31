package com.itravel.modules.page.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("${travelPath}/sort")
public class SortController extends BaseController {
	@RequestMapping("")
	public String sort(Model model) {
		return "mobile/sort/index";
	}

	@RequestMapping("second")
	public String sortsecond(Model model) {
		return "mobile/sort/second";
	}
}
