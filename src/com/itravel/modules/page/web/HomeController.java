package com.itravel.modules.page.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("")
public class HomeController extends BaseController {

	@RequestMapping("")
	public String index() {
		return "home/index";
	}

}
