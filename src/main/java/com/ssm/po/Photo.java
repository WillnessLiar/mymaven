package com.ssm.po;

public class Photo {

    private Integer pid;
    private String pdata;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPdata() {
        return pdata;
    }

    public void setPdata(String pdata) {
        this.pdata = pdata;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "pid=" + pid +
                ", pdata='" + pdata + '\'' +
                '}';
    }
}
