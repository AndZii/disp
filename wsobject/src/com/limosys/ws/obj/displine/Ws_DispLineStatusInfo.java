package com.limosys.ws.obj.displine;

public class Ws_DispLineStatusInfo {

	private String statusCode;
	private String colorRGB;
	private String statusDesc;

	public Ws_DispLineStatusInfo(String statusCode, String colorRGB, String statusDesc) {
		this.statusCode = statusCode;
		this.colorRGB = colorRGB;
		this.statusDesc = statusDesc;
	}
	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @return the colorRGB
	 */
	public String getColorRGB() {
		return colorRGB;
	}
	/**
	 * @param colorRGB the colorRGB to set
	 */
	public void setColorRGB(String colorRGB) {
		this.colorRGB = colorRGB;
	}
	/**
	 * @return the statusDesc
	 */
	public String getStatusDesc() {
		return statusDesc;
	}
	/**
	 * @param statusDesc the statusDesc to set
	 */
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	
	
	

}
