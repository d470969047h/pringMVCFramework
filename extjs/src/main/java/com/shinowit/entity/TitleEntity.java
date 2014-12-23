package com.shinowit.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by daihui on 2014/10/27.
 */
@Entity
@Table(name = "title")
public class TitleEntity {
    private int titleId;
    private String title;
    private Collection<ChildEntity> childrenByTitleId;

    @Id
    @Column(name = "title_id")
    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TitleEntity that = (TitleEntity) o;

        if (titleId != that.titleId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = titleId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "titleByTitleId")
    public Collection<ChildEntity> getChildrenByTitleId() {
        return childrenByTitleId;
    }

    public void setChildrenByTitleId(Collection<ChildEntity> childrenByTitleId) {
        this.childrenByTitleId = childrenByTitleId;
    }
}
