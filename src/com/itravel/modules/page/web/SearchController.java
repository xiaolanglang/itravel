package com.itravel.modules.page.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("${travelPath}/search")
public class SearchController {
	@RequestMapping("")
	public String search(Model model) {
		return "mobile/search/index";
	}

	@RequestMapping("position")
	public String searchPosition(Model model) {
		return "mobile/search/position";
	}
}
