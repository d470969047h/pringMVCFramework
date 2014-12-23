package com.shinowit.entity;

import javax.persistence.*;

/**
 * Created by daihui on 2014/10/18.
 */
@Entity
@Table(name = "t_about")
public class TAboutEntity {
    private int aboutId;
    private String aboutContent;

    @Id
    @Column(name = "about_id")
    public int getAboutId() {
        return aboutId;
    }

    public void setAboutId(int aboutId) {
        this.aboutId = aboutId;
    }

    @Basic
    @Column(name = "about_content")
    public String getAboutContent() {
        return aboutContent;
    }

    public void setAboutContent(String aboutContent) {
        this.aboutContent = aboutContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TAboutEntity that = (TAboutEntity) o;

        if (aboutId != that.aboutId) return false;
        if (aboutContent != null ? !aboutContent.equals(that.aboutContent) : that.aboutContent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aboutId;
        result = 31 * result + (aboutContent != null ? aboutContent.hashCode() : 0);
        return result;
    }
}
