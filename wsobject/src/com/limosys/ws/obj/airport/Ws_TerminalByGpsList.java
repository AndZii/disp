package com.limosys.ws.obj.airport;

import java.util.ArrayList;
import java.util.List;

import com.limosys.ws.obj.Ws_Base;

public class Ws_TerminalByGpsList extends Ws_Base {
	private String airportCd;
	private double latitude;
	private double longitude;
	
	private List<Ws_TerminalByGpsItem> termList = new ArrayList<Ws_TerminalByGpsItem>();
	
	public Ws_TerminalByGpsList(String airportCd, double latitude, double longitude) {
		this.setAirportCd(airportCd);
		this.setLatitude(latitude);
		this.setLongitude(longitude);
	}
	
	public List<Ws_TerminalByGpsItem> getTerminalList() {
		return termList;
	}
	
	public String getAirportCd() {
		return airportCd;
	}

	public void setAirportCd(String airportCd) {
		this.airportCd = airportCd;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public static class Ws_TerminalByGpsItem {
		private String terminalName;
		private double distance;
		
		public Ws_TerminalByGpsItem(String terminalName, double distance) {
			this.setTerminalName(terminalName);
			this.setDistance(distance);
		}

		public String getTerminalName() {
			return terminalName;
		}

		public void setTerminalName(String terminalName) {
			this.terminalName = terminalName;
		}

		public double getDistance() {
			return distance;
		}

		public void setDistance(double distance) {
			this.distance = distance;
		}
	}
}
