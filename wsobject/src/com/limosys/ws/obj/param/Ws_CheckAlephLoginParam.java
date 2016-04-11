package com.limosys.ws.obj.param;

public class Ws_CheckAlephLoginParam {
	private String deviceId;
	private int custId;
	
	public Ws_CheckAlephLoginParam(String deviceId, int custId) {
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
