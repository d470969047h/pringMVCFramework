package com.shinowit.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by daihui on 2014/10/18.
 */
@Entity
@Table(name = "t_articles")
public class TArticlesEntity {
    private int articleId;
    private String articleTitle;
    private String articleContent;
    private Timestamp articlePostTime;
    private TLabelEntity tLabelByLabelId;
    private TUserinfoEntity tUserinfoByUserId;
    private TArticlesCategoryEntity tArticlesCategoryByCategoryId;

    @Id
    @Column(name = "article_id")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "article_title")
    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    @Basic
    @Column(name = "article_content")
    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Basic
    @Column(name = "article_post_time")
    public Timestamp getArticlePostTime() {
        return articlePostTime;
    }

    public void setArticlePostTime(Timestamp articlePostTime) {
        this.articlePostTime = articlePostTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TArticlesEntity that = (TArticlesEntity) o;

        if (articleId != that.articleId) return false;
        if (articleContent != null ? !articleContent.equals(that.articleContent) : that.articleContent != null)
            return false;
        if (articlePostTime != null ? !articlePostTime.equals(that.articlePostTime) : that.articlePostTime != null)
            return false;
        if (articleTitle != null ? !articleTitle.equals(that.articleTitle) : that.articleTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + (articleTitle != null ? articleTitle.hashCode() : 0);
        result = 31 * result + (articleContent != null ? articleContent.hashCode() : 0);
        result = 31 * result + (articlePostTime != null ? articlePostTime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "label_id", referencedColumnName = "label_id")
    public TLabelEntity gettLabelByLabelId() {
        return tLabelByLabelId;
    }

    public void settLabelByLabelId(TLabelEntity tLabelByLabelId) {
        this.tLabelByLabelId = tLabelByLabelId;
    }

    @ManyToOne
    @JoinColumn(name = "user_Id", referencedColumnName = "user_Id")
    public TUserinfoEntity gettUserinfoByUserId() {
        return tUserinfoByUserId;
    }

    public void settUserinfoByUserId(TUserinfoEntity tUserinfoByUserId) {
        this.tUserinfoByUserId = tUserinfoByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    public TArticlesCategoryEntity gettArticlesCategoryByCategoryId() {
        return tArticlesCategoryByCategoryId;
    }

    public void settArticlesCategoryByCategoryId(TArticlesCategoryEntity tArticlesCategoryByCategoryId) {
        this.tArticlesCategoryByCategoryId = tArticlesCategoryByCategoryId;
    }
}
