package com.limosys.ws.obj.param;

public class Ws_RateRideParam {

	private int jobId;
	private String compId;
	private String carId;
	private Integer affBlngId;
	private int rating = 0;
	private String comment = "";
	private String deviceId;
	private int custId;

	//Tip Functionality
	private double gratuityPercentage;
	private double gratuityAmount;

	public Ws_RateRideParam(int jobId, String compId, String carId, Integer affBlngId) {
		this.setJobId(jobId);
		this.setCompId(compId);
		this.setCarId(carId);
		this.setAffBlngId(affBlngId);
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getCompId() {
		return compId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment == null ? "" : comment;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public double getGratuityPercentage() {
		return gratuityPercentage;
	}

	public void setGratuityPercentage(double gratuityPercentage) {
		this.gratuityPercentage = gratuityPercentage;
	}

	public double getGratuityAmount() {
		return gratuityAmount;
	}

	public void setGratuityAmount(double gratuityAmount) {
		this.gratuityAmount = gratuityAmount;
	}

	public Integer getAffBlngId() {
		return affBlngId;
	}

	public void setAffBlngId(Integer affBlngId) {
		this.affBlngId = affBlngId;
	}

}
