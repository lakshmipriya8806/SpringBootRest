package com.priya.model;

import java.util.Date;

public class ErrorDetails {
	
	private int statusCode;
	
	private String message;
	
	private String description;
	
	private Date timeStamp;
	
	public ErrorDetails(Date time,int statusCode, String message,String description) {
		this.timeStamp=time;
		this.statusCode= statusCode;
		this.message=message;
		this.description=description;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}
