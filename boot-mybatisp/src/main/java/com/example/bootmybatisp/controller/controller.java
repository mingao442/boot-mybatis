package com.example.bootmybatisp.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.bootmybatisp.dao.dao;
import com.example.bootmybatisp.pojo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class controller {
    @Autowired
    private dao dao;
    @Autowired
    private student studentsss;

    @RequestMapping("/demo2")
    public student select(){
        student student = dao.selectById("3");
        IPage ip=new Page(1,3);//查询第一页，第一页有3条数据
        IPage iPage = dao.selectPage(ip, null);
        return student;
    }
    @RequestMapping("/demo3")
    public List<student> selectbycondition(){
        LambdaQueryWrapper<student> lc=new LambdaQueryWrapper<>();
        lc.lt(student::getAge,13).gt(student::getAge,10);//查询年纪小于13，大与10
        lc.lt(student::getAge,13).or().gt(student::getAge,10);//或关系 其它关系le小于等于，eq等于
        lc.lt(null!=Integer.valueOf(studentsss.getAge()),student::getAge,13);//判断空值
        List<student> students = dao.selectList(lc);
        return students;
    }

    @RequestMapping("/selectall")
    public List<student> selectall(){
//        QueryWrapper qw = new QueryWrapper();
        List<student> students = dao.selectList(null);
        return students;
    }
    @RequestMapping("/selectbyid/{id}")
    public student selectbyid(@PathVariable int id){
//        QueryWrapper qw = new QueryWrapper();
        student student = dao.selectById(id);
        return student;
    }
    @RequestMapping("/updatebyid")
    public boolean updatebyid(@RequestBody student st){
//        QueryWrapper qw = new QueryWrapper();
        System.out.println(st.getName());
        int i = dao.updateById(st);
        if (i<1){

            //td
            System.out.println("----------------------更新失败");
            return false;
        }
        else {
            System.out.println("-------------更新成功");
            return true;}

    }
    @RequestMapping("/deletebyid")
    public boolean deletebyid(@PathVariable int id){
//        QueryWrapper qw = new QueryWrapper();
        student student = dao.selectById(id);
        return true;
    }


}
