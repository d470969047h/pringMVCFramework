package com.shinowit.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.entity.TitleEntity;
import com.shinowit.framework.dao.BaseDAO;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by daihui on 2014/10/26.
 */
public class MainAction extends ActionSupport{

    @Resource
    private BaseDAO<TitleEntity> titleDAO;

    private List<TitleEntity> titleList;

    private TitleEntity title;

    public TitleEntity getTitle() {
        return title;
    }

    public void setTitle(TitleEntity title) {
        this.title = title;
    }

    public List<TitleEntity> getTitleList() {

        return titleList;
    }

    public void setTitleList(List<TitleEntity> titleList) {
        this.titleList = titleList;
    }


    public String queryJSON(){
        titleList=titleDAO.listAll(TitleEntity.class);
//        for(TitleEntity te:titleList){
//            System.out.println(te.getTitle());
//        }
        return "ok";
    }

}
