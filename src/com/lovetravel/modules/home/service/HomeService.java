package com.lovetravel.modules.home.service;

import org.springframework.stereotype.Service;

import com.lovetravel.common.service.impl.CrudService;
import com.lovetravel.modules.home.dao.HomeDao;
import com.lovetravel.modules.home.entity.Home;

@Service
public class HomeService extends CrudService<HomeDao, Home> {

}
