package com.Cheungz.domain;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GetStudent getStudent = new GetStudent();
        List<Student> students = getStudent.getStudents();
        for (Student stu: students) {
            System.out.println(stu);
        }
    }
}
