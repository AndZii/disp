package com.limosys.ws.obj.payment.account;
	
import com.limosys.ws.obj.Ws_Base;

public class Ws_VerifyAccountByEmailResult extends Ws_Base {
	private boolean verificationCodeSent = false;
	private int custId = 0;
	public boolean isVerificationCodeSent() {
		return verificationCodeSent;
	}
	public void setVerificationCodeSent(boolean verificationCodeSent) {
		this.verificationCodeSent = verificationCodeSent;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	

}
