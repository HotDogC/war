package com.service.impl;

import com.dao.StudentDao;
import com.domain.Student;
import com.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//创建service对象
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        int count=studentDao.addStudent(student);
        return count;
    }

    @Override
    public List<Student> getStudents() {
        List<Student> result=studentDao.selectStudents();
        return result;
    }
}
