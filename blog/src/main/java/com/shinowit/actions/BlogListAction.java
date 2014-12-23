//package com.shinowit.actions;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import com.opensymphony.xwork2.ActionSupport;
//import com.shinowit.blog.impl.BlogListImpl;
//import com.shinowit.blog.model.Articles;
//
//public class BlogListAction extends ActionSupport {
//
//	private static final long serialVersionUID = 1L;
//
//	@Resource
//	BlogListImpl blogList;
//	//每页大小
//	private int pageSize=2;
//
//	// 当前第几页
//	private int pageIndex=1;
//
//	//总记录
//	private int totalRecount=0;
//
//	//总页数
//	private int pageCount=0;
//
//	//一个list
//	private List<Articles> articles;
//
//	public String execute(){
//
//		articles=blogList.queryForArticleList(pageIndex, pageSize);
//
//		//总记录
//		totalRecount=blogList.queryTotalNum();
//
//		pageCount=totalRecount/pageSize;
//
//		if(totalRecount%pageSize>0){
//			pageCount++;
//		}
//		return SUCCESS;
//	}
//	public int getPageSize() {
//		return pageSize;
//	}
//	public void setPageSize(int pageSize) {
//		this.pageSize = pageSize;
//	}
//	public int getPageIndex() {
//		return pageIndex;
//	}
//	public void setPageIndex(int pageIndex) {
//		this.pageIndex = pageIndex;
//	}
//	public int getTotalRecount() {
//		return totalRecount;
//	}
//	public void setTotalRecount(int totalRecount) {
//		this.totalRecount = totalRecount;
//	}
//	public int getPageCount() {
//		return pageCount;
//	}
//	public void setPageCount(int pageCount) {
//		this.pageCount = pageCount;
//	}
//	public List<Articles> getArticles() {
//		return articles;
//	}
//	public void setArticles(List<Articles> articles) {
//		this.articles = articles;
//	}
//}
