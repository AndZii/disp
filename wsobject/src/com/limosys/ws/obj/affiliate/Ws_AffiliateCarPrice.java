package com.limosys.ws.obj.affiliate;

import com.limosys.ws.obj.car.Ws_CarPrices;

public class Ws_AffiliateCarPrice {

	private final Ws_Affiliate affiliate;
	private Ws_CarPrices carPrices;

	public Ws_AffiliateCarPrice(Ws_Affiliate aff) {
		this.affiliate = aff;
	}

	public Ws_CarPrices getCarPrice() {
		return carPrices;
	}

	public void setCarPrices(Ws_CarPrices carPrices) {
		this.carPrices = carPrices;
	}

	public Ws_Affiliate getAffiliate() {
		return affiliate;
	}
}
