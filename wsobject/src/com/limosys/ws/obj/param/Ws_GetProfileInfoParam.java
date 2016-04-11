package com.limosys.ws.obj.param;

public class Ws_GetProfileInfoParam {
	private String deviceId;
	private int custId;
	
	
	public Ws_GetProfileInfoParam(String deviceId, int custId) {
		super();
		this.deviceId = deviceId;
		this.custId = custId;
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
