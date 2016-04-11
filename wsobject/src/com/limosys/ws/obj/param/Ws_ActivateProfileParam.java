package com.limosys.ws.obj.param;

import com.limosys.ws.obj.profile.Ws_Profile;

public class Ws_ActivateProfileParam {
	private Ws_Profile profile;
	private String deviceId;
	private String activateionCode;

	public Ws_ActivateProfileParam(Ws_Profile profile, String deviceId, String activationCode) {
		this.profile = profile;
		this.deviceId = deviceId;
		this.activateionCode = activationCode;
	}

	public Ws_Profile getProfile() {
		return profile;
	}

	public void setProfile(Ws_Profile profile) {
		this.profile = profile;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getActivateionCode() {
		return activateionCode;
	}

	public void setActivateionCode(String activateionCode) {
		this.activateionCode = activateionCode;
	}
}
