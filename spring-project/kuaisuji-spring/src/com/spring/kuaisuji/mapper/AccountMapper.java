package com.spring.kuaisuji.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.kuaisuji.po.Account;

public interface AccountMapper {

	//�����û�id��accounts���н��û����ǵ�������Ŀȡ��
	public List<Account> getAllAccountByUserId(@Param("userId")Integer userId);
}
