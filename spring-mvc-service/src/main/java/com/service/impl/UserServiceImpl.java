package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.UserService;
import com.spring.mvc.mapper.UserDTOMapper;
import com.spring.mvc.model.UserDTO;
import com.spring.mvc.model.UserDTOExample;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDTOMapper userMapper;

	public List<UserDTO> getUser() {
		UserDTOExample example = new UserDTOExample();
		return userMapper.selectByExample(example);
	}

}
