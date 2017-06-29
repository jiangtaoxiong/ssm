package com.lincoln.ssm.student.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lincoln.ssm.app.data.StudentMapper;
import com.lincoln.ssm.common.service.impl.AbstractServiceImpl;
import com.lincoln.ssm.entity.Student;
import com.lincoln.ssm.student.service.IStudentService;
@Service(value="studentService")
public class StudentServiceImpl extends AbstractServiceImpl<Student> implements IStudentService {

	@Resource(name="studentMapper")
	private StudentMapper studentMapper;
	@Override
	public StudentMapper getMapper() {
		// TODO Auto-generated method stub
		return this.studentMapper;
	}
	
	@Override
	public Student validate(Student student) {
		System.out.println("student service validate");
		
		if(null!=this.studentMapper.findOneByExample(student)&& student.getPassword().equals(this.studentMapper.findOneByExample(student).getPassword())){
			return student;
		}
		else
		{
			return null;
		}
	}
}
