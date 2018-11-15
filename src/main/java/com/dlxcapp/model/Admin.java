package com.dlxcapp.model;

import javax.persistence.*;

@Table(name = "my_admin")
public class Admin {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String userid;

    private String pwd;

    private String uname;

    private String tname;

    private String email;

    private Short typeid;

    private Integer logintime;

    private String loginip;

    private Integer cityid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * @return uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * @return tname
     */
    public String getTname() {
        return tname;
    }

    /**
     * @param tname
     */
    public void setTname(String tname) {
        this.tname = tname;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return typeid
     */
    public Short getTypeid() {
        return typeid;
    }

    /**
     * @param typeid
     */
    public void setTypeid(Short typeid) {
        this.typeid = typeid;
    }

    /**
     * @return logintime
     */
    public Integer getLogintime() {
        return logintime;
    }

    /**
     * @param logintime
     */
    public void setLogintime(Integer logintime) {
        this.logintime = logintime;
    }

    /**
     * @return loginip
     */
    public String getLoginip() {
        return loginip;
    }

    /**
     * @param loginip
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    /**
     * @return cityid
     */
    public Integer getCityid() {
        return cityid;
    }

    /**
     * @param cityid
     */
    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }
}