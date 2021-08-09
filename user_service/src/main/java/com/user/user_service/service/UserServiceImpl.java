package com.user.user_service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_service.entity.User;

@Service
public class UserServiceImpl implements UserService{

	List<User> list;
	public UserServiceImpl() {
		list= new ArrayList<>();
		list.add(new User(1211,"abcd","345678765"));
		list.add(new User(1212,"abcd","345678765"));
		list.add(new User(1213,"abcd","345678765"));
		list.add(new User(1214,"abcd","345678765"));
	}

	
	@Override
	public User getUser(long id) {
		
		return list.stream().filter(user->user.getUserid()==(id)).findAny().orElse(null);
	}

}
