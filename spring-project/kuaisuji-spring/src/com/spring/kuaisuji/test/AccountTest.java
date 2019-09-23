package com.spring.kuaisuji.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.kuaisuji.mapper.AccountMapper;
import com.spring.kuaisuji.po.Account;

public class AccountTest {
	ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
	AccountMapper accountMapper = act.getBean(AccountMapper.class);
	@Test
	public void getAllAccountByUserId() {
		
		List<Account> accountList = accountMapper.getAllAccountByUserId(1);
		for(Account a : accountList) {
			System.out.println(a.getAccount_id());
		}
	}

}
