package com.limosys.ws.obj.affiliate;


public class Ws_CustAffPrefItem {

	private boolean isChecked;
	private Ws_Affiliate affiliate;

	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	public Ws_Affiliate getAffiliate() {
		return affiliate;
	}

	public void setAffiliate(Ws_Affiliate affiliate) {
		this.affiliate = affiliate;
	}
}
