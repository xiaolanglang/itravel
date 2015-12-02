/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.lovetravel.common.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;

import com.lovetravel.common.dao.interfaces.ICrudDao;
import com.lovetravel.common.entity.DataEntity;
import com.lovetravel.common.utils.hibernatepage.HPage;

/**
 * DAO支持类实现，通用增删改差<br>
 * 1、基于Criteria的分页查询，主要是为了获得总记录数 <br>
 * 2、基于Criteria的条件查询，可以使用抓取进行联表查询<br>
 * 3、使用原生态sql语句进行字段较多，sql语句结构较复杂的查询，这里条语句应该是可以放在配置文件中的，暂时不讨论<br>
 * 4、这个地方没有使用到hql的查询方式
 * 
 * <!-- Hibernate只会缓存对象的简单属性的值, 要缓存集合属性,必须在集合元素中也加入<cache>子元素
 * 而Hibernate仅仅是把与当前持久对象关联的对象的OID存放到缓存中。 如果希望把整个关联的对象的所有数据都存入缓存,
 * 则要在相应关联的对象的映射文件中配置<cache>元素 -->
 * 
 * 
 * @author ThinkGem
 * @version 2014-05-16
 * @param <T>
 */
public abstract class CrudDao<T extends DataEntity<T>> implements ICrudDao<T> {

	@Autowired
	protected SessionFactory sessionFactory;

	protected Session session;

	protected Session getSession() {
		// 事务必须是开启的(Required)，否则获取不到
		return sessionFactory.getCurrentSession();
	}

	protected Criteria getCriteria(Class<?> clz) {
		return getSession().createCriteria(clz);
	}

	@Override
	public void evict(T model) {
		getSession().evict(model);
	}

	@Override
	public void flush() {
		getSession().flush();
	}

	@Override
	public void clear() {
		getSession().clear();
	}

	/**
	 * 获取单条数据
	 * 
	 * @param entity
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T get(T entity, String... batchTable) {
		return (T) getSession().get(entity.getClass(), entity.getId());
	}

	public List<T> findPageList(T entity, boolean cacheable, HPage<T> page) {
		Criteria criteria = getCriteria(entity.getClass());// .setFirstResult(0).setMaxResults(10);

		criteria.setCacheable(cacheable);// 一级缓存()

		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.count("id"));
		criteria.setProjection(projList);
		Long count = (Long) criteria.uniqueResult();
		int pageSize = page.getPageSize();
		page.setPages(count.intValue() / pageSize);
		criteria.setProjection(null).setFirstResult((page.getPageNum() - 1) * pageSize).setMaxResults(pageSize);
		@SuppressWarnings("unchecked")
		List<T> list = criteria.list();
		page.setList(list);
		return list;
	}

	public List<T> findList(T entity, boolean cacheable, String... batchTable) {
		Criteria criteria = getCriteria(entity.getClass());
		// Criterion c1 = Restrictions.like("card", "%2%");
		// criteria.add(c1);
		// Criterion c2 = Restrictions.eq("sex", null);
		// criteria.add(c2);
		if (batchTable.length > 0) {
			for (int i = 0, l = batchTable.length; i < l; i++) {
				criteria.setFetchMode(batchTable[0], FetchMode.JOIN);
			}
		}

		@SuppressWarnings("unchecked")
		List<T> list = criteria.setCacheable(cacheable).list();

		return list;
	}

	/**
	 * 插入数据
	 * 
	 * @param entity
	 * @return
	 */
	public void save(T entity) {
		getSession().save(entity);
	}

	/**
	 * 更新数据
	 * 
	 * @param entity
	 * @return
	 */
	public void update(T entity) {
		// String hql = "update " + entity.getClass().getSimpleName() +
		// " set card = '22' where id = '" + entity.getId()
		// + "'";
		// getSession().createQuery(hql).executeUpdate();
		getSession().update(entity);
	}

	/**
	 * 删除数据（一般为逻辑删除，更新del_flag字段为1）
	 * 
	 * @param entity
	 * @return
	 */
	public void delete(T entity) {
		getSession().delete(entity);
	}

	@Override
	public void falseDelete(T entity) {
		getSession().createSQLQuery("update table set del_flag = 1").executeUpdate();
	}

	public List<?> sqlQueryList(String sql, Class<?> clz, boolean cacheable) {
		return getSession().createSQLQuery(sql).addEntity(clz).setCacheable(cacheable).list();
	}
}