package com.Cheungz.dao;

import com.Cheungz.domain.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface StudentDao {
    public List<Student> getStudents();
    public void insertStudent();
}
