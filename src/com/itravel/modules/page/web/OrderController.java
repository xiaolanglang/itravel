package com.itravel.modules.page.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bkweb.common.utils.dict.DictData;
import com.bkweb.modules.tourism.entity.Tourism;
import com.bkweb.modules.tourism.entity.TourismImg;
import com.itravel.common.web.BaseController;
import com.itravel.modules.tourism.service.TourismImgService;

@Controller
@RequestMapping("${travelPath}/order")
public class OrderController extends BaseController {

	@Autowired
	private TourismImgService tourismImgService;

	@RequestMapping("")
	public String order(Model model, String id) {
		TourismImg tourismImg = new TourismImg();
		tourismImg.setTourism(new Tourism(id));
		tourismImg.setType(DictData.img_type_2);
		List<TourismImg> list = tourismImgService.findList(tourismImg, false, "tourism");
		model.addAttribute("tourismImg", list.get(0));
		return "mobile/order/index";
	}

	@RequestMapping("second")
	public String orderSecond(Model model) {
		return "mobile/order/second";
	}
}
