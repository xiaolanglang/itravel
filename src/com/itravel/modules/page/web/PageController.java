package com.itravel.modules.page.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bkweb.common.utils.hibernatepage.HPage;
import com.bkweb.modules.tourism.entity.TourismImg;
import com.bkweb.modules.tourism.service.TourismImgService;
import com.bkweb.modules.tourism.service.TourismService;
import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("")
public class PageController extends BaseController {

	@Autowired
	private TourismService tourismService;

	@Autowired
	private TourismImgService tourismImgService;

	@RequestMapping("")
	public String index(Model model) {
		getIndexContent(model);
		return "mobile/index/index";
	}

	@RequestMapping("${travelPath}/sort")
	public String sort(Model model) {
		return "mobile/sort/index";
	}

	@RequestMapping("${travelPath}/sort/second")
	public String sortsecond(Model model) {
		return "mobile/sort/second";
	}

	@RequestMapping("${travelPath}/find")
	public String find(Model model) {
		return "mobile/find/index";
	}

	@RequestMapping("${travelPath}/mine")
	public String mine(Model model) {
		return "mobile/mine/index";
	}

	@RequestMapping("${travelPath}/login")
	public String login(Model model) {
		return "mobile/mine/login";
	}

	@RequestMapping("${travelPath}/order")
	public String order(Model model) {
		return "mobile/order/index";
	}

	@RequestMapping("${travelPath}/order/second")
	public String orderSecond(Model model) {
		return "mobile/order/second";
	}

	@RequestMapping("${travelPath}/search")
	public String search(Model model) {
		return "mobile/search/index";
	}

	@RequestMapping("${travelPath}/search/position")
	public String searchPosition(Model model) {
		return "mobile/search/position";
	}

	public void getIndexContent(Model model) {
		HPage<TourismImg> page = new HPage<TourismImg>(1);
		TourismImg tourismImg = new TourismImg();
		tourismImg.setType("0");
		tourismImgService.findPageList(tourismImg, true, page, "tourism");
		model.addAttribute("tourismImgList", page.getList());
	}

}
