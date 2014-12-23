package com.shinowit.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by daihui on 2014/10/18.
 */
@Entity
@Table(name = "t_photo_album")
public class TPhotoAlbumEntity {
    private int photoAlbumId;
    private String photoAlbumName;
    private String albumInfo;
    private TUserinfoEntity tUserinfoByUserId;
    private Collection<TPhotosEntity> tPhotosesByPhotoAlbumId;

    @Id
    @Column(name = "photo_album_id")
    public int getPhotoAlbumId() {
        return photoAlbumId;
    }

    public void setPhotoAlbumId(int photoAlbumId) {
        this.photoAlbumId = photoAlbumId;
    }

    @Basic
    @Column(name = "photo_album_name")
    public String getPhotoAlbumName() {
        return photoAlbumName;
    }

    public void setPhotoAlbumName(String photoAlbumName) {
        this.photoAlbumName = photoAlbumName;
    }

    @Basic
    @Column(name = "album_info")
    public String getAlbumInfo() {
        return albumInfo;
    }

    public void setAlbumInfo(String albumInfo) {
        this.albumInfo = albumInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPhotoAlbumEntity that = (TPhotoAlbumEntity) o;

        if (photoAlbumId != that.photoAlbumId) return false;
        if (albumInfo != null ? !albumInfo.equals(that.albumInfo) : that.albumInfo != null) return false;
        if (photoAlbumName != null ? !photoAlbumName.equals(that.photoAlbumName) : that.photoAlbumName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = photoAlbumId;
        result = 31 * result + (photoAlbumName != null ? photoAlbumName.hashCode() : 0);
        result = 31 * result + (albumInfo != null ? albumInfo.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_Id", referencedColumnName = "user_Id")
    public TUserinfoEntity gettUserinfoByUserId() {
        return tUserinfoByUserId;
    }

    public void settUserinfoByUserId(TUserinfoEntity tUserinfoByUserId) {
        this.tUserinfoByUserId = tUserinfoByUserId;
    }

    @OneToMany(mappedBy = "tPhotoAlbumByPhotoAlbumId")
    public Collection<TPhotosEntity> gettPhotosesByPhotoAlbumId() {
        return tPhotosesByPhotoAlbumId;
    }

    public void settPhotosesByPhotoAlbumId(Collection<TPhotosEntity> tPhotosesByPhotoAlbumId) {
        this.tPhotosesByPhotoAlbumId = tPhotosesByPhotoAlbumId;
    }
}
