package com.shinowit.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.entity.TSchoolEntity;
import com.shinowit.entity.TSexEntity;
import com.shinowit.entity.TUserinfoEntity;
import com.shinowit.framework.dao.BaseDAO;

import javax.annotation.Resource;
import java.util.List;

public class RegAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private List<TSexEntity>  sexList;

    private TUserinfoEntity user;

    private List<TSchoolEntity> schoolList;

    @Resource
    private BaseDAO regDAO;

    private String validcode;

    //注册
    public String reg() {
        if (null == user.getUserName() || user.getUserName().length() == 0) {
            this.addFieldError("user.userName","用户名不能空!");
        }

        if (null == user.getUserPass() || user.getUserPass().length() == 0) {
            this.addFieldError("user.userPass","密码不能空！");
        }
        if (this.hasErrors() == true) {// 如果有ActionError或者FieldError,这个方法就会返回true
            return querySchool();
        }
        regDAO.insert(user);
        return SUCCESS;
    }
    //查询性别
    public String querySex(){
        sexList=regDAO.listAll(TSexEntity.class);
        return "query";
    }
    //查询学校
    public String querySchool(){
        schoolList=regDAO.listAll(TSchoolEntity.class);
    return querySex();
    }


    public String getValidcode() {
        return validcode;
    }

    public void setValidcode(String validcode) {
        this.validcode = validcode;
    }

    public TUserinfoEntity getUser() {
        return user;
    }

    public void setUser(TUserinfoEntity user) {
        this.user = user;
    }
    public List<TSexEntity> getSexList() {
        return sexList;
    }

    public void setSexList(List<TSexEntity> sexList) {
        this.sexList = sexList;
    }
    public List<TSchoolEntity> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<TSchoolEntity> schoolList) {
        this.schoolList = schoolList;
    }
}
