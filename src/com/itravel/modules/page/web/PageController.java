package com.itravel.modules.page.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bkweb.common.utils.hibernatepage.HPage;
import com.bkweb.modules.tourism.entity.Tourism;
import com.bkweb.modules.tourism.service.TourismService;
import com.itravel.common.web.BaseController;

@Controller
@RequestMapping({ "${travelPath}", "" })
public class PageController extends BaseController {

	@Autowired
	private TourismService tourismService;

	@RequestMapping({ "", "index" })
	public String index(Model model) {
		return "mobile/index/index";
	}

	@RequestMapping("sort")
	public String sort(Model model) {
		return "mobile/sort/index";
	}

	@RequestMapping("sort/second")
	public String sortsecond(Model model) {
		return "mobile/sort/second";
	}

	@RequestMapping("find")
	public String find(Model model) {
		return "mobile/find/index";
	}

	@RequestMapping("mine")
	public String mine(Model model) {
		return "mobile/mine/index";
	}

	@RequestMapping("login")
	public String login(Model model) {
		return "mobile/mine/login";
	}

	@RequestMapping("order")
	public String order(Model model) {
		return "mobile/order/index";
	}

	@RequestMapping("order/second")
	public String orderSecond(Model model) {
		return "mobile/order/second";
	}

	@RequestMapping("search")
	public String search(Model model) {
		return "mobile/search/index";
	}

	@RequestMapping("search/position")
	public String searchPosition(Model model) {
		return "mobile/search/position";
	}

	@RequestMapping("getIndexContent")
	public Object getIndexContent(Model model) {
		HPage<Tourism> page = new HPage<Tourism>(1);
		tourismService.findPageList(new Tourism(), false, page);
		model.addAttribute("tourismList", page.getList());
		return "mobile/index/productList";
	}

}
