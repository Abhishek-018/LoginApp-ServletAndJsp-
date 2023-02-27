package com.servlet.service;

import java.util.ArrayList;

import com.servlet.dto.User;

public class LoginAuthentication {
	boolean result = false;
	ArrayList<User> userDb =new ArrayList<>();
	
	
	public boolean authenticate(String uemail,String upassword) {
		userDb.add(new User(101,"joe Daniel","joe@gmail.com","joe@123","Frontend Developer","Australia"));
		userDb.add(new User(102,"larry Page","larry@gmail.com","larry@123","Backend Developer","New Zealand "));
		userDb.add(new User(103,"judas wall", "judas@gmail.com","judas@123","Devops Engineer","Norway"));
		
		for(int i=0;i<userDb.size();i++)
		{
			
			if (uemail.equals(userDb.get(i).getUserEmail()) && upassword.equals(userDb.get(i).getUserPassword())) {
				System.out.println(userDb.get(i).getUserEmail());
				System.out.println(userDb.get(i).getUserPassword());
				result = true;
				
				
			}
			
			
			
		}
		
		return result;
		
	}
	
	public User getUserDetails(String uemail,String upassword) {
		User user = null;
		for(int i = 0;i<userDb.size();i++) {
			if(uemail.equals(userDb.get(i).getUserEmail()) && upassword.equals(userDb.get(i).getUserPassword())) {
			user = userDb.get(i);
			}
		}
		
		return user;
	}
}
