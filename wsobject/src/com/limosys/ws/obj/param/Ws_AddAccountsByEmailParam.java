package com.limosys.ws.obj.param;

public class Ws_AddAccountsByEmailParam {

	private String deviceId;
	private int custId;

	public Ws_AddAccountsByEmailParam(int custId, String deviceId) {
		this.setDeviceId(deviceId);
		this.setCustId(custId);
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}
}
