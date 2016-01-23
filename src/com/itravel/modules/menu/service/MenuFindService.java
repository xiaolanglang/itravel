package com.itravel.modules.menu.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bkweb.modules.menu.service.CMenuFindService;

@Service
@Transactional(readOnly = true)
public class MenuFindService extends CMenuFindService {

}
