package com.example.bootmybatisp.dao;


import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bootmybatisp.pojo.student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper

public interface dao extends BaseMapper<student> {
//    @Select("select *from demo where id=#{id}")
//    List<student> selectbyid(int id);
}
