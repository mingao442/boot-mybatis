package com.example.bootmybatisp.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
@TableName("demo")
public class student {
    private String name;
    private int age;
    private String habits;
    private String grades;
    @TableField(select = false)
//    @TableId(type = idt)
    private int id;
}
