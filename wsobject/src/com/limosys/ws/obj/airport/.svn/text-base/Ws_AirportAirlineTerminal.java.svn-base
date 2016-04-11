package com.limosys.ws.obj.airport;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.limosys.ws.obj.Ws_Base;

public class Ws_AirportAirlineTerminal extends Ws_Base {

	private String airportCd;
	private Map<Ws_Airline, Set<String>> atMap = new HashMap<Ws_Airline, Set<String>>();

	public Ws_AirportAirlineTerminal(String airportCd) {
		this.setAirportCd(airportCd);
	}

	public String getAirportCd() {
		return airportCd;
	}

	public void setAirportCd(String airportCd) {
		this.airportCd = airportCd;
	}

	public void addAirlineTerminal(Ws_Airline airline, String terminal) {
		Set<String> terms = atMap.get(airline);
		if (terms == null) {
			terms = new HashSet<String>();
			atMap.put(airline, terms);
		}

		terms.add(terminal);
	}

	public Set<Ws_Airline> getAirlines() {
		return atMap.keySet();
	}

	public Set<String> getTerminals(Ws_Airline airline) {
		return atMap.get(airline);
	}
}
