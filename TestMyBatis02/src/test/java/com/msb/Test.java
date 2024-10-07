package com.msb;

import com.msb.mapper.BookMapper;
import com.msb.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        // 指定核心配置文件的路径
        String resource = "mybatis.xml";
        // 获取加载配置文件的输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 加载配置文件，创建工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 通过工厂类获取一个会话
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 动态代理模式
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        List list = mapper.selectAllBooks();

        for (Object object : list) {
            Book book = (Book) object;
            System.out.println(book.getName() + "\t" + book.getAuthor() + "\t" + book.getPrice());
        }
        // 关闭资源
        sqlSession.close();
    }
}
