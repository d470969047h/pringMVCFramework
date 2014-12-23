//package com.shinowit.actions;
//
//
//import java.util.List;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.apache.struts2.ServletActionContext;
//import org.springframework.stereotype.Repository;
//
//import com.opensymphony.xwork2.ActionSupport;
//import com.shinowit.blog.impl.FriendsImpl;
//import com.shinowit.blog.model.Friends;
//import com.shinowit.blog.model.UserInfo;
//
//@Repository
//public class FriendsAction extends ActionSupport{
////	HttpServletRequest request=ServletActionContext.getRequest();
////	HttpServletResponse response=ServletActionContext.getResponse();
////	HttpSession session=request.getSession();
//
//	private static final long serialVersionUID = 1L;
//
//
//	@Resource
//	private FriendsImpl fim;	//调用方法
//
//	private UserInfo user;	//接受session传来的user
//
//	private List<Friends> flist;	//接受查询出来的Friends集合
//
//
//	//set get 方法
//
//
//	public UserInfo getUser() {
//		return user;
//	}
//
//	public void setUser(UserInfo user) {
//		this.user = user;
//	}
//
//	public List<Friends> getFlist() {
//		return flist;
//	}
//
//	public void setFlist(List<Friends> flist) {
//		this.flist = flist;
//	}
//
//	public String execute(){
////		user=(UserInfo)session.getAttribute("user");
////		user.getUserId();
//		flist=fim.queryAll(2);
//		return SUCCESS;
//	}
//
//}
