//package com.example.bootmybatisp.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpFilter;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebFilter(filterName = "selectall",urlPatterns = "/*")
//public class filter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
//    }
//
//    @Override
//    public void destroy() {
//        Filter.super.destroy();
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//
//        HttpServletResponse ht = (HttpServletResponse) servletResponse;
//        ht.addHeader("Access-Control-Allow-Origin","*");
//        ht.addHeader("Access-Control-Allow-Methods","*");
//        filterChain.doFilter(servletRequest,servletResponse);
//
//    }
//}
