package com.limosys.ws.obj.payment.account;

public class Ws_VerifyAccountByEmailParam {
	private String deviceId;
	private String acctDisplayId;
	private String email;
	private String phoneNumber;
	public Ws_VerifyAccountByEmailParam(String deviceId, String acctDisplayId, String email, String phoneNumber) {	  
	  this.deviceId = deviceId;
	  this.acctDisplayId = acctDisplayId;
	  this.email = email;
	  this.setPhoneNumber(phoneNumber);
  }
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getAcctDisplayId() {
		return acctDisplayId;
	}
	public void setAcctDisplayId(String acctDisplayId) {
		this.acctDisplayId = acctDisplayId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
