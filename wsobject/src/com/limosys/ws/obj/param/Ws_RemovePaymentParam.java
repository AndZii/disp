package com.limosys.ws.obj.param;

public class Ws_RemovePaymentParam {
	private int custId;
	private String deviceId;
	private int fopSeqNum;

	public Ws_RemovePaymentParam(int custId, String deviceId, int fopSeqNum) {
		this.setCustId(custId);
		this.setDeviceId(deviceId);
		this.setFopSeqNum(fopSeqNum);
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

	public int getFopSeqNum() {
		return fopSeqNum;
	}

	public void setFopSeqNum(int fopSeqNum) {
		this.fopSeqNum = fopSeqNum;
	}
}
