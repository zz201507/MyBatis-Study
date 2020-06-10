package com.Cheungz.domain;

import com.Cheungz.dao.StudentDao;
import com.Cheungz.util.GetSqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class GetStudent implements StudentDao {
    @Override
    public List<Student> getStudents() {
        GetSqlSessionUtil sqlSessionUtil = new GetSqlSessionUtil();
        SqlSession sqlSession = sqlSessionUtil.getSqlSession();
        String sqlId ="com.Cheungz.dao.StudentDao.getStudents";
        List<Student> students = sqlSession.selectList(sqlId);
        sqlSession.close();
        return students;
    }

    @Override
    public void insertStudent() {

    }
}
