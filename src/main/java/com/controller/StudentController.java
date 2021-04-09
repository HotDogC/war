package com.controller;

import com.domain.Student;
import com.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping(value="/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mav=new ModelAndView();
        String result="注册失败!";
        int count=studentService.addStudent(student);
        if(count>0){
            result="学生【"+student.getName()+"】注册成功!";
        }
        mav.addObject("result",result);
        mav.setViewName("show");
        return mav;
    }

    @ResponseBody
    @RequestMapping(value = "/listStudent.do")
    public List<Student> listStudent(){
        List<Student> result=studentService.getStudents();
        for(Student stu:result){
            System.out.println(stu.getName());
        }
        return result;
    }
}
