package com.service;

import com.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> getStudents();
}
