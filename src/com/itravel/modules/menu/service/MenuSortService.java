package com.itravel.modules.menu.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bkweb.modules.menu.entity.MenuSort;
import com.bkweb.modules.menu.service.CMenuSortService;

@Service
@Transactional(readOnly = true)
public class MenuSortService extends CMenuSortService {

	public List<MenuSort> findAllParentList() {
		return dao.findAllParentList();
	}

	public List<MenuSort> findAllSortList() {
		return dao.findAllSortList();
	}

}
