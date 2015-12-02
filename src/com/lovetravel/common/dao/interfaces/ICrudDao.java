/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.lovetravel.common.dao.interfaces;

import java.util.List;

import com.lovetravel.common.utils.hibernatepage.HPage;

/**
 * DAO支持类实现
 * 
 * @author ThinkGem
 * @version 2014-05-16
 * @param <T>
 */
public interface ICrudDao<T> {

	/**
	 * 清除缓存中对应的对象，使对象变为托管态
	 * 
	 * @param model
	 */
	public void evict(T model);

	/**
	 * 强制缓存中所有对象与数据库数据同步
	 */
	public void flush();

	/**
	 * 强制刷新一级缓存中所有的对象
	 */
	public void clear();

	/**
	 * 获取单条数据
	 * 
	 * @param entity
	 * @param batchTable
	 * 
	 * @return
	 */
	public T get(T entity, String... batchTable);

	/**
	 * 分业查询数据列表
	 * 
	 * @param entity
	 * @param cacheable
	 *            是否启用缓存<br>
	 *            true:可以使用一级缓存，如果配置了二级缓存也可以使用二级缓存<br>
	 *            false:没有任何缓存
	 * @param page
	 *            分页对象
	 * @return
	 */
	public List<T> findPageList(T entity, boolean cacheable, HPage<T> page);

	/**
	 * 条件查询所有数据
	 * 
	 * @param entity
	 * 
	 * @param cacheable
	 *            是否启用缓存<br>
	 *            true:可以使用一级缓存，如果配置了二级缓存也可以使用二级缓存<br>
	 *            false:没有任何缓存
	 * @param batchTable
	 *            表对象
	 * @return
	 */
	public List<T> findList(T entity, boolean cacheable, String... batchTable);

	/**
	 * 一张表中的字段很多，但是只需要其中几个字段的时候，可以用这种查询方式
	 * 
	 * @param sql
	 *            sql语句
	 * @param clz
	 *            映射对象
	 * @param cacheable
	 *            是否启用缓存<br>
	 *            true:可以使用一级缓存，如果配置了二级缓存也可以使用二级缓存<br>
	 *            false:没有任何缓存
	 * @return
	 */
	public List<?> sqlQueryList(String sql, Class<?> clz, boolean cacheable);

	/**
	 * 插入数据
	 * 
	 * @param entity
	 * @return
	 */
	public void save(T entity);

	/**
	 * 更新数据
	 * 
	 * @param entity
	 * @return
	 */
	public void update(T entity);

	/**
	 * 根据ID，删除数据(真删除)
	 * 
	 * @param entity
	 * @return
	 */
	public void delete(T entity);

	/**
	 * 根据ID，删除数据(假删)
	 * 
	 * @param entity
	 */
	public void falseDelete(T entity);

}