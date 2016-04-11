package com.limosys.ws.obj.param;

import com.limosys.ws.obj.Ws_Base;

public class Ws_ParamCar extends Ws_Base implements Cloneable {
	private Ws_ParamLatLng paramlatlng;
	private int maxCars;
	private String carClass;
	private boolean askAffiliate = false;
	private String senderCompId;
	private String senderSysComp;

	public Ws_ParamCar(double latitude, double longitude, double radiusMiles,
			String carClass,int maxCars)  {
		this.paramlatlng = new Ws_ParamLatLng(latitude, longitude, radiusMiles);
		this.carClass = carClass;
		this.maxCars = maxCars;
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

	public boolean isAskAffiliate() {
		return askAffiliate;
	}

	public void setAskAffiliate(boolean askAffiliate) {
		this.askAffiliate = askAffiliate;
	}

	public String getSenderCompId() {
		return senderCompId;
	}

	public void setSenderCompId(String senderCompId) {
		this.senderCompId = senderCompId;
	}

	public String getSenderSysComp() {
		return senderSysComp;
	}

	public void setSenderSysComp(String senderSysComp) {
		this.senderSysComp = senderSysComp;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Ws_ParamCar cloned = (Ws_ParamCar) super.clone();
		cloned.setParamlatlng(paramlatlng != null ? (Ws_ParamLatLng)paramlatlng.clone() : null);
		return cloned;
	}

}
