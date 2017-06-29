package com.lincoln.ssm.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lincoln.ssm.app.data.StudentMapper;
import com.lincoln.ssm.entity.Student;
import com.lincoln.ssm.student.service.IStudentService;

@Controller
@RequestMapping("/login")

public class LoginController {

	@Resource(name="studentService")
	private IStudentService studentService;
	@RequestMapping("/login.do")
	public String login(Student student){
		System.out.println(student.getUsername()+student.getPassword());
		//studentMapper.addStu(new Student(student.getUsername(),student.getPassword(),"66",9));
		//studentMapper.selectStu();
		//studentService.save(student);
		
		if(null!=studentService.validate(student)){
			
			return "hello";
		}
		else{
			
			return "index";
		}

	}
}
