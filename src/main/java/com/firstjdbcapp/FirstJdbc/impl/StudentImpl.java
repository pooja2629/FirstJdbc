package com.firstjdbcapp.FirstJdbc.impl;

import com.firstjdbcapp.FirstJdbc.model.Student;
import com.firstjdbcapp.FirstJdbc.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;
import java.util.Map;


@Repository

public class StudentImpl implements StudentRepo {


    @Autowired

    JdbcTemplate jdbcTemplate;


    @Override

    public List<Student> getStudents() {


        String sql = "select * from student";


        List<Student> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));


        return list;

    }


    @Override

    public Student getSingleStudent(Integer id) {


        String sql = "select * from student where id=?";


        Student st = jdbcTemplate.

                queryForObject(sql,

                        new Object[]{id}, new int[]{Types.INTEGER}, new BeanPropertyRowMapper<>(Student.class));


        return st;

    }


    @Override

    public String saveData(Student student) {


        String sql = "insert into student values(?,?,?)";


        jdbcTemplate.update(sql, new Object[]{student.getId(),

                student.getName(), student.getCity()}, new int[]{Types.INTEGER, Types.VARCHAR, Types.VARCHAR});


        return "Data saved";

    }


    @Override
    public List<Map<String, Object>> innerJoin() {
        String sql = " select Student.id,Student.name,Student.city,Dept.dept_id,Dept.dept_name from Student inner join Dept on Student.dept_id=Dept.dept_id;";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public void saveAllData(Student stu) {

    }
}



