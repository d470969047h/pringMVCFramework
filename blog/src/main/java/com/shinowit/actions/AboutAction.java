/*
package com.shinowit.actions;
import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.blog.impl.AboutImpl;
import com.shinowit.blog.impl.SidebarImple;
import com.shinowit.blog.model.About;
import com.shinowit.blog.model.ArticleCategory;
import com.shinowit.blog.model.Articles;

public class AboutAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private About about;
	List<ArticleCategory> artcList;
	List<Articles> articleList;
	
	public List<Articles> getArticleList() {
		return articleList;
	}
	public void setArticleList(List<Articles> articleList) {
		this.articleList = articleList;
	}
	public List<ArticleCategory> getArtcList() {
		return artcList;
	}
	public void setArtcList(List<ArticleCategory> artcList) {
		this.artcList = artcList;
	}
	public About getAbout() {
		return about;
	}
	public void setAbout(About about) {
		this.about = about;
	}

	@Resource
	private AboutImpl aimpl;
	@Resource
	private SidebarImple sideArtc;
	
	public String execute(){
		about=aimpl.queryForId(1);
		artcList = sideArtc.queryCategoryList("select * from t_articles_category");//查询文章分类
		articleList = sideArtc.queryArticlesList("select * from t_articles limit 0,3");
		return SUCCESS;
	}
}
*/
