package com.limosys.ws.obj.car;

import java.util.Date;

public class Ws_CarPrice {

	private String carType = "";
	private String carTypeDescription;
	private String carIcon;
	private int carTypeId;
	private double carPrice;
	private double grandTotalAmt;
	private double hourlyRate;
	private double hourlyAmt;
	private double stopsAmt;
	private int passengers;
	private int luggage;
	private int waitingMinutes;
	private String fareDescription;
	private int tipsPercent;
	private String alephPriceId;	
	private Date blockedTillDtm;

	public Ws_CarPrice() {
	}

	public Ws_CarPrice(String type, double price) {
		this.carType = type;
		this.carPrice = price;
	}

	public Ws_CarPrice(String type, double price, String alephPriceId, int waitingMinutes, Date blockedTillDtm) {
		this.carType = type;
		this.carPrice = price;
		this.alephPriceId = alephPriceId;
		this.waitingMinutes = waitingMinutes;
		this.setBlockedTillDtm(blockedTillDtm);
	}

	public Ws_CarPrice(String type, String description, double price, int passengers, int luggage) {
		this(type, description, null, price, 0, passengers, luggage);
	}

	public Ws_CarPrice(String type, String description, String icon, double price, int passengers, int luggage) {
		this(type, description, icon, price, 0, passengers, luggage);
	}

	public Ws_CarPrice(String type, String description, double price, double grandTotalAmt, int passengers, int luggage) {
		this(type, description, null, price, grandTotalAmt, passengers, luggage);
	}

	public Ws_CarPrice(String type, String description, String icon, double price, double grandTotalAmt, int passengers, int luggage) {
		this.carType = type;
		this.carTypeDescription = description;
		this.carIcon = icon;
		this.carPrice = price;
		this.grandTotalAmt = grandTotalAmt;
		this.passengers = passengers;
		this.luggage = luggage;
	}

	public int getCarTypeId() {
		return carTypeId;
	}

	public void setCarTypeId(int carTypeId) {
		this.carTypeId = carTypeId;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarTypeDescription() {
		return carTypeDescription;
	}

	public void setCarTypeDescription(String carTypeDescription) {
		this.carTypeDescription = carTypeDescription;
	}

	public double getPrice() {
		return carPrice;
	}

	public void setPrice(Double carPrice) {
		this.carPrice = carPrice;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getLuggage() {
		return luggage;
	}

	public void setLuggage(int luggage) {
		this.luggage = luggage;
	}

	public String getCarIcon() {
		return carIcon;
	}

	public void setCarIcon(String carIcon) {
		this.carIcon = carIcon;
	}

	public int getWaitingMinutes() {
		return waitingMinutes;
	}

	public void setWaitingMinutes(int waitingTime) {
		this.waitingMinutes = waitingTime;
	}

	public double getGrandTotalAmt() {
		return grandTotalAmt;
	}

	public void setGrandTotalAmt(Double grandTotalAmt) {
		this.grandTotalAmt = grandTotalAmt;
	}

	public String getFareDescription() {
		return fareDescription;
	}

	public void setFareDescription(String fareDescription) {
		this.fareDescription = fareDescription;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(Double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHourlyAmt() {
		return hourlyAmt;
	}

	public void setHourlyAmt(Double hourlyAmt) {
		this.hourlyAmt = hourlyAmt;
	}

	public int getTipsPercent() {
		return tipsPercent;
	}

	public void setTipsPercent(int tipsPercent) {
		this.tipsPercent = tipsPercent;
	}

	public double getStopsAmt() {
		return stopsAmt;
	}

	public void setStopsAmt(double stopsAmt) {
		this.stopsAmt = stopsAmt;
	}

	public String getAlephPriceId() {
		return alephPriceId;
	}

	public void setAlephPriceId(String alephPriceId) {
		this.alephPriceId = alephPriceId;
	}

	public Date getBlockedTillDtm() {
		return blockedTillDtm;
	}

	public void setBlockedTillDtm(Date blockedTillDtm) {
		this.blockedTillDtm = blockedTillDtm;
	}
}
