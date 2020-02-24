package com.ssm.po;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Viewer implements Serializable {
//    private static final long serialVersionUID = 8841433872811285796L;
    @NotNull(message = "名字为空！！！") //非空校验
    @Length(min = 1, max = 20)
    private String vname;
    @NotNull(message = "邮箱为空！！！")
    @Length(min = 1, max = 30)
    private String vemail;
    @NotEmpty(message = "电话号码为空！！！")  //字符串非空校验，NotBlank去收尾空格
    @Length(min = 1, max = 13)
    private String vphone;
    @NotEmpty(message = "信息为空！！！")  //字符串非空校验，NotBlank去收尾空格
    @Length(min = 1, max = 500)
    private String vmessage;

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getVemail() {
        return vemail;
    }

    public void setVemail(String vemail) {
        this.vemail = vemail;
    }

    public String getVphone() {
        return vphone;
    }

    public void setVphone(String vphone) {
        this.vphone = vphone;
    }

    public String getVmessage() {
        return vmessage;
    }

    public void setVmessage(String vmessage) {
        this.vmessage = vmessage;
    }

    @Override
    public String toString() {
        return "Viewer{" +
                "vname='" + vname + '\'' +
                ", vemail='" + vemail + '\'' +
                ", vphone='" + vphone + '\'' +
                ", vmessage='" + vmessage + '\'' +
                '}';
    }
}
