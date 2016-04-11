package com.limosys.ws.obj.param;

import com.limosys.ws.obj.Ws_Base;

public class Ws_ParamCarAvailability extends Ws_Base {
	private Ws_ParamLatLng paramlatlng;
	private int maxCars;
	private String carClass;
	private boolean isCarmel;
	private boolean extraInfo;
	private String tlcMode;

	public Ws_ParamCarAvailability(double latitude, double longitude, double radiusMiles,
			String carClass,int maxCars,boolean isCarmel, boolean extraInfo)  {
		this(latitude, longitude, radiusMiles, carClass, maxCars, isCarmel, extraInfo, null);
	}

	public Ws_ParamCarAvailability(double latitude, double longitude, double radiusMiles,
																	String carClass, int maxCars, boolean isCarmel, boolean extraInfo, String tlcMode) {
		this.paramlatlng = new Ws_ParamLatLng(latitude, longitude, radiusMiles);
		this.carClass = carClass;
		this.maxCars = maxCars;
		this.isCarmel = isCarmel;
		this.extraInfo = extraInfo;
		this.tlcMode = tlcMode;
	}

	public Ws_ParamLatLng getParamlatlng() {
		return paramlatlng;
	}

	public void setParamlatlng(Ws_ParamLatLng paramlatlng) {
		this.paramlatlng = paramlatlng;
	}

	public int getMaxCars() {
		return maxCars;
	}

	public void setMaxCars(int maxCars) {
		this.maxCars = maxCars;
	}

	public String getCarClass() {
		return carClass;
	}

	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}

	public boolean isCarmel() {
		return isCarmel;
	}

	public void setCarmel(boolean isCarmel) {
		this.isCarmel = isCarmel;
	}

	public boolean isExtraInfo() {
		return extraInfo;
	}

	public void setExtraInfo(boolean extraInfo) {
		this.extraInfo = extraInfo;
	}

	public String getTlcMode() {
		return tlcMode;
	}

	public void setTlcMode(String tlcMode) {
		this.tlcMode = tlcMode;
	}
	
}
