package com.Cheungz.Acting;

import com.Cheungz.dao.StudentDao;
import com.Cheungz.domain.Student;
import com.Cheungz.util.GetSqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class MyBatisActing {
    /**

     *

     * @Author  z'z
     * @Time  2020/6/11 15:33

     **/
    public static void main(String[] args) {
        SqlSession sqlSession = new GetSqlSessionUtil().getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = studentDao.getStudents();
        for (Student student : students)
            System.out.println(student);
    }
}
