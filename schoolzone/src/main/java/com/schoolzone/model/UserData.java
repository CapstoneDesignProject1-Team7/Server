package com.schoolzone.model;


public class UserData {
	private String id;
	// driver : 1 , kid : 0
	private int type;
	private double latitude;
	private double longitude;
	
	public UserData(String id, double latitude, double longitude, int type) {
		super();
		this.id = id;
		this.type = type;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
