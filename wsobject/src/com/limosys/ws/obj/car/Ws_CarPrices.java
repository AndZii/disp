package com.limosys.ws.obj.car;

import java.util.ArrayList;
import java.util.List;

import com.limosys.ws.obj.Ws_Base;
import com.limosys.ws.obj.Ws_MiscCharge;
import com.limosys.ws.obj.affiliate.Ws_AffiliateCarPrice;

public class Ws_CarPrices extends Ws_Base {

	private List<Ws_CarPrice> carPrices = new ArrayList<Ws_CarPrice>();
	private List<Ws_MiscCharge> miscCharges = new ArrayList<Ws_MiscCharge>();
	private List<Ws_AffiliateCarPrice> affCarPrices = new ArrayList<Ws_AffiliateCarPrice>();

	public Ws_CarPrices() {
	}

	public List<Ws_CarPrice> getCarPrices() {
		return carPrices;
	}

	public void setCarPrices(List<Ws_CarPrice> carPrices) {
		this.carPrices = carPrices;
	}

	public List<Ws_MiscCharge> getMiscCharges() {
		return miscCharges;
	}

	public void setMiscCharges(List<Ws_MiscCharge> miscCharges) {
		this.miscCharges = miscCharges;
	}

	public List<Ws_AffiliateCarPrice> getAffCarPrices() {
		return affCarPrices;
	}

	public void setAffCarPrices(List<Ws_AffiliateCarPrice> affCarPrices) {
		this.affCarPrices = affCarPrices;
	}
}
