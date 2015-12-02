package com.lovetravel.sys.account.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lovetravel.common.controller.BaseController;
import com.lovetravel.common.utils.hibernatepage.HPage;
import com.lovetravel.sys.account.entity.BkAccount;
import com.lovetravel.sys.account.service.BkAccountService;

/**
 * 用户Controller
 * 
 * @author yourName
 * @version 2015-6-19
 */
@Controller
@RequestMapping("${path}/account")
public class BkAccountController extends BaseController {

	@Autowired
	private BkAccountService accountService;

	@RequestMapping("list")
	public String findbkAccountList(BkAccount account, int pageNum, HttpServletRequest request) {
		List<BkAccount> list = accountService.findPageList(account, true, new HPage<BkAccount>(pageNum));
		request.setAttribute("userList", list);
		return "bkAccount/bkAccountList";
	}
}
