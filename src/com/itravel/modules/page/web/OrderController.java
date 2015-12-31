package com.itravel.modules.page.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itravel.common.web.BaseController;

@Controller
@RequestMapping("${travelPath}/order")
public class OrderController extends BaseController {
	@RequestMapping("")
	public String order(Model model) {
		return "mobile/order/index";
	}

	@RequestMapping("second")
	public String orderSecond(Model model) {
		return "mobile/order/second";
	}
}
