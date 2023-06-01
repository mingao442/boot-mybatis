package com.example.bootmybatis.controller;

import com.example.bootmybatis.dao.dao;
import com.example.bootmybatis.pojo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class demo1 {
    @Autowired
    private dao dao;
    @Autowired
    private student student;
    @RequestMapping("/demo1")
    public student select(){
        List<student> selectbyid = dao.selectbyid(3);
        for (student s :
                selectbyid) {
             student.setName(s.getName());
             student.setId(s.getId());
             student.setAge(s.getAge());
             student.setHabits(s.getHabits());
             student.setGrades(s.getGrades());
        }

     return student;
    }
}
