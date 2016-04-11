package com.limosys.ws.obj.payment;

public class Ws_PaymentType {

	private String fopCd;
	private String fopDesc;
	private String fopTypeCd;
	private String fopTypeDesc;
	private String icon;

	public Ws_PaymentType() {

	}

	public Ws_PaymentType(String fopCd, String fopDesc, String fopTypeCd, String fopTypeDesc) {
		this.setFopCd(fopCd);
		this.setFopDesc(fopDesc);
		this.setFopTypeCd(fopTypeCd);
		this.setFopTypeDesc(fopTypeDesc);
		this.setIcon(fopCd + ".png");
	}

	public String getFopCd() {
		return fopCd;
	}

	public void setFopCd(String fopCd) {
		this.fopCd = fopCd;
	}

	public String getFopDesc() {
		return fopDesc;
	}

	public void setFopDesc(String fopDesc) {
		this.fopDesc = fopDesc;
	}

	public String getFopTypeCd() {
		return fopTypeCd;
	}

	public void setFopTypeCd(String fopTypeCd) {
		this.fopTypeCd = fopTypeCd;
	}

	public String getFopTypeDesc() {
		return fopTypeDesc;
	}

	public void setFopTypeDesc(String fopTypeDesc) {
		this.fopTypeDesc = fopTypeDesc;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
