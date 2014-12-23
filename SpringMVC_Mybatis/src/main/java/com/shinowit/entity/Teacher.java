package com.shinowit.entity;

import java.io.Serializable;

public class Teacher implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.id
     *
     * @mbggenerated Tue Dec 23 15:51:33 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teaName
     *
     * @mbggenerated Tue Dec 23 15:51:33 CST 2014
     */
    private String teaname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 15:51:33 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.id
     *
     * @return the value of teacher.id
     * @mbggenerated Tue Dec 23 15:51:33 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.id
     *
     * @param id the value for teacher.id
     * @mbggenerated Tue Dec 23 15:51:33 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teaName
     *
     * @return the value of teacher.teaName
     * @mbggenerated Tue Dec 23 15:51:33 CST 2014
     */
    public String getTeaname() {
        return teaname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teaName
     *
     * @param teaname the value for teacher.teaName
     * @mbggenerated Tue Dec 23 15:51:33 CST 2014
     */
    public void setTeaname(String teaname) {
        this.teaname = teaname == null ? null : teaname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 15:51:33 CST 2014
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Teacher other = (Teacher) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getTeaname() == null ? other.getTeaname() == null : this.getTeaname().equals(other.getTeaname()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Tue Dec 23 15:51:33 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTeaname() == null) ? 0 : getTeaname().hashCode());
        return result;
    }
}