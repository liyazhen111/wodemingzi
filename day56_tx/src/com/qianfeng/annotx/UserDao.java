package com.qianfeng.annotx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void add(){
		String sql = "insert into user(name) values('gggg')";
		jdbcTemplate.update(sql);
	}
	
	public void update(){
		String sql = "update user set name='bbb' where id=4";
		jdbcTemplate.update(sql);
	}
}
