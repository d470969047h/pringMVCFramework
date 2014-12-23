package com.shinowit.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by daihui on 2014/10/23.
 */
@Entity
@Table(name = "city")
public class CityEntity {
    private String cityId;
    private String cityName;

    @Id
    @Column(name = "city_Id")
    @GenericGenerator(name="system-uuid", strategy = "uuid") //有编译警告不用管
    @GeneratedValue(generator="system-uuid")
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "city_Name")
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity that = (CityEntity) o;

        if (cityId != that.cityId) return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;

        return true;
    }
}
