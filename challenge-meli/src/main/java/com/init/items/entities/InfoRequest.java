package com.init.items.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InfoRequest {
	
	@SerializedName("status_code")
	@Expose
	private int statusCode;
	
	@SerializedName("count")
	@Expose
	private int count;

	/**
	* No args constructor for use in serialization
	*
	*/
	public InfoRequest() {
	}

	/**
	*
	* @param count
	* @param statusCode
	*/
	public InfoRequest(int statusCode, int count) {
		super();
		this.statusCode = statusCode;
		this.count = count;
	}
	
	public int getStatusCode() {
		return statusCode;
	}
	
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

}
