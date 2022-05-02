package com.schoolzone.controller;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.schoolzone.mapper.UserDataMapper;
import com.schoolzone.model.LocationData;

@RestController
public class UserDataController {
	private UserDataMapper mapper;
	
	public UserDataController(UserDataMapper mapper) {
		this.mapper = mapper;
	}
	
	@PostConstruct
	public void init() {
	}
	
	@GetMapping("/user")
	public ArrayList<LocationData> getUserData(@RequestParam double latitude, @RequestParam double longitude, @RequestParam int type) {
		System.out.println("REQUESTED GET DATA " + latitude + " " + longitude);
		return mapper.getUserData(latitude, longitude, 1-type);
	}
	
	@PutMapping("/user/{id}")
	public void putUserData(@PathVariable("id") String id, @RequestParam double latitude, @RequestParam double longitude, @RequestParam int type) {
		System.out.println("REQUESTED UPDATE FROM " + id);
		mapper.updateUserData(id, latitude, longitude, type);
	}
	
	@PostMapping("/user/{id}")
	public void postUserData(@PathVariable("id") String id, @RequestParam double latitude, @RequestParam double longitude, @RequestParam int type) {
		System.out.println("REQUESTED INSERT FROM " + id);
		mapper.insertUserData(id, latitude, longitude, type);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUserData(@PathVariable("id") String id) {
		System.out.println("REQUESTED DELETE FROM " + id);
		mapper.deleteUserData(id);
	}
}
