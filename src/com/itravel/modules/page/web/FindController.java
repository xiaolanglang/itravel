package com.itravel.modules.page.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bkweb.modules.menu.entity.MenuFind;
import com.itravel.common.web.BaseController;
import com.itravel.modules.menu.service.MenuFindService;

@Controller
@RequestMapping("${travelPath}/find")
public class FindController extends BaseController {

	@Autowired
	private MenuFindService menuFindService;

	@RequestMapping("")
	public String find(Model model) {
		getFindContent(model);
		return "mobile/find/index";
	}

	private void getFindContent(Model model) {
		model.addAttribute("findList", menuFindService.findList(new MenuFind(), false));
	}

}
