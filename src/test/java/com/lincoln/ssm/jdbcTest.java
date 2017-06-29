package com.lincoln.ssm;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lincoln.ssm.app.data.StudentMapper;
import com.lincoln.ssm.entity.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})

public class jdbcTest {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void setUp()
	{
		
	}
	@After
	public void des()
	{
		
	}
	@Test
	public void Test(){
		
		SqlSession sqlsession = sqlSessionFactory.openSession();
		
		StudentMapper studentMapper = sqlsession.getMapper(StudentMapper.class);
		
		studentMapper.addStu(new Student("m","m","m",1));
		
		
		//studentMapper.selectStu();
		
	}
}
