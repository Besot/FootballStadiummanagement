package com.besot.football.entities;

import com.besot.football.enums.Idtype;
import com.besot.football.enums.Sex;

public abstract class User {
    private String name;
    private int age;
    private Idtype idtype;
    private Long phoneNo;
    private Sex sex;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Idtype getIdtype() {
        return idtype;
    }

    public void setIdtype(Idtype idtype) {
        this.idtype = idtype;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idtype=" + idtype +
                ", phoneNo=" + phoneNo +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                '}';
    }
}
