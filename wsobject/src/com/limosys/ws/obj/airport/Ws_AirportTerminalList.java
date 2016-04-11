package com.limosys.ws.obj.airport;

import java.util.ArrayList;
import java.util.List;

import com.limosys.ws.obj.Ws_Base;

public class Ws_AirportTerminalList extends Ws_Base {

	private List<Ws_AirportTerminalListItem> airportTerminalList = new ArrayList<Ws_AirportTerminalListItem>();
	
	public static class Ws_AirportTerminalListItem {
		private String airportCd;
		private String terminal;
		private double distance;
		
		public Ws_AirportTerminalListItem (String airportCd, String terminal, double distance) {
			this.setAirportCd(airportCd);
			this.setTerminal(terminal);
			this.setDistance(distance);
		}

		public String getAirportCd() {
			return airportCd;
		}

		public void setAirportCd(String airportCd) {
			this.airportCd = airportCd;
		}

		public String getTerminal() {
			return terminal;
		}

		public void setTerminal(String terminal) {
			this.terminal = terminal;
		}

		public double getDistance() {
			return distance;
		}

		public void setDistance(double distance) {
			this.distance = distance;
		}
	}

	public List<Ws_AirportTerminalListItem> getAirportTerminalList() {
		return airportTerminalList;
	}	
}
