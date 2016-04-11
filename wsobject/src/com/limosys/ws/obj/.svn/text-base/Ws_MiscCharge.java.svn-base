package com.limosys.ws.obj;

public class Ws_MiscCharge {
	private String title;
	private String shortTitle;
	private boolean comInd;
	private String minCarClass;
	private int count;
	private int maxCount;
	private double price;

	private String code;
	private String icon;
	private String data_type;

	public Ws_MiscCharge() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortTitle() {
		return shortTitle;
	}

	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public boolean isComInd() {
		return comInd;
	}

	public void setComInd(boolean comInd) {
		this.comInd = comInd;
	}

	public String getMinCarClass() {
		return minCarClass;
	}

	public void setMinCarClass(String minCarClass) {
		this.minCarClass = minCarClass;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	public void Ws_MiscChargeFromWs_MiscChargeLkupItem(Ws_MiscChargeLkupItem item) {
		this.code = item.getCode();
		this.title = item.getName();
		this.icon = item.getIcon();
		this.data_type = item.getType();
		this.shortTitle = item.getName();
	}
}
