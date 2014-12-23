//package com.shinowit.actions;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import com.opensymphony.xwork2.ActionSupport;
//import com.shinowit.blog.impl.BlogDetailsImpl;
//import com.shinowit.blog.model.Articles;
//
//public class BlogDetailsAction extends ActionSupport {
//
//	private static final long serialVersionUID = 1L;
//
//	@Resource
//	private BlogDetailsImpl  details;
//
//	private Articles articles;
//
//	private List<Articles> articleList;
//
//	public String execute(){
//
//		articleList=details.queryForArticleDetails(articles.getArticleId());
//		return SUCCESS;
//	}
//
//	public Articles getArticles() {
//		return articles;
//	}
//	public void setArticles(Articles articles) {
//		this.articles = articles;
//	}
//
//	public List<Articles> getArticleList() {
//		return articleList;
//	}
//
//	public void setArticleList(List<Articles> articleList) {
//		this.articleList = articleList;
//	}
//}
