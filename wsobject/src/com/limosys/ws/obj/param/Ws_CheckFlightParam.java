package com.limosys.ws.obj.param;

import java.util.Date;

public class Ws_CheckFlightParam {
	private String airlineCd;
	private String flightCd;
	private long date;

	public Ws_CheckFlightParam(String airlineCd, String flightCd, Date date) {
		this.airlineCd = airlineCd;
		this.flightCd = flightCd;
		this.date = date.getTime();
	}

	public String getAirlineCd() {
		return airlineCd;
	}

	public String getFlight() {
		return flightCd;
	}

	public Date getDate() {
		return new Date(date);
	}

}
