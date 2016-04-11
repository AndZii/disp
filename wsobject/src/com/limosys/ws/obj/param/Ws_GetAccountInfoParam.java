package com.limosys.ws.obj.param;

public class Ws_GetAccountInfoParam {

	private String deviceId;
	private int custId;
	private String compId;
	private String acctDisplayId;

	public Ws_GetAccountInfoParam(int custId, String deviceId, String compId, String acctDisplayId) {
		this.setCustId(custId);
		this.setDeviceId(deviceId);
		this.setCompId(compId);
		this.setAcctDisplayId(acctDisplayId);
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

	public String getCompId() {
		return compId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	public String getAcctDisplayId() {
		return acctDisplayId;
	}

	public void setAcctDisplayId(String acctDisplayId) {
		this.acctDisplayId = acctDisplayId;
	}

}
