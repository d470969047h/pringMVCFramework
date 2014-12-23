package com.shinowit.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.entity.CityEntity;
import com.shinowit.framework.dao.BaseDAO;

import javax.annotation.Resource;

/**
 * Created by daihui on 2014/10/28.
 */
public class CityUpdateAction extends ActionSupport{

    @Resource
    private BaseDAO<CityEntity> cityDAO;

    private CityEntity cityInfo;

    private String message;

    private boolean success;

    public String updateCity(){
        boolean result=cityDAO.update(cityInfo);
        if(true==result){
            success=true;
            setMessage("insert success!!");

        }else {
            success=false;
            setMessage("insert failure!!");
        }
        return SUCCESS;
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

    public CityEntity getCityInfo() {

        return cityInfo;
    }

    public void setCityInfo(CityEntity cityInfo) {
        this.cityInfo = cityInfo;
    }
}
