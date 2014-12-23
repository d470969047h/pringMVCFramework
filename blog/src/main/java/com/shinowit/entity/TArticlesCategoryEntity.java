package com.shinowit.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by daihui on 2014/10/18.
 */
@Entity
@Table(name = "t_articles_category")
public class TArticlesCategoryEntity {
    private int categoryId;
    private String categoryName;
    private Collection<TArticlesEntity> tArticlesesByCategoryId;

    @Id
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TArticlesCategoryEntity that = (TArticlesCategoryEntity) o;

        if (categoryId != that.categoryId) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tArticlesCategoryByCategoryId")
    public Collection<TArticlesEntity> gettArticlesesByCategoryId() {
        return tArticlesesByCategoryId;
    }

    public void settArticlesesByCategoryId(Collection<TArticlesEntity> tArticlesesByCategoryId) {
        this.tArticlesesByCategoryId = tArticlesesByCategoryId;
    }
}
