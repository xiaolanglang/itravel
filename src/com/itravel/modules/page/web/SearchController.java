package com.itravel.modules.page.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bkweb.modules.tourism.service.TourismService;

@Controller
@RequestMapping("${travelPath}/search")
public class SearchController {

	@Autowired
	private TourismService tourismService;

	@RequestMapping("")
	public String search(Model model, String content, Integer pageNum) {
		tourismService.searchPageList(model, content, pageNum, false);
		return "mobile/search/index";
	}

	@RequestMapping("searchProduct")
	public Object searchProduct(Model model, String content, Integer pageNum) {
		tourismService.searchPageList(model, content, pageNum, false);
		return "mobile/search/response/searchresult";
	}

	@RequestMapping("position")
	public String searchPosition(Model model) {
		return "mobile/search/position";
	}
}
