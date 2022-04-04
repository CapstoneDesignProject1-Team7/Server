package com.schoolzone.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.schoolzone.model.UserData;

@RestController
public class UserDataController {
	
	private Map<String, UserData> userMap;
	
	@PostConstruct
	public void init() {
		userMap = new HashMap<String, UserData>();
		userMap.put("1", new UserData("1", true, 35.889, 128.6106));
	}
	
	@GetMapping("/user/{id}")
	public UserData getUserData(@PathVariable("id") String id) {
		return userMap.get(id);
	}
}
