package com.limosys.ws.obj.param;

public class Ws_GoogleCustParam {
	private String googleUID;
	private int custId;
	private String deviceId;

	public Ws_GoogleCustParam(String deviceId, int custId, String googleUID) {
		this.setDeviceId(deviceId);
		this.setCustId(custId);
		this.setGoogleUID(googleUID);
	}

	public String getGoogleUID() {
		return googleUID;
	}

	public void setGoogleUID(String googleUID) {
		this.googleUID = googleUID;
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
