package com.shinowit.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by daihui on 2014/10/18.
 */
@Entity
@Table(name = "t_userinfo")
public class TUserinfoEntity {
    private int userId;
    private String userName;
    private String userPass;
    private String userPassQue;
    private String userPassAns;
    private Date birthday;
    private String nickName;
    private String email;
    private String address;
    private String userPhoto;
    private Collection<TArticlesEntity> tArticlesesByUserId;
    private Collection<TFriendsEntity> tFriendsesByUserId;
    private Collection<TFriendsEntity> tFriendsesByUserId_0;
    private Collection<TPhotoAlbumEntity> tPhotoAlbumsByUserId;
    private TSexEntity tSexByCode;
    private TSchoolEntity tSchoolBySchoolId;

    @Id
    @Column(name = "user_Id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_pass")
    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Basic
    @Column(name = "user_pass_que")
    public String getUserPassQue() {
        return userPassQue;
    }

    public void setUserPassQue(String userPassQue) {
        this.userPassQue = userPassQue;
    }

    @Basic
    @Column(name = "user_pass_ans")
    public String getUserPassAns() {
        return userPassAns;
    }

    public void setUserPassAns(String userPassAns) {
        this.userPassAns = userPassAns;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "nick_name")
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "user_photo")
    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUserinfoEntity that = (TUserinfoEntity) o;

        if (userId != that.userId) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (nickName != null ? !nickName.equals(that.nickName) : that.nickName != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPass != null ? !userPass.equals(that.userPass) : that.userPass != null) return false;
        if (userPassAns != null ? !userPassAns.equals(that.userPassAns) : that.userPassAns != null) return false;
        if (userPassQue != null ? !userPassQue.equals(that.userPassQue) : that.userPassQue != null) return false;
        if (userPhoto != null ? !userPhoto.equals(that.userPhoto) : that.userPhoto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPass != null ? userPass.hashCode() : 0);
        result = 31 * result + (userPassQue != null ? userPassQue.hashCode() : 0);
        result = 31 * result + (userPassAns != null ? userPassAns.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (userPhoto != null ? userPhoto.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tUserinfoByUserId")
    public Collection<TArticlesEntity> gettArticlesesByUserId() {
        return tArticlesesByUserId;
    }

    public void settArticlesesByUserId(Collection<TArticlesEntity> tArticlesesByUserId) {
        this.tArticlesesByUserId = tArticlesesByUserId;
    }

    @OneToMany(mappedBy = "tUserinfoByUserId")
    public Collection<TFriendsEntity> gettFriendsesByUserId() {
        return tFriendsesByUserId;
    }

    public void settFriendsesByUserId(Collection<TFriendsEntity> tFriendsesByUserId) {
        this.tFriendsesByUserId = tFriendsesByUserId;
    }

    @OneToMany(mappedBy = "tUserinfoByFriendId")
    public Collection<TFriendsEntity> gettFriendsesByUserId_0() {
        return tFriendsesByUserId_0;
    }

    public void settFriendsesByUserId_0(Collection<TFriendsEntity> tFriendsesByUserId_0) {
        this.tFriendsesByUserId_0 = tFriendsesByUserId_0;
    }

    @OneToMany(mappedBy = "tUserinfoByUserId")
    public Collection<TPhotoAlbumEntity> gettPhotoAlbumsByUserId() {
        return tPhotoAlbumsByUserId;
    }

    public void settPhotoAlbumsByUserId(Collection<TPhotoAlbumEntity> tPhotoAlbumsByUserId) {
        this.tPhotoAlbumsByUserId = tPhotoAlbumsByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "code", referencedColumnName = "code")
    public TSexEntity gettSexByCode() {
        return tSexByCode;
    }

    public void settSexByCode(TSexEntity tSexByCode) {
        this.tSexByCode = tSexByCode;
    }

    @ManyToOne
    @JoinColumn(name = "school_ID", referencedColumnName = "school_ID")
    public TSchoolEntity gettSchoolBySchoolId() {
        return tSchoolBySchoolId;
    }

    public void settSchoolBySchoolId(TSchoolEntity tSchoolBySchoolId) {
        this.tSchoolBySchoolId = tSchoolBySchoolId;
    }
}
