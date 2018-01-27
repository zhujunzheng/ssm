package com.test;

import com.dao.Userdao;
import com.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mytest {


    @Test
    public void textmybatis() throws IOException {
//        String resource = "configuraction.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("configuraction.xml"));

        SqlSession sqlSession= sqlSessionFactory.openSession();

        Userdao userdao=  sqlSession.getMapper(Userdao.class);

        List<User> list= userdao.selectuserall();
        for (User user : list) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void textspring() throws IOException {


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-public.xml");
        Userdao userdao= (Userdao) applicationContext.getBean("userdao");
        List<User> list=userdao.selectuserall();
        for (User user : list) {
            System.out.println(user.toString());
        }
    }



}
