package com.limosys.ws.obj.car;

import java.util.Date;

import com.limosys.ws.obj.Ws_Base;

public class Ws_CarLocation extends Ws_Base {

	private static final long serialVersionUID = 1L;
	private double altitude;
	private double latitude;
	private double longitude;
	private Date gpsDtm;
	private double bearing;
	private double speed;
	private String provider;
	private double accuracy;

	public Ws_CarLocation() {
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
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

	public Date getGpsDtm() {
		return gpsDtm;
	}

	public void setGpsDtm(Date gpsDtm) {
		this.gpsDtm = gpsDtm;
	}

	public double getBearing() {
		return bearing;
	}

	public void setBearing(double bearing) {
		this.bearing = bearing;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public double getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String toString(){
		String s="\nAltitude=" + this.altitude + "\nLatitude=" + this.latitude + "\nLongitude=" + this.longitude
				+ "\nBearing=" + this.bearing + "\nSpeed=" + this.speed + "\nProvider=" + this.provider + "\nGpsDtm=" + this.gpsDtm 
				+ "\nAccuracy=" + this.accuracy;
		return s;
	}

}
