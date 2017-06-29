package com.lincoln.ssm.common.service.impl;

import com.lincoln.ssm.app.data.StudentMapper;
import com.lincoln.ssm.common.data.IMapper;
import com.lincoln.ssm.common.service.IService;

public abstract class AbstractServiceImpl<T> implements IService<T> {
	
	public abstract IMapper<T> getMapper();
	
	
	public void save(T Object) {
		System.out.println("service save");
		this.getMapper().addStu(Object);
	}
	
	
}
