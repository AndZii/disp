package com.limosys.ws.obj.param;

import java.util.List;

import com.limosys.ws.obj.affiliate.Ws_CustAffPrefItem;

public class Ws_SaveCustAffPrefParam extends Ws_CustAffPrefParam {

	private List<Ws_CustAffPrefItem> affiliateCustPrefItems;
	
	public Ws_SaveCustAffPrefParam(int custId, String deviceId) {
		super(custId, deviceId);
	}

	public List<Ws_CustAffPrefItem> getAffiliateCustPrefItems() {
		return affiliateCustPrefItems;
	}

	public void setAffiliateCustPrefItems(List<Ws_CustAffPrefItem> affiliateCustPrefItems) {
		this.affiliateCustPrefItems = affiliateCustPrefItems;
	}

}
