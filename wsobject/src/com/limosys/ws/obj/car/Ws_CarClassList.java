package com.limosys.ws.obj.car;

import java.util.List;
import java.util.Vector;

import com.limosys.ws.obj.Ws_Base;
import com.limosys.ws.obj.Ws_MiscChargeLkupItem;

public class Ws_CarClassList extends Ws_Base {
	private static final long serialVersionUID = 1L;

	private List<Ws_CarClass> carClasses = new Vector<Ws_CarClass>();
	private List<Ws_MiscChargeLkupItem> miscChargeLkupItemList = new Vector<Ws_MiscChargeLkupItem>();

	public Ws_CarClassList() {}

	public List<Ws_CarClass> getCarClasses() {
		return carClasses;
	}

	public void setCarClasses(List<Ws_CarClass> carClasses) {
		this.carClasses = carClasses;
	}

	public List<Ws_MiscChargeLkupItem> getMiscChargeLkupItemList() {
		return miscChargeLkupItemList;
	}

	public void setMiscChargeLkupItemList(List<Ws_MiscChargeLkupItem> miscChargeLkupItemList) {
		this.miscChargeLkupItemList = miscChargeLkupItemList;
	}
	
}
