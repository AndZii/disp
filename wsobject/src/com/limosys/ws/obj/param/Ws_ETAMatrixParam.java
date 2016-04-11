package com.limosys.ws.obj.param;

import java.util.List;

import com.limosys.ws.obj.car.Ws_CarGps;

public class Ws_ETAMatrixParam {
	private double latitude, longitude;
	private final List<Ws_CarGps> carList;
	
	public Ws_ETAMatrixParam(double latitude, double longitude, List<Ws_CarGps> carList) {
		this.setLatitude(latitude);
		this.setLongitude(longitude);
		this.carList = carList;
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

	public List<Ws_CarGps> getCarList() {
		return carList;
	}
}
