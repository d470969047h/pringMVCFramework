package com.shinowit.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by daihui on 2014/10/18.
 */
@Entity
@Table(name = "t_sex")
public class TSexEntity {
    private int code;
    private String sexName;
    private Collection<TUserinfoEntity> tUserinfosByCode;

    @Id
    @Column(name = "code")
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Basic
    @Column(name = "sex_name")
    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TSexEntity that = (TSexEntity) o;

        if (code != that.code) return false;
        if (sexName != null ? !sexName.equals(that.sexName) : that.sexName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code;
        result = 31 * result + (sexName != null ? sexName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tSexByCode")
    public Collection<TUserinfoEntity> gettUserinfosByCode() {
        return tUserinfosByCode;
    }

    public void settUserinfosByCode(Collection<TUserinfoEntity> tUserinfosByCode) {
        this.tUserinfosByCode = tUserinfosByCode;
    }
}
