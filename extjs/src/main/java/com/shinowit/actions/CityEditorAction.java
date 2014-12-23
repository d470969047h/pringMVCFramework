package com.shinowit.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.entity.CityEntity;
import com.shinowit.framework.dao.BaseDAO;

import javax.annotation.Resource;


/**
 * Created by daihui on 2014/10/23.
 */
public class CityEditorAction extends ActionSupport {

    @Resource
    private BaseDAO<CityEntity> cityDAO;

    private CityEntity cityInfo;

    private String message;

    private boolean success;

    public String addCity(){
        Object obj=cityDAO.insert(cityInfo);
        if(null!=obj){
            setSuccess(true);
            setMessage("添加数据成功!");
        }
        else{
            setSuccess(false);
            setMessage("添加数据失败!");
        }
        return "ok";
    }

    public CityEntity getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityEntity cityInfo) {
        this.cityInfo = cityInfo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
