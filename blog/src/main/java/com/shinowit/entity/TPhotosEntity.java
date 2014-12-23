package com.shinowit.entity;

import javax.persistence.*;

/**
 * Created by daihui on 2014/10/18.
 */
@Entity
@Table(name = "t_photos")
public class TPhotosEntity {
    private int photoId;
    private String photoName;
    private String storePath;
    private String photoInfo;
    private TPhotoAlbumEntity tPhotoAlbumByPhotoAlbumId;

    @Id
    @Column(name = "photo_id")
    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    @Basic
    @Column(name = "photo_name")
    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    @Basic
    @Column(name = "store_path")
    public String getStorePath() {
        return storePath;
    }

    public void setStorePath(String storePath) {
        this.storePath = storePath;
    }

    @Basic
    @Column(name = "photo_info")
    public String getPhotoInfo() {
        return photoInfo;
    }

    public void setPhotoInfo(String photoInfo) {
        this.photoInfo = photoInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPhotosEntity that = (TPhotosEntity) o;

        if (photoId != that.photoId) return false;
        if (photoInfo != null ? !photoInfo.equals(that.photoInfo) : that.photoInfo != null) return false;
        if (photoName != null ? !photoName.equals(that.photoName) : that.photoName != null) return false;
        if (storePath != null ? !storePath.equals(that.storePath) : that.storePath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = photoId;
        result = 31 * result + (photoName != null ? photoName.hashCode() : 0);
        result = 31 * result + (storePath != null ? storePath.hashCode() : 0);
        result = 31 * result + (photoInfo != null ? photoInfo.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "photo_album_id", referencedColumnName = "photo_album_id")
    public TPhotoAlbumEntity gettPhotoAlbumByPhotoAlbumId() {
        return tPhotoAlbumByPhotoAlbumId;
    }

    public void settPhotoAlbumByPhotoAlbumId(TPhotoAlbumEntity tPhotoAlbumByPhotoAlbumId) {
        this.tPhotoAlbumByPhotoAlbumId = tPhotoAlbumByPhotoAlbumId;
    }
}
