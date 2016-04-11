package com.limosys.ws.obj.flight;

public class Ws_Operator {

	private String carrierFsCode;

	private String flightNumber;

	private String serviceType;

	private String[] serviceClasses;

	private String[] trafficRestrictions;

	public Ws_Operator() {
	}

	public String getCarrierFsCode() {
		return carrierFsCode;
	}

	public void setCarrierFsCode(String carrierFsCode) {
		this.carrierFsCode = carrierFsCode;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String[] getServiceClasses() {
		return serviceClasses;
	}

	public void setServiceClasses(String[] serviceClasses) {
		this.serviceClasses = serviceClasses;
	}

	public String[] getTrafficRestrictions() {
		return trafficRestrictions;
	}

	public void setTrafficRestrictions(String[] trafficRestrictions) {
		this.trafficRestrictions = trafficRestrictions;
	}

}
