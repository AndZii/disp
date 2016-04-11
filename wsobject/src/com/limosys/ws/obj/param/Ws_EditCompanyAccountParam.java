package com.limosys.ws.obj.param;

import com.limosys.ws.obj.payment.account.Ws_MobileAccount;

public class Ws_EditCompanyAccountParam {
	private String deviceId;
	private int custId;
	private Ws_MobileAccount mAcct;

	public Ws_EditCompanyAccountParam(String deviceId, int custId, Ws_MobileAccount mAcct) {
		this.setDeviceId(deviceId);
		this.setCustId(custId);
		this.setmAcct(mAcct);
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

	public Ws_MobileAccount getmAcct() {
		return mAcct;
	}

	public void setmAcct(Ws_MobileAccount mAcct) {
		this.mAcct = mAcct;
	}
}
