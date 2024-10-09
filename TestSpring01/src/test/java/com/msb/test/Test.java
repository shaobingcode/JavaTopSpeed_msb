package com.msb.test;

import com.msb.pojo.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // 创建Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取对象
        Book book = (Book) context.getBean("b");
        // 打印对象信息
        System.out.println(book.getName() + " "+ book.getId());
    }
}
