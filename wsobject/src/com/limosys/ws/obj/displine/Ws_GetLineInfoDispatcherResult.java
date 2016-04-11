package com.limosys.ws.obj.displine;

import com.limosys.ws.obj.Ws_Address;
import com.limosys.ws.obj.Ws_Base;

public class Ws_GetLineInfoDispatcherResult extends Ws_Base {

	private int id;
	private String name;
	private String desc;
	private Ws_Address address;
	private String status;
	private double incentiveAmount;
	private int reqCarsCounter;
	private boolean open;
	private String colorRgb;

	public Ws_GetLineInfoDispatcherResult() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Ws_Address getAddress() {
		return address;
	}

	public void setAddress(Ws_Address address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getIncentiveAmount() {
		return incentiveAmount;
	}

	public void setIncentiveAmount(double incentiveAmount) {
		this.incentiveAmount = incentiveAmount;
	}

	public int getReqCarsCounter() {
		return reqCarsCounter;
	}

	public void setReqCarsCounter(int reqCarsCounter) {
		this.reqCarsCounter = reqCarsCounter;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getColorRgb() {
		return colorRgb;
	}

	public void setColorRgb(String colorRgb) {
		this.colorRgb = colorRgb;
	}

}
