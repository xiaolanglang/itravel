package com.itravel.modules.home.service;

import org.springframework.stereotype.Service;

import com.bkweb.common.service.impl.CrudService;
import com.itravel.modules.home.dao.HomeDao;
import com.itravel.modules.home.entity.Home;

@Service
public class HomeService extends CrudService<HomeDao, Home> {

}
