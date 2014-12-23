package com.shinowit.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by daihui on 2014/10/18.
 */
@Entity
@Table(name = "t_friends")
public class TFriendsEntity {
    private int id;
    private TUserinfoEntity tUserinfoByUserId;
    private TUserinfoEntity tUserinfoByFriendId;
    private Collection<TMessageEntity> tMessagesById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TFriendsEntity that = (TFriendsEntity) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
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
    @JoinColumn(name = "friend_id", referencedColumnName = "user_Id")
    public TUserinfoEntity gettUserinfoByFriendId() {
        return tUserinfoByFriendId;
    }

    public void settUserinfoByFriendId(TUserinfoEntity tUserinfoByFriendId) {
        this.tUserinfoByFriendId = tUserinfoByFriendId;
    }

    @OneToMany(mappedBy = "tFriendsById")
    public Collection<TMessageEntity> gettMessagesById() {
        return tMessagesById;
    }

    public void settMessagesById(Collection<TMessageEntity> tMessagesById) {
        this.tMessagesById = tMessagesById;
    }
}
