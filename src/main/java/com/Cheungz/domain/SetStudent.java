package com.Cheungz.domain;

import com.Cheungz.util.GetSqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class SetStudent {
    public static void main(String[] args) {
        GetSqlSessionUtil sqlSessionUtil = new GetSqlSessionUtil();
        SqlSession sqlSession = sqlSessionUtil.getSqlSession();
        String sqlId = "com.Cheungz.dao.StudentDao.insertStudent";
        Student student = new Student();
        student.setId(1004);
        student.setName("张哲");
        student.setEmail("cheungz@163.com");
        student.setAge(18);
        Integer i = sqlSession.insert(sqlId,student);
        sqlSession.commit();
        System.out.println("添加成功，添加了"+i+"条数据");
    }
}
