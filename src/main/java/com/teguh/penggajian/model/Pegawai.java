package com.teguh.penggajian.model;

public class Pegawai {
    private String name;
    private Gender sex;
    private StatusPernikahan marital_status;
    private int children;
    private Negara country;



    public Pegawai(String name,Gender sex,StatusPernikahan marital_status,int children,Negara country) {
        this.setName(name);
        this.setSex(sex);
        this.setMarital_status(marital_status);
        this.setChildren(children);
        this.setCountry(country);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public Gender getSex() {
        return sex;
    }

    public StatusPernikahan getMarital_status(StatusPernikahan marital_status) {
        return this.marital_status;
    }

    public void setMarital_status(StatusPernikahan marital_status) {
        this.marital_status = marital_status;
    }

    public int getChildren() {
        return children;
    }

    public StatusPernikahan getMarital_status() {
        return marital_status;
    }

    public Negara getCountry() {
        return country;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public void setCountry(Negara country) {
        this.country = country;
    }
}
