package com.shinowit.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.entity.CityEntity;
import com.shinowit.framework.dao.BaseDAO;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by daihui on 2014/10/23.
*/
public class GridAction extends ActionSupport{

    @Resource
    private BaseDAO<CityEntity> cityDAO;

    private List<CityEntity> gridList;

    private int rowCount;

    private int limit;

    private int page;

    public String queryCity(){
        gridList=cityDAO.queryForPage("from CityEntity",page,limit);                //Hql,第几页，每页几条
        setRowCount(cityDAO.queryRecordCount("select count(*) from CityEntity"));
        return SUCCESS;
    }

    public List<CityEntity> getGridList() {
        return gridList;
    }

    public void setGridList(List<CityEntity> gridList) {
        this.gridList = gridList;
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

}
