package com.spring.kuaisuji.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.kuaisuji.po.Account;

public interface AccountMapper {

	//根据用户id在accounts表中将用户所记的所有账目取出
	public List<Account> getAllAccountByUserId(@Param("userId")Integer userId);
}
