package com.limosys.ws.obj.displine;

import java.util.List;

import com.limosys.ws.obj.Ws_Base;

public class Ws_GetLineStatusListResult extends Ws_Base {

	private List<Ws_DispLineStatusInfo> statusList;
	
	public Ws_GetLineStatusListResult() {
		
	}

	public List<Ws_DispLineStatusInfo> getStatusList() {
		return statusList;
	}

	public void setStatusList(List<Ws_DispLineStatusInfo> statusList) {
		this.statusList = statusList;
	}

}
