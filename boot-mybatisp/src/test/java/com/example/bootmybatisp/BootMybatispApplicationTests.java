package com.example.bootmybatisp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.bootmybatisp.dao.dao;
import com.example.bootmybatisp.pojo.student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BootMybatispApplicationTests {
    @Autowired
    private dao dao;

    @Test
    void contextLoads() {

        IPage ip=new Page(1,8);//查询第一页，第一页有8条数据
        dao.selectPage(ip, null);

        System.out.println(ip.getRecords());//查询出的结果集
        System.out.println(ip.getCurrent());//当前页码
        System.out.println(ip.getSize());//每页显示数
        System.out.println(ip.getPages());//当前页码
        System.out.println(ip.getTotal());//总共数据数


    }

}
