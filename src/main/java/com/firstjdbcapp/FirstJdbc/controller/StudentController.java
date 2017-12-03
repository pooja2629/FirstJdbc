package com.firstjdbcapp.FirstJdbc.controller;

import com.firstjdbcapp.FirstJdbc.impl.StudentImpl;
import com.firstjdbcapp.FirstJdbc.model.Student;
import com.firstjdbcapp.FirstJdbc.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController

public class StudentController {



    @Autowired

    StudentImpl studentImpl;



    @GetMapping(value="/getdata")

    public List<Student> getStudentData(){



        return studentImpl.getStudents();

    }



    @GetMapping(value="/getstu/{id}")

    public Student getStudentData1(@PathVariable Integer id){



        return studentImpl.getSingleStudent(id);

    }



//    @PostMapping(value="/savestudent")
//
//    public String saveDataStu(@RequestBody Student student){
//
//
//
//        return StudentImpl.saveData(student);
//
//    }



    @GetMapping(value = "/innerjoin")
    public List<Map<String,Object>> inJoin(){
        List<Map<String,Object>> list=Student.innerJoin();
        return list;
    }



//    @PostMapping(value="/saveAll")

//    public String saveAll(@RequestBody Student stu){

//

//

//

//    }



}
