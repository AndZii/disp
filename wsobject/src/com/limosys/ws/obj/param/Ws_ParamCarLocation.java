package com.limosys.ws.obj.param;

import com.limosys.ws.obj.Ws_Base;

public class Ws_ParamCarLocation extends Ws_Base {
	private String compId;
	private String carId;
	private Integer maxSecondsOld;

	public Ws_ParamCarLocation(String compId, String carId, Integer maxSecondsOld) {
		super();
		this.compId = compId;
		this.carId = carId;
		this.maxSecondsOld = maxSecondsOld;
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

	public Integer getMaxSecondsOld() {
		return maxSecondsOld;
	}

	public void setMaxSecondsOld(Integer maxSecondsOld) {
		this.maxSecondsOld = maxSecondsOld;
	}
	
}
