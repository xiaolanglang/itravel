package com.itravel.modules.home.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itravel.common.web.BaseController;

@RequestMapping("")
@Controller
public class HomeController extends BaseController {

	@RequestMapping("")
	public String index() {
		return "home/index";
	}
}
