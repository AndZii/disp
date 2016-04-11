package com.limosys.ws.obj.flight;

import java.util.ArrayList;
import java.util.List;

import com.limosys.ws.obj.Ws_Base;

public class Ws_ScheduledFlightList extends Ws_Base {

	private List<Ws_ScheduledFlight> list = new ArrayList<Ws_ScheduledFlight>();
	public Ws_ScheduledFlightList() {

	}

	public List<Ws_ScheduledFlight> getList() {
		return list;
	}

	public void setList(List<Ws_ScheduledFlight> list) {
		this.list = list;
	}

}
