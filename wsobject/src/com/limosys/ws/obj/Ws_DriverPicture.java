package com.limosys.ws.obj;

public class Ws_DriverPicture extends Ws_Base {

	String carId, compId, iconData64;

	public Ws_DriverPicture() {
		super();
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getCompId() {
		return compId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	public String getIconData64() {
		return iconData64;
	}

	public void setIconData64(String iconData64) {
		this.iconData64 = iconData64;
	}

}
