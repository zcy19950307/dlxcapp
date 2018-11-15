package com.dlxcapp.model;

import javax.persistence.*;

@Table(name = "my_area")
public class Area {
    @Id
    private Integer areaid;

    private String areaname;

    private Integer cityid;

    private Short displayorder;

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
     * @return areaname
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * @param areaname
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname;
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
}