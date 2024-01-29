package com.jwt.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jwt.main.models.User;

@Service
public class UserServices {
	private List<User>store=new ArrayList<>();

	public UserServices() {
		store.add(new User("1","Subhajit","subhajit@gmail.com"));
		store.add(new User("2","Sayan","sayan@gmail.com"));
		store.add(new User("3","Ritwik","ritwik@gmail.com"));
	}
	public List<User>getAllUser(){
		return this.store;
	}
	
}
