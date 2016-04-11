package com.limosys.ws.obj.param;

public class Ws_FacebookParam {
	private String deviceId;
	private String facebookUID;

	public Ws_FacebookParam(String facebookUID, String deviceId) {
		this.facebookUID = facebookUID;
		this.deviceId = deviceId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getFacebookUID() {
		return facebookUID;
	}

	public void setFacebookUID(String facebookUID) {
		this.facebookUID = facebookUID;
	}

}
