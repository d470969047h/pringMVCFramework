package com.shinowit.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.entity.CityEntity;
import com.shinowit.framework.dao.BaseDAO;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by daihui on 2014/10/29.
 */
public class CityQueryAction extends ActionSupport {

    @Resource
    private BaseDAO<CityEntity> cityDAO;

    private List<CityEntity> cityList;

    private String param;

    private String cityIdName;

    private int rowCount;

    private int limit;

    private int page;

    public String queryCity() {

        if ((null != param) && (param.trim().length() > 0) || (null != cityIdName) && (cityIdName.trim().length() > 0)) {
            try {
                byte[] paramStr = param.getBytes("ISO-8859-1");
                param = new String(paramStr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            cityList = cityDAO.queryForPage("FROM CityEntity ct WHERE ct.cityName LIKE \'%" + param + "%\' AND ct.cityId LIKE \'%" + cityIdName + "%\'", page, limit);
            rowCount = cityDAO.queryRecordCount("SELECT COUNT(*) FROM CityEntity ct WHERE ct.cityName LIKE \'%" + param + "%\' AND ct.cityId LIKE \'%" + cityIdName + "%\'");
            return SUCCESS;
        }
        else {
            cityList = cityDAO.queryForPage("FROM CityEntity", page, limit);                //Hql,第几页，每页几条
            rowCount = cityDAO.queryRecordCount("SELECT count(*) FROM CityEntity");
            return SUCCESS;
        }
    }


    public List<CityEntity> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityEntity> cityList) {
        this.cityList = cityList;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getCityIdName() {
        return cityIdName;
    }

    public void setCityIdName(String cityIdName) {
        this.cityIdName = cityIdName;
    }
}
