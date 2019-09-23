package com.spring.kuaisuji.mapper;

import org.apache.ibatis.annotations.Param;

import com.spring.kuaisuji.po.User;

public interface UserMapper {

	//根据用户的邮箱账号与用户密码查询其详情信息，若为空，则用户或密码错误；实现验证登录操作；
	public User checkUser(@Param("userEmail")String userEmail, @Param("userPassword")String userpassword);
}
