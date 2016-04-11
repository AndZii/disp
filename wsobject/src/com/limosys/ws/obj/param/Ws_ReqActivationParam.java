package com.limosys.ws.obj.param;

import com.limosys.ws.obj.profile.Ws_Profile;

public class Ws_ReqActivationParam {
	private Ws_Profile profile;
	private String deviceId;
	private boolean onlyCheck;

	public Ws_ReqActivationParam(Ws_Profile profile, String deviceId) {
		this.profile = profile;
		this.deviceId = deviceId;
		this.onlyCheck = false;
	}

	public Ws_ReqActivationParam(Ws_Profile profile, String deviceId, boolean onlyCheck) {
		this.profile = profile;
		this.deviceId = deviceId;
		this.onlyCheck = onlyCheck;
	}
	
	public boolean isOnlyCheck() {
		return onlyCheck;
	}

	public void setOnlyCheck(boolean onlyCheck) {
		this.onlyCheck = onlyCheck;
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
}
