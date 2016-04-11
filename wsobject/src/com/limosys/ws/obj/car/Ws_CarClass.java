package com.limosys.ws.obj.car;

import java.util.List;

import com.limosys.ws.obj.Ws_Icon;
import com.limosys.ws.obj.Ws_MiscChargeLkupItem;

public class Ws_CarClass {

	private String carClassId;
	private String carClassDesc;
	private String assignCarClassCode;
	private int carClassSortSeq;
	private boolean meetAndGreetInd;
	private String carClassDescDetail;
	private Ws_Icon icon;
	private int luggageQty;
	private int passangerQty;
	private Ws_Icon mapIcon;
	private List<Ws_MiscChargeLkupItem> miscChargeList;
	private boolean carClassMobile;

	public Ws_CarClass() {
}

	public String getCarClassId() {
		return carClassId;
	}

	public void setCarClassId(String carClassId) {
		this.carClassId = carClassId;
	}

	public String getCarClassDesc() {
		return carClassDesc;
	}

	public void setCarClassDesc(String carClassDesc) {
		this.carClassDesc = carClassDesc;
	}

	public String getAssignCarClassCode() {
		return assignCarClassCode;
	}

	public void setAssignCarClassCode(String assignCarClassCode) {
		this.assignCarClassCode = assignCarClassCode;
	}

	public int getCarClassSortSeq() {
		return carClassSortSeq;
	}

	public void setCarClassSortSeq(int carClassSortSeq) {
		this.carClassSortSeq = carClassSortSeq;
	}

	public boolean isMeetAndGreetInd() {
		return meetAndGreetInd;
	}

	public void setMeetAndGreetInd(boolean meetAndGreetInd) {
		this.meetAndGreetInd = meetAndGreetInd;
	}

	public String getCarClassDescDetail() {
		return carClassDescDetail;
	}

	public void setCarClassDescDetail(String carClassDescDetail) {
		this.carClassDescDetail = carClassDescDetail;
	}

	public Ws_Icon getIcon() {
		return icon;
	}

	public void setIcon(Ws_Icon icon) {
		this.icon = icon;
	}

	public int getLuggageQty() {
		return luggageQty;
	}

	public void setLuggageQty(int luggageQty) {
		this.luggageQty = luggageQty;
	}

	public int getPassangerQty() {
		return passangerQty;
	}

	public void setPassangerQty(int passangerQty) {
		this.passangerQty = passangerQty;
	}

	public List<Ws_MiscChargeLkupItem> getMiscChargeList() {
		return miscChargeList;
	}

	public void setMiscChargeList(List<Ws_MiscChargeLkupItem> miscChargeList) {
		this.miscChargeList = miscChargeList;
	}

	public Ws_Icon getMapIcon() {
		return mapIcon;
	}

	public void setMapIcon(Ws_Icon mapIcon) {
		this.mapIcon = mapIcon;
	}

	public boolean isCarClassMobile() {
		return carClassMobile;
	}

	public void setCarClassMobile(boolean carClassMobile) {
		this.carClassMobile = carClassMobile;
	}

}