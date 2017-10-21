package com.stiri.draft1.userPack;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/users")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ResponseEntity<Boolean> userLogin(@RequestBody User user) {
		if(user instanceof User) {
			System.out.println("true instance");
		}
		System.out.println(user);
		boolean response=userService.login(user);
		if(response) {
			return  new ResponseEntity<Boolean>(true,HttpStatus.FOUND);
		}else {
			return  new ResponseEntity<Boolean>(false,HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Boolean>  createUser(@RequestBody User user) {
		System.out.println(user);
		 userService.createUser(user);
		 return  new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.getAllUsers();
		
	}
	
	@RequestMapping(value="/{emailId}",method=RequestMethod.GET)
	public User getUserByMailId(@PathVariable String emailId) {
		return userService.findOneUser(emailId);
	}
	
	@RequestMapping(value="/test1")
	public String test1(@RequestBody TestPOJO tpj) {
		if(tpj instanceof TestPOJO) {
			System.out.println("true");
		}
		return "working1";
		
	}
	
	
	
}
