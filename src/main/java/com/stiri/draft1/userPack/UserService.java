package com.stiri.draft1.userPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	 static List<User> userDb=new ArrayList<>();
	
	
	static {
		
		userDb.add(new User("smruti","0727","talktosmruti@gmail.com"));
		userDb.add(new User("sushree","0701","sush1synergydkl@gmail.com"));
		userDb.add(new User("admin","admin","admin@stiri.com"));
		
	}
	
	public boolean login(User inputUserCredential) {
		boolean response=Boolean.FALSE;
		
		for(User eachUserDb:userDb) {
			if(eachUserDb.equals(inputUserCredential)) {
				response=Boolean.TRUE;
				break;
			}
			
		}
		
		return response;
		
	}
	
	public void createUser(User inputUserCredential) {
		userDb.add(inputUserCredential);
	}
	
	public List<User> getAllUsers() {
		return userDb;
	}
	
	public User findOneUser(String emailId) {
		User response=null;
		for(User eachUserDb:userDb) {
			if(eachUserDb.getEmail().equals(emailId)) {
				response=eachUserDb;
				break;
			}
			
		}
		
		return response;
	}

}
