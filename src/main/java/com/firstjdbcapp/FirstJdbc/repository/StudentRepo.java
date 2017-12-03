package com.firstjdbcapp.FirstJdbc.repository;

import com.firstjdbcapp.FirstJdbc.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentRepo {



    List<Student> getStudents();



    Student getSingleStudent(Integer id);



    String saveData(Student student);



    List<Map<String,Object>> innerJoin();



    void saveAllData(Student stu);



}