package com.shinowit.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.entity.CityEntity;
import com.shinowit.framework.dao.BaseDAO;

import javax.annotation.Resource;

/**
 * Created by daihui on 2014/10/28.
 */
public class CityDeleteAction extends ActionSupport {

    @Resource
    private BaseDAO<CityEntity> cityDAO;

    private CityEntity cityInfo;

    private String message;

    private boolean success;

    public String deleteCity(){
        boolean result=cityDAO.delete(cityInfo);
        if(true==result){
            success=true;
            setMessage("删除成功！！");
        }
        else{
            success=false;
            setMessage("删除失败！！");
        }
        return SUCCESS;
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
