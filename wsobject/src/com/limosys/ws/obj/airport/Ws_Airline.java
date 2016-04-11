package com.limosys.ws.obj.airport;

public class Ws_Airline {

	private String airlineNme;
	private String airlineCd;

	public Ws_Airline(String airlineCd, String airlineNme) {
		this.setAirlineCd(airlineCd);
		this.setAirlineNme(airlineNme);
	}

	public String getAirlineNme() {
		return airlineNme;
	}

	public void setAirlineNme(String airlineNme) {
		this.airlineNme = airlineNme;
	}

	public String getAirlineCd() {
		return airlineCd;
	}

	public void setAirlineCd(String airlineCd) {
		this.airlineCd = airlineCd;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Ws_Airline) {
			Ws_Airline obj = (Ws_Airline) o;
			if (((airlineNme == null && obj.airlineNme == null) || (airlineNme != null && airlineNme.equals(obj.airlineNme)))
					&& ((airlineCd == null && obj.airlineCd == null) || (airlineCd != null && airlineCd.equals(obj.airlineCd))))
				return true;
			else
				return false;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return ((airlineCd == null ? "null" : airlineCd) + "::::" + (airlineNme == null ? "null" : airlineNme)).hashCode();
	}

	@Override
	public String toString() {
		return airlineCd + " - " + airlineNme;
	}
}
