package com.firstjdbcapp.FirstJdbc.model;

import java.util.List;
import java.util.Map;

public class Student {
    Integer id;
    String name;
    String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Dept getDept() {

        return dept;

    }


    public void setDept(Dept dept) {

        this.dept = dept;

    }


    Dept dept;


    public static List<Map<String,Object>> innerJoin() {
        return null;
    }
}