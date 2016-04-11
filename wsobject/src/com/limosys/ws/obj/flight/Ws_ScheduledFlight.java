package com.limosys.ws.obj.flight;

import com.limosys.ws.obj.Ws_Base;

public class Ws_ScheduledFlight {
	private java.lang.String carrierFsCode;

	private Ws_Airline carrier;

	private java.lang.String flightNumber;

	private java.lang.String brand;

	private Ws_Airport departureAirport;

	private java.lang.String departureAirportFsCode;

	private Ws_Airport arrivalAirport;

	private String arrivalAirportFsCode;

	private int stops;

	private String departureTerminal;

	private String arrivalTerminal;

	private String departureTime;

	private String arrivalTime;

	private String flightEquipmentIataCode;

	private Ws_Equipment flightEquipment;

	private boolean isCodeshare;

	private boolean isWetlease;

	private String serviceType;

	private String[] serviceClasses;

	private String[] trafficRestrictions;

	private Ws_Operator operator;

	private Ws_Codeshare[] codeshares;

	private Ws_Airline wetleaseOperator;

	private String wetleaseOperatorFsCode;

	private String referenceCode;

	public Ws_ScheduledFlight() {
		// TODO Auto-generated constructor stub
	}

	public java.lang.String getCarrierFsCode() {
		return carrierFsCode;
	}

	public void setCarrierFsCode(java.lang.String carrierFsCode) {
		this.carrierFsCode = carrierFsCode;
	}

	public Ws_Airline getCarrier() {
		return carrier;
	}

	public void setCarrier(Ws_Airline carrier) {
		this.carrier = carrier;
	}

	public java.lang.String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(java.lang.String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public java.lang.String getBrand() {
		return brand;
	}

	public void setBrand(java.lang.String brand) {
		this.brand = brand;
	}

	public Ws_Airport getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(Ws_Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	public java.lang.String getDepartureAirportFsCode() {
		return departureAirportFsCode;
	}

	public void setDepartureAirportFsCode(java.lang.String departureAirportFsCode) {
		this.departureAirportFsCode = departureAirportFsCode;
	}

	public Ws_Airport getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(Ws_Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public String getArrivalAirportFsCode() {
		return arrivalAirportFsCode;
	}

	public void setArrivalAirportFsCode(String arrivalAirportFsCode) {
		this.arrivalAirportFsCode = arrivalAirportFsCode;
	}

	public int getStops() {
		return stops;
	}

	public void setStops(int stops) {
		this.stops = stops;
	}

	public String getDepartureTerminal() {
		return departureTerminal;
	}

	public void setDepartureTerminal(String departureTerminal) {
		this.departureTerminal = departureTerminal;
	}

	public String getArrivalTerminal() {
		return arrivalTerminal;
	}

	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getFlightEquipmentIataCode() {
		return flightEquipmentIataCode;
	}

	public void setFlightEquipmentIataCode(String flightEquipmentIataCode) {
		this.flightEquipmentIataCode = flightEquipmentIataCode;
	}

	public Ws_Equipment getFlightEquipment() {
		return flightEquipment;
	}

	public void setFlightEquipment(Ws_Equipment flightEquipment) {
		this.flightEquipment = flightEquipment;
	}

	public boolean isCodeshare() {
		return isCodeshare;
	}

	public void setCodeshare(boolean isCodeshare) {
		this.isCodeshare = isCodeshare;
	}

	public boolean isWetlease() {
		return isWetlease;
	}

	public void setWetlease(boolean isWetlease) {
		this.isWetlease = isWetlease;
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

	public Ws_Operator getOperator() {
		return operator;
	}

	public void setOperator(Ws_Operator operator) {
		this.operator = operator;
	}

	public Ws_Codeshare[] getCodeshares() {
		return codeshares;
	}

	public void setCodeshares(Ws_Codeshare[] codeshares) {
		this.codeshares = codeshares;
	}

	public Ws_Airline getWetleaseOperator() {
		return wetleaseOperator;
	}

	public void setWetleaseOperator(Ws_Airline wetleaseOperator) {
		this.wetleaseOperator = wetleaseOperator;
	}

	public String getWetleaseOperatorFsCode() {
		return wetleaseOperatorFsCode;
	}

	public void setWetleaseOperatorFsCode(String wetleaseOperatorFsCode) {
		this.wetleaseOperatorFsCode = wetleaseOperatorFsCode;
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

}
