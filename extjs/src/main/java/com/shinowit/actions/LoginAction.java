package com.shinowit.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.entity.UserEntity;
import com.shinowit.framework.dao.BaseDAO;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/10/22.
 */
public class LoginAction extends ActionSupport {

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isSuccess() {

        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private boolean success;

    private boolean state;

    private  String message;

    private UserEntity userInfo;

    private List<UserEntity> userList;

    @Resource
    private BaseDAO<UserEntity> userDAO;



    public String login(){
        if(userInfo.getUserName()==null||userInfo.getUserPass()==null){
            setState(false);
            setSuccess(false);
            setMessage("用户名或密码不能空！");
            return "ok";
        }
        userList=userDAO.findByExample(UserEntity.class,userInfo);
        if(userList.size()>0){
            setState(true);
            setSuccess(true);
            setMessage("登陆成功！");
            return "ok";
        }
        else{
            setState(false);
            setSuccess(false);
            setMessage("账号或密码错误！");
            return "ok";
        }

    }

    public UserEntity getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserEntity userInfo) {
        this.userInfo = userInfo;
    }

    public List<UserEntity> getUserList() {
        return userList;
    }

    public void setUserList(List<UserEntity> userList) {
        this.userList = userList;
    }

}
