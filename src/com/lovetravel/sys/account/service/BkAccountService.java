package com.lovetravel.sys.account.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lovetravel.common.service.impl.CrudService;
import com.lovetravel.sys.account.dao.BkAccountDao;
import com.lovetravel.sys.account.entity.BkAccount;

@Service
@Transactional(readOnly = true)
public class BkAccountService extends CrudService<BkAccountDao, BkAccount> {

}
