package com.limosys.ws.obj.payment.account;

public class Ws_AccountSignInVerificationParam {
	private String deviceId;
	private int custId;
	private String acctDisplayId;
	private String emailAddr;
	private String phoneNumber;
	private String verificationCode;
	public Ws_AccountSignInVerificationParam(String deviceId, int custId, String acctDisplayId, String emailAddr, String phoneNumber, String verificationCode) {
	  this.deviceId = deviceId;
	  this.custId = custId;
	  this.acctDisplayId = acctDisplayId;
	  this.emailAddr = emailAddr;
	  this.setPhoneNumber(phoneNumber);
	  this.verificationCode = verificationCode;
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
	public String getAcctDisplayId() {
		return acctDisplayId;
	}
	public void setAcctDisplayId(String acctDisplayId) {
		this.acctDisplayId = acctDisplayId;
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	public String getVerificationCode() {
		return verificationCode;
	}
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
