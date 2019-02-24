package com.enoxs.service.impl;

import com.enoxs.domain.UserInfo;
import com.enoxs.mapper.UserMapper;
import com.enoxs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User服務層接口實現類
 * @Service("userService")用於將當前類注釋為一個Spring的bean，名為userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	
	/**
	 * 自動注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;

	/**
	 * UserService接口login方法實現
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public UserInfo login(String account, String password) {
		UserInfo userInfo = userMapper.findWithLoginnameAndPassword(account, password);
		System.out.println("BookMsg : " + userInfo.toString());
		return userInfo;
	}

}
