package com.itravel.modules.page.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bkweb.modules.menu.service.MenuSortService;
import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("${travelPath}/sort")
public class SortController extends BaseController {

	@Autowired
	private MenuSortService menuSortService;

	@RequestMapping("")
	public String sort(Model model) {
		return "mobile/sort/index";
	}

	@RequestMapping("iframepage/left")
	public String iframeLeft(Model model) {
		model.addAttribute("list", menuSortService.findAllParentList());
		return "mobile/sort/iframepage/left";
	}

	@RequestMapping("iframepage/right")
	public String iframeRight(Model model) {
		return "mobile/sort/iframepage/right";
	}

	@RequestMapping("second")
	public String sortsecond(Model model) {
		return "mobile/sort/second";
	}

}
