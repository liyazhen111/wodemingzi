package com.qianfeng.xmltx;

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
}
