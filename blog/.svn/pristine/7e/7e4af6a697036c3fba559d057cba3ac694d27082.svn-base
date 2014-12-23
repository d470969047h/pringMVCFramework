package com.shinowit.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by daihui on 2014/10/18.
 */
@Entity
@Table(name = "t_school")
public class TSchoolEntity {
    private int schoolId;
    private String schoolName;
    private Collection<TUserinfoEntity> tUserinfosBySchoolId;

    @Id
    @Column(name = "school_ID")
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "school_name")
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TSchoolEntity that = (TSchoolEntity) o;

        if (schoolId != that.schoolId) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolId;
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tSchoolBySchoolId")
    public Collection<TUserinfoEntity> gettUserinfosBySchoolId() {
        return tUserinfosBySchoolId;
    }

    public void settUserinfosBySchoolId(Collection<TUserinfoEntity> tUserinfosBySchoolId) {
        this.tUserinfosBySchoolId = tUserinfosBySchoolId;
    }
}
