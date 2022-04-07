package com.schoolzone.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.schoolzone.mapper.UserDataMapper;
import com.schoolzone.model.UserData;

@RestController
public class UserDataController {
	
	private UserDataMapper mapper;
	
	
	public UserDataController(UserDataMapper mapper) {
		this.mapper = mapper;
	}
	
	@PostConstruct
	public void init() {
	}
	
	@GetMapping("/user/{id}")
	public UserData getUserData(@PathVariable("id") String id) {
		return mapper.getUserData(id);
	}
	
	@PutMapping("/user/{id}")
	public void putUserData(@PathVariable("id") String id, @RequestParam double latitude, @RequestParam double longitude, @RequestParam int type) {
		mapper.insertUserData(id, latitude, longitude, type);
	}
	
	@PostMapping("/user/{id}")
	public void postUserData(@PathVariable("id") String id, @RequestParam double latitude, @RequestParam double longitude, @RequestParam int type) {
		mapper.updateUserData(id, latitude, longitude, type);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUserData(@PathVariable("id") String id) {
		mapper.deleteUserData(id);
	}
}
