package com.spring.kuaisuji.mapper;

import org.apache.ibatis.annotations.Param;

import com.spring.kuaisuji.po.User;

public interface UserMapper {

	//�����û��������˺����û������ѯ��������Ϣ����Ϊ�գ����û����������ʵ����֤��¼������
	public User checkUser(@Param("userEmail")String userEmail, @Param("userPassword")String userpassword);
}
