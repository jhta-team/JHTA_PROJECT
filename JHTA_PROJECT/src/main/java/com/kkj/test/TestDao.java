package com.kkj.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kkj.mybatis.MybatisConnectionFactory;

public class TestDao {
	public List<TestDto> dbTest() {
		List<TestDto> listDto = null;
		SqlSession sqlSession = MybatisConnectionFactory.getSqlSession();
		listDto = sqlSession.selectList("dbtest");
		sqlSession.close();
		return listDto;
	}
}
