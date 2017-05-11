package com.mbis.base.entity;

import java.util.Date;

/**
 * Created by uwayxs on 2017/5/11.
 */
public class Blog {
    private int id;
    private String bname;
    private Date createTime;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
