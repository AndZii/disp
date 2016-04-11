package com.limosys.ws.obj.param;

public class Ws_FacebookCustParam {
	private String facebookUID;
	private int custId;
	private String deviceId;
	
	public Ws_FacebookCustParam(String deviceId, int custId, String facebookUID) {
		this.setDeviceId(deviceId);
		this.setCustId(custId);
		this.setFacebookUID(facebookUID);
	}

	public String getFacebookUID() {
		return facebookUID;
	}

	public void setFacebookUID(String facebookUID) {
		this.facebookUID = facebookUID;
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
