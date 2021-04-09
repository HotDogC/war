package com.dao;

import com.domain.Student;

import java.util.List;

public interface StudentDao {
    int addStudent(Student student);
    List<Student> selectStudents();
}
