package com.shinowit.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by daihui on 2014/10/18.
 */
@Entity
@Table(name = "t_label")
public class TLabelEntity {
    private int labelId;
    private String labelName;
    private Collection<TArticlesEntity> tArticlesesByLabelId;

    @Id
    @Column(name = "label_id")
    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    @Basic
    @Column(name = "label_name")
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TLabelEntity that = (TLabelEntity) o;

        if (labelId != that.labelId) return false;
        if (labelName != null ? !labelName.equals(that.labelName) : that.labelName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = labelId;
        result = 31 * result + (labelName != null ? labelName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tLabelByLabelId")
    public Collection<TArticlesEntity> gettArticlesesByLabelId() {
        return tArticlesesByLabelId;
    }

    public void settArticlesesByLabelId(Collection<TArticlesEntity> tArticlesesByLabelId) {
        this.tArticlesesByLabelId = tArticlesesByLabelId;
    }
}
