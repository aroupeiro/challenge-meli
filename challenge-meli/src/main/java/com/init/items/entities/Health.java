package com.init.items.entities;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Health {
	
	@SerializedName("date")
	@Expose
	private String date;
	@SerializedName("avg_response_time")
	@Expose
	private double avgResponseTime;
	@SerializedName("total_requests")
	@Expose
	private int totalRequests;
	@SerializedName("avg_response_time_api_calls")
	@Expose
	private double avgResponseTimeApiCalls;
	@SerializedName("total_count_api_calls")
	@Expose
	private int totalCountApiCalls;
	
	@SerializedName("info_requests")
	@Expose
	private List<InfoRequest> InfoRequests = null;
		
	/**
	* No args constructor for use in serialization
	*
	*/
	public Health() {
	}

	/**
	*
	* @param date
	* @param avgResponseTimeApiCalls
	* @param totalCountApiCalls
	* @param infoRequests
	* @param avgResponseTime
	* @param totalRequests
	*/
	public Health(String date, double avgResponseTime, int totalRequests, double avgResponseTimeApiCalls, int totalCountApiCalls, List<InfoRequest> infoRequests) {
		super();
		this.date = date;
		this.avgResponseTime = avgResponseTime;
		this.totalRequests = totalRequests;
		this.avgResponseTimeApiCalls = avgResponseTimeApiCalls;
		this.totalCountApiCalls = totalCountApiCalls;
		this.InfoRequests = infoRequests;
	}

	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public double getAvgResponseTime() {
		return avgResponseTime;
	}
	
	public void setAvgResponseTime(double avgResponseTime) {
		this.avgResponseTime = avgResponseTime;
	}
	
	public int getTotalRequests() {
		return totalRequests;
	}
	
	public void setTotalRequests(int totalRequests) {
		this.totalRequests = totalRequests;
	}
	
	public double getAvgResponseTimeApiCalls() {
		return avgResponseTimeApiCalls;
	}
	
	public void setAvgResponseTimeApiCalls(double avgResponseTimeApiCalls) {
		this.avgResponseTimeApiCalls = avgResponseTimeApiCalls;
	}
	
	public int getTotalCountApiCalls() {
		return totalCountApiCalls;
	}
	
	public void setTotalCountApiCalls(int totalCountApiCalls) {
		this.totalCountApiCalls = totalCountApiCalls;
	}
	
	public List<InfoRequest> getInfoRequests() {
		return InfoRequests;
	}
	
	public void setInfoRequests(List<InfoRequest> infoRequests) {
		this.InfoRequests = infoRequests;
	}

}
