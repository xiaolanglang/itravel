package com.itravel.modules.page.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bkweb.modules.menu.entity.MenuSort;
import com.itravel.common.web.BaseController;
import com.itravel.modules.menu.service.MenuSortService;
import com.itravel.modules.tourism.service.TourismService;

@Controller
@RequestMapping("${travelPath}/sort")
public class SortController extends BaseController {

	@Autowired
	private MenuSortService menuSortService;

	@Autowired
	private TourismService tourismService;

	@RequestMapping("")
	public String sort(Model model) {
		return "mobile/sort/index";
	}

	@RequestMapping("iframepage/left")
	public String iframeLeft(Model model) {
		return "mobile/sort/iframepage/left";
	}

	@RequestMapping("iframepage/right")
	public String iframeRight(Model model) {
		return "mobile/sort/iframepage/right";
	}

	@ResponseBody
	@RequestMapping("findAllSortList")
	public Object findAllSortList() {
		Map<String, List<MenuSort>> map = new HashMap<String, List<MenuSort>>();
		map.put("leftList", menuSortService.findAllParentList());
		map.put("rightList", menuSortService.findAllSortList());
		return map;
	}

	@RequestMapping("search")
	public String search(Model model, String content, Integer pageNum) {
		tourismService.searchSortPageList(model, content, pageNum, false);
		return "mobile/sort/second";
	}

	@RequestMapping("searchproduct")
	public String searchProduct(Model model, String content, Integer pageNum) {
		tourismService.searchSortPageList(model, content, pageNum, false);
		return "mobile/sort/second";
	}

}
