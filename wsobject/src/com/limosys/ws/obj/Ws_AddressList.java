package com.limosys.ws.obj;

import java.util.List;
import java.util.Vector;


public class Ws_AddressList extends Ws_Base {
	private static final long serialVersionUID = 1L;
	
	private List<Ws_Address> addresses = new Vector<Ws_Address>();
	
	public Ws_AddressList(){
	}

	public List<Ws_Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Ws_Address> addresses) {
		this.addresses = addresses;
	}
	
}
