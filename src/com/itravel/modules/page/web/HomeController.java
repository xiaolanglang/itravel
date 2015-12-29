package com.itravel.modules.page.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bkweb.common.utils.hibernatepage.HPage;
import com.bkweb.modules.tourism.entity.Tourism;
import com.bkweb.modules.tourism.service.TourismService;
import com.itravel.common.web.BaseController;

@Controller
@RequestMapping({ "${travelPath}", "" })
public class HomeController extends BaseController {

	@Autowired
	private TourismService tourismService;

	@RequestMapping("")
	public String index(Model model) {
		HPage<Tourism> page = new HPage<Tourism>(1);
		tourismService.findPageList(new Tourism(), false, page);
		model.addAttribute("tourismList", page.getList());
		return "home/index";
	}

	@RequestMapping("getIndexContent")
	@ResponseBody
	public String getIndexContent(Model model) {
		HPage<Tourism> page = new HPage<Tourism>(1);
		tourismService.findPageList(new Tourism(), false, page);
		model.addAttribute("tourismList", page.getList());
		return "home/index";
	}

}
