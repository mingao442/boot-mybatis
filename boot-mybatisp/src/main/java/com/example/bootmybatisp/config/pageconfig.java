package com.example.bootmybatisp.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class pageconfig {
    @Bean
    public MybatisPlusInterceptor fileter() {
        MybatisPlusInterceptor my = new MybatisPlusInterceptor();
        my.addInnerInterceptor(new PaginationInnerInterceptor());
        return my;
    }
}
