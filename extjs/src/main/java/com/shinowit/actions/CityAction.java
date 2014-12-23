package com.shinowit.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.entity.City;

import java.util.ArrayList;
import java.util.List;

public class CityAction extends ActionSupport {
    //����ID
    private String paramId;

    private List<City> sheng;
    private List<City> shi;
    private List<City> qu;

    public String sheng() {
        City c1 = new City(100, "����");
        City c2 = new City(200, "ɽ��");
        sheng = new ArrayList<City>();
        sheng.add(c1);
        sheng.add(c2);
        return SUCCESS;
    }

    public String shi() {
        if (paramId.equals("100")) {
            City c1 = new City(110, "��Ͻ��");
            City c2 = new City(120, "��Ͻ��");
            shi = new ArrayList<City>();
            shi.add(c1);
            shi.add(c2);
        } else if (paramId.equals("200")) {
            City c1 = new City(210, "������");
            City c2 = new City(220, "������");
            shi = new ArrayList<City>();
            shi.add(c1);
            shi.add(c2);
        }

        return SUCCESS;
    }

    public String qu() {
        if (paramId.equals("110")) {
            City c1 = new City(111, "������");
            City c2 = new City(112, "��ƽ��");
            qu = new ArrayList<City>();
            qu.add(c1);
            qu.add(c2);
        } else if (paramId.equals("120")) {
            City c1 = new City(121, "������");
            City c2 = new City(122, "��ɽ��");
            qu = new ArrayList<City>();
            qu.add(c1);
            qu.add(c2);
        } else if (paramId.equals("210")) {
            City c1 = new City(211, "�̺�");
            City c2 = new City(212, "����");
            qu = new ArrayList<City>();
            qu.add(c1);
            qu.add(c2);
        } else if (paramId.equals("220")) {
            City c1 = new City(221, "մ��");
            City c2 = new City(222, "����");
            qu = new ArrayList<City>();
            qu.add(c1);
            qu.add(c2);
        }
        return SUCCESS;
    }


    public List<City> getSheng() {
        return sheng;
    }

    public void setSheng(List<City> sheng) {
        this.sheng = sheng;
    }

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    public List<City> getShi() {
        return shi;
    }

    public void setShi(List<City> shi) {
        this.shi = shi;
    }

    public List<City> getQu() {
        return qu;
    }

    public void setQu(List<City> qu) {
        this.qu = qu;
    }
}
