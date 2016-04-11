package com.limosys.ws.obj.airport;

import java.util.HashMap;
import java.util.List;

import com.limosys.ws.obj.Ws_LatLng;

public class Ws_AirportInfo {
	private boolean empty;
	
	private String iataCity;
	private String name;
	private String code;
//	private String zone;
	private int zoneId;
	private boolean local;
	private double latitude;
	private double longitude;
	
	public List<List<Ws_LatLng>> getPolygons() {
		return polygons;
	}
	public void setPolygons(List<List<Ws_LatLng>> polygons) {
		this.polygons = polygons;
	}
	public HashMap<String, Ws_LatLng> getTerminals() {
		return terminals;
	}
	public void setTerminals(HashMap<String, Ws_LatLng> terminals) {
		this.terminals = terminals;
	}
	private List<List<Ws_LatLng>> polygons;
	private HashMap<String, Ws_LatLng> terminals;
	
	public Ws_AirportInfo(){
		name = new String();
		code = new String();
	//	zone = new String();
		zoneId = 0;
		empty = true;
	}
	public Ws_AirportInfo(String name, String code, int zoneId, String town, boolean local, double latitude, double longitude){
		this.name = name.replace("Int'l","International");
		this.code = code;
		this.empty = false;
		this.iataCity = town;
	//	this.zone = zone;
		this.zoneId = zoneId;
		this.local = local;
		this.setLatitude(latitude);
		this.setLongitude(longitude);
	}
	
	public String toString(){
		return code + " " + name;
	}
	
	public String getName(){
		return name;
	}
	public String getCode(){
		return code;
	}
	public String getTown(){
		return iataCity;
	}
	public String getAreaCode(){
		return "AP";
	}
//	public String getZone(){
//		return zone;
//	}
	public int getZoneId(){
		return zoneId;
	}
	public boolean isEmpty(){
		return empty;
	}
	
	public boolean isLocal(){
		return local;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
