package com.lovetravel.modules.travel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lovetravel.common.controller.BaseController;

@Controller
@RequestMapping("${travelPath}/sale")
public class TravelController extends BaseController{
	
	@RequestMapping("{id}")
	public String sale(String id){
		return "sale/sale";
	}
}
