/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.lovetravel.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lovetravel.common.dao.impl.CrudDao;
import com.lovetravel.common.entity.DataEntity;
import com.lovetravel.common.service.BaseService;
import com.lovetravel.common.service.interfaces.ICrudService;
import com.lovetravel.common.utils.hibernatepage.HPage;

/**
 * Service基类
 * 
 * @author ThinkGem
 * @version 2014-05-16
 */
@Transactional(readOnly = true)
public abstract class CrudService<D extends CrudDao<T>, T extends DataEntity<T>> extends BaseService implements
		ICrudService<T> {

	@Autowired
	protected D dao;

	@Override
	public T get(T entity, String... batchTable) {
		return dao.get(entity, batchTable);
	}

	@Override
	public List<T> findPageList(T entity, boolean cacheable, HPage<T> page) {
		return dao.findPageList(entity, cacheable, page);
	}

	@Override
	public List<T> findList(T entity, boolean cacheable, String... batchTable) {
		return dao.findList(entity, cacheable, batchTable);
	}

	@Override
	public List<?> sqlQueryList(String sql, Class<?> clz, boolean cacheable) {
		return dao.sqlQueryList(sql, clz, cacheable);
	}

	@Override
	public void save(T entity) {
	dao.save(entity);
	}

	@Override
	public void update(T entity) {
		dao.update(entity);
	}

	@Override
	public void delete(T entity) {
		dao.delete(entity);
	}

	@Override
	public void falseDelete(T entity) {
		dao.falseDelete(entity);
	}

}
