package com.limosys.ws.obj.airport;

import java.util.List;
import java.util.Vector;

import com.limosys.ws.obj.Ws_Base;


public class Ws_AirportInfoList extends Ws_Base {
	private List<Ws_AirportInfo> airports = new Vector<Ws_AirportInfo>();
	
	public Ws_AirportInfoList(){
	}

	public List<Ws_AirportInfo> getAirports() {
		return airports;
	}

	public void setAirports(List<Ws_AirportInfo> airports) {
		this.airports = airports;
	}
	
}
