package com.limosys.ws.obj.param;

import com.limosys.ws.obj.Ws_Base;

public class Ws_ParamCarId extends Ws_Base {
	private String compId;
	private String carId;

	public Ws_ParamCarId(String compId, String carId) {
		super();
		this.compId = compId;
		this.carId = carId;
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
}
