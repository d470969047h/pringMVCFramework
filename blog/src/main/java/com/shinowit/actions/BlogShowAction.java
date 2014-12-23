package com.shinowit.actions;


import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.entity.TArticlesEntity;

import java.util.List;

public class BlogShowAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

// 当前第几页
	private int pageIndex=1;
//	// 每页几条记录
	private int pageSize = 4;
//	//总记录
	private int totalRecount;
//	//总页数
	private int pageCount;
//	//放博文信息的list
	private List<TArticlesEntity> articleList;

	@Override
    public String execute() {

		return SUCCESS;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

public int getpageSize() {
		return pageSize;
	}

	public void setpageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getTotalRecount() {
		return totalRecount;
	}

	public void setTotalRecount(int totalRecount) {
		this.totalRecount = totalRecount;
	}
}
