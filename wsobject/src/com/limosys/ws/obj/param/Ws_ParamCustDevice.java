package com.limosys.ws.obj.param;

public class Ws_ParamCustDevice {

	private int custId;
	private String deviceId;

	public Ws_ParamCustDevice(String deviceId, int custId) {
		this.deviceId = deviceId;
		this.custId = custId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

}
