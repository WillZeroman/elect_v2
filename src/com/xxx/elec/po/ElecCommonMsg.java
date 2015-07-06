package com.xxx.elec.po;

import java.util.Date;

public class ElecCommonMsg {
    private String id;

    private String stationrun;

    private String devrun;

    private Date createdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStationrun() {
        return stationrun;
    }

    public void setStationrun(String stationrun) {
        this.stationrun = stationrun == null ? null : stationrun.trim();
    }

    public String getDevrun() {
        return devrun;
    }

    public void setDevrun(String devrun) {
        this.devrun = devrun == null ? null : devrun.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}