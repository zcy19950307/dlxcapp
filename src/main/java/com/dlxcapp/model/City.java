package com.dlxcapp.model;

import javax.persistence.*;

@Table(name = "my_city")
public class City {
    @Id
    private Integer cityid;

    private Integer status;

    private Short provinceid;

    private Integer areaid;

    private String cityname;

    private String citypy;

    private Short displayorder;

    private String directory;

    private String firstletter;

    private String mappoint;

    private Integer ifhot;

    private String domain;

    private String title;

    private String keywords;

    private String description;

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

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return provinceid
     */
    public Short getProvinceid() {
        return provinceid;
    }

    /**
     * @param provinceid
     */
    public void setProvinceid(Short provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * @return areaid
     */
    public Integer getAreaid() {
        return areaid;
    }

    /**
     * @param areaid
     */
    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    /**
     * @return cityname
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * @param cityname
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    /**
     * @return citypy
     */
    public String getCitypy() {
        return citypy;
    }

    /**
     * @param citypy
     */
    public void setCitypy(String citypy) {
        this.citypy = citypy;
    }

    /**
     * @return displayorder
     */
    public Short getDisplayorder() {
        return displayorder;
    }

    /**
     * @param displayorder
     */
    public void setDisplayorder(Short displayorder) {
        this.displayorder = displayorder;
    }

    /**
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * @param directory
     */
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     * @return firstletter
     */
    public String getFirstletter() {
        return firstletter;
    }

    /**
     * @param firstletter
     */
    public void setFirstletter(String firstletter) {
        this.firstletter = firstletter;
    }

    /**
     * @return mappoint
     */
    public String getMappoint() {
        return mappoint;
    }

    /**
     * @param mappoint
     */
    public void setMappoint(String mappoint) {
        this.mappoint = mappoint;
    }

    /**
     * @return ifhot
     */
    public Integer getIfhot() {
        return ifhot;
    }

    /**
     * @param ifhot
     */
    public void setIfhot(Integer ifhot) {
        this.ifhot = ifhot;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}