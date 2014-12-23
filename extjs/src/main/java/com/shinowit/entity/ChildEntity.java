package com.shinowit.entity;

import javax.persistence.*;

/**
 * Created by daihui on 2014/10/27.
 */
@Entity
@Table(name = "child")
public class ChildEntity {
    private int childId;
    private String name;
    private String src;
    private String remark;
    private String tag;
    private String model;
    private TitleEntity titleByTitleId;

    @Id
    @Column(name = "child_id")
    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "src")
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Basic
    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChildEntity that = (ChildEntity) o;

        if (childId != that.childId) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (src != null ? !src.equals(that.src) : that.src != null) return false;
        if (tag != null ? !tag.equals(that.tag) : that.tag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = childId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (src != null ? src.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "title_id", referencedColumnName = "title_id")
    public TitleEntity getTitleByTitleId() {
        return titleByTitleId;
    }

    public void setTitleByTitleId(TitleEntity titleByTitleId) {
        this.titleByTitleId = titleByTitleId;
    }
}
