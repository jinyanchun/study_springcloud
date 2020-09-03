package com.uenpay.test;

import com.uenpay.config.TestConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: study_springcloud
 * @description: 测试类
 * @author: jyc
 * * @create: 2020-09-03 17:23
 **/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
        Test bean = context.getBean(Test.class);
        bean.test();
    }

    public void test(){
        System.out.println("hahaha");
    }
}
