package com.lincoln.ssm.common.data;

import java.util.List;

public interface IMapper<T> {
	public void addStu(T Object);
	public List<T> selectStu();
	public T findOneByExample(T object);
}
