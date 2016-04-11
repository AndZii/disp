package com.limosys.ws.obj.profile;

import com.limosys.ws.obj.Ws_Base;

public class Ws_ProfileSignInGoogleResult extends Ws_Base {

	private ResultCode resultCode = ResultCode.UNKNOWN;
	private Ws_Profile profile;

	public Ws_ProfileSignInGoogleResult(ResultCode resultCode, Ws_Profile profile) {
		this.resultCode = resultCode;
		this.profile = profile;
	}

	public Ws_ProfileSignInGoogleResult() {

	}

	public void setProfile(Ws_Profile profile) {
		this.profile = profile;
	}

	public ResultCode getResultCode() {
		return resultCode;
	}

	public void setResultCode(ResultCode resultCode) {
		this.resultCode = resultCode;
	}

	public Ws_Profile getProfile() {
		return profile;
	}

	public static enum ResultCode {
		OK,
		NO_PROFILE_CONNECTED_TO_THIS_GOOGLE,
		UNKNOWN;
	}
}
