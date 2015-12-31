package com.itravel.modules.page.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bkweb.common.utils.dict.DictData;
import com.bkweb.common.utils.hibernatepage.HPage;
import com.bkweb.modules.tourism.entity.TourismImg;
import com.bkweb.modules.tourism.service.TourismImgService;
import com.bkweb.modules.tourism.service.TourismService;
import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("")
public class IndexController extends BaseController {

	@Autowired
	private TourismService tourismService;

	@Autowired
	private TourismImgService tourismImgService;

	@RequestMapping("")
	public String index(Model model) {
		getIndexProductList(model);
		return "mobile/index/index";
	}

	public void getIndexProductList(Model model) {
		HPage<TourismImg> page = new HPage<TourismImg>(1);
		TourismImg tourismImg = new TourismImg();
		tourismImg.setType(DictData.img_type_0);
		tourismImgService.findPageList(tourismImg, false, page, "tourism");
		model.addAttribute("tourismImgList", page.getList());
	}

}
