package com.example.bootmybatis.dao;

import com.example.bootmybatis.pojo.student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface dao {
    @Select("select *from demo where id=#{id}")
    List<student> selectbyid(int id);
}
