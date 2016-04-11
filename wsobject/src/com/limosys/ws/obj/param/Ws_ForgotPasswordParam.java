package com.limosys.ws.obj.param;

public class Ws_ForgotPasswordParam {
	public static enum RestorType {
		BY_EMAIL, BY_USERNAME, BY_PHONE_NUMBER;
	}
	
	String email;

	RestorType restoreType;
	String restoreInfo;
	
	public Ws_ForgotPasswordParam () {
		
	}
	
	public Ws_ForgotPasswordParam(RestorType restoreType,String restoreInfo){
		this.restoreType = restoreType;
		this.restoreInfo = restoreInfo;
	}
	
	public RestorType getRestoreType() {
		return restoreType;
	}

	public void setRestoreType(RestorType restoreType) {
		this.restoreType = restoreType;
	}

	public String getRestoreInfo() {
		return restoreInfo;
	}

	public void setRestoreInfo(String restoreInfo) {
		this.restoreInfo = restoreInfo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
