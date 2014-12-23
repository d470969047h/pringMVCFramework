//package com.shinowit.actions;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.apache.struts2.ServletActionContext;
//
//import com.opensymphony.xwork2.ActionSupport;
//import com.shinowit.blog.dao.UserInfoDAO;
//import com.shinowit.blog.model.UserInfo;
//
//public class IndexAction extends ActionSupport{
//
//	private static final long serialVersionUID = 1L;
//
//	HttpServletRequest request=ServletActionContext.getRequest();
//	HttpServletResponse response=ServletActionContext.getResponse();
//	HttpSession session=request.getSession();
//
//	private UserInfo user;
//	@Resource
//	private UserInfoDAO userDao ;
//
//	public String execute(){
//		return SUCCESS;
//	}
//
//	public String login(){
//		UserInfo datauser=new UserInfo();
//		if(null == user.getUserName()){
//			addFieldError("userName", "用户名不能为空");
//		}
//		if(null == user.getUserPass()){
//			addFieldError("userPass", "密码不能为空");
//		}
//
//		datauser = userDao.queryOne(user.getUserName());
//		if(null == datauser){
//				addFieldError("userpass", "用户名或密码错误");
//				return"input";
//		}if(user.getUserName().equals(datauser.getUserName())){
//			session.setAttribute("user", datauser);
//			return "ok";
//			}
//		addFieldError("userpass", "用户名或密码错误");
//		return "input";
//	}
//
//	public UserInfo getUser() {
//		return user;
//	}
//	public void setUser(UserInfo user) {
//		this.user = user;
//	}
//}
