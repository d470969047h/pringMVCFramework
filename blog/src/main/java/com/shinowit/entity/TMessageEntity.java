package com.shinowit.entity;

import javax.persistence.*;

/**
 * Created by daihui on 2014/10/18.
 */
@Entity
@Table(name = "t_message")
public class TMessageEntity {
    private int messageId;
    private String messageCont;
    private TFriendsEntity tFriendsById;

    @Id
    @Column(name = "message_id")
    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    @Basic
    @Column(name = "message_cont")
    public String getMessageCont() {
        return messageCont;
    }

    public void setMessageCont(String messageCont) {
        this.messageCont = messageCont;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TMessageEntity that = (TMessageEntity) o;

        if (messageId != that.messageId) return false;
        if (messageCont != null ? !messageCont.equals(that.messageCont) : that.messageCont != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = messageId;
        result = 31 * result + (messageCont != null ? messageCont.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    public TFriendsEntity gettFriendsById() {
        return tFriendsById;
    }

    public void settFriendsById(TFriendsEntity tFriendsById) {
        this.tFriendsById = tFriendsById;
    }
}
