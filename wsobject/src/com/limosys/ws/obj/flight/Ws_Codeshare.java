package com.limosys.ws.obj.flight;

public class Ws_Codeshare {

	private Ws_Airline carrier;

	private String carrierFsCode;

	private String flightNumber;

	private String serviceType;

	private String[] serviceClasses;

	private String[] trafficRestrictions;

	private Long referenceCode;

	public Ws_Codeshare() {
		// TODO Auto-generated constructor stub
	}
	public Ws_Airline getCarrier() {
		return carrier;
	}
	public void setCarrier(Ws_Airline carrier) {
		this.carrier = carrier;
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

	public Long getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(Long referenceCode) {
		this.referenceCode = referenceCode;
	}

}
