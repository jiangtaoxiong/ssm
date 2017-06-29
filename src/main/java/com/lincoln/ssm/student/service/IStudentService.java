package com.lincoln.ssm.student.service;

import com.lincoln.ssm.common.service.IService;
import com.lincoln.ssm.entity.Student;

public interface IStudentService extends IService<Student> {

	public Student validate(Student student); 
}
