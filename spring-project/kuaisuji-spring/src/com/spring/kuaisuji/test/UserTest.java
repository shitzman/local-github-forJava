package com.spring.kuaisuji.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.kuaisuji.mapper.UserMapper;
import com.spring.kuaisuji.po.Account;
import com.spring.kuaisuji.po.User;

public class UserTest {
	
	ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserMapper userMapper = act.getBean(UserMapper.class);
	
	@Test
	public void checkUser(){

		User user = userMapper.checkUser("shi@qq.com","shi");
		System.out.println(user.getUser_name()+"|"+user.getUser_ip());

		for(Account a : user.getAccountList()) {
			System.out.println(a.getAccount_remark());
		}
	}
	

}
