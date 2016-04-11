package com.limosys.ws.obj;

public class Ws_Fare {

	private double stopsAmount;
	private double waitAmount;
	private double meetGreetAmount;
	private double discountAmount;
	private double tollsAmount;
	private double parkingAmount;
	private double miscAmount;
	private double collectedAmount;
	private String billingComment;
	private String discountDesc;
	private double discountPct;
	private double distance;
	private double perMile;
	private double duration;
	private double perMinute;
	private double baseFare;
	private double gratuityAmount;
	private double gratuityPercent;
	private double couponAmount;
	
	public Ws_Fare() {
	}

	public Ws_Fare(double baseFare) {
		this.baseFare = baseFare;
	}

	public double getStopsAmount() {
		return stopsAmount;
	}

	public void setStopsAmount(double stopsAmount) {
		this.stopsAmount = stopsAmount;
	}

	public double getWaitAmount() {
		return waitAmount;
	}

	public void setWaitAmount(double waitAmount) {
		this.waitAmount = waitAmount;
	}

	public double getMeetGreetAmount() {
		return meetGreetAmount;
	}

	public void setMeetGreetAmount(double meetGreetAmount) {
		this.meetGreetAmount = meetGreetAmount;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double getTollsAmount() {
		return tollsAmount;
	}

	public void setTollsAmount(double tollsAmount) {
		this.tollsAmount = tollsAmount;
	}

	public double getParkingAmount() {
		return parkingAmount;
	}

	public void setParkingAmount(double parkingAmount) {
		this.parkingAmount = parkingAmount;
	}

	public double getMiscAmount() {
		return miscAmount;
	}

	public void setMiscAmount(double miscAmount) {
		this.miscAmount = miscAmount;
	}

	public double getCollectedAmount() {
		return collectedAmount;
	}

	public void setCollectedAmount(double collectedAmount) {
		this.collectedAmount = collectedAmount;
	}

	public String getBillingComment() {
		return billingComment;
	}

	public void setBillingComment(String billingComment) {
		this.billingComment = billingComment;
	}

	public String getDiscountDesc() {
		return discountDesc;
	}

	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}

	public double getDiscountPct() {
		return discountPct;
	}

	public void setDiscountPct(double discountPct) {
		this.discountPct = discountPct;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getPerMile() {
		return perMile;
	}

	public void setPerMile(double perMile) {
		this.perMile = perMile;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getPerMinute() {
		return perMinute;
	}

	public void setPerMinute(double perMinute) {
		this.perMinute = perMinute;
	}

	public double getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}

	public double getGratuityAmount() {
		return gratuityAmount;
	}

	public void setGratuityAmount(double gratuityAmount) {
		this.gratuityAmount = gratuityAmount;
	}

	public double getGratuityPercent() {
		return gratuityPercent;
	}

	public void setGratuityPercent(double gratuityPercent) {
		this.gratuityPercent = gratuityPercent;
	}

	public double getCouponAmount() {
		return couponAmount;
	}

	public void setCouponAmount(double couponAmount) {
		this.couponAmount = couponAmount;
	}
}
