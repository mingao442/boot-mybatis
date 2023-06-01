package com.example.bootmybatis.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class student {
    private String name;
    private int age;
    private String habits;
    private String grades;
    private int id;
}
