package com.lovetravel.common.utils.hibernatepage;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.lovetravel.common.config.Global;

public class HPage<T> {
	/**
	 * 当前页数
	 */
	private int pageNum;

	/**
	 * 每页大小
	 */
	private int pageSize;

	/**
	 * 总页数
	 */
	private int pages;

	/**
	 * 查询数据
	 */
	private List<T> list;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public HPage(int pageNum) {
		this.pageNum = pageNum;
		this.pageSize = Global.getPageSize();

	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	@Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
