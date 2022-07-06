package com.xk.domain;

public class Student {
    /*定义属性，目前要求是属性名和列名一样*/
    private Integer id;
    private  String xuehao;
    private  String uname;
    private  String usex;
    private  String zhuanye;
    private  String tupian;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", xuehao='" + xuehao + '\'' +
                ", uname='" + uname + '\'' +
                ", usex='" + usex + '\'' +
                ", zhuanye='" + zhuanye + '\'' +
                ", tupian='" + tupian + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public String getTupian() {
        return tupian;
    }

    public void setTupian(String tupian) {
        this.tupian = tupian;
    }
}
