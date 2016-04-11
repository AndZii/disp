package com.limosys.ws.obj.car;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.limosys.ws.obj.Ws_Base;
import com.limosys.ws.obj.Ws_LatLng;

public class Ws_CarInfo extends Ws_Base implements Cloneable {
	private String carId = "";
	private String carClass;
	private double lat;
	private double lng;
	private Date gpsDtm;
	private double bearing;
	private double speed;
	
	//prev values
	private boolean hasPrevValues = false;
	private double prevLat;
	private double prevLng;
	private Date prevGpsDtm;
	private double prevBearing;
	private double prevSpeed;
	
	private String drvrDsplId;
	private String wapPhoneNum;
	private String wapSubId;
	private String deviceTypeCode;	
	private String compId;
	private double distance;
	private String carMakeYear;
	private String carModelNme;
	private String drvrFirstName;
	private String drvrLastName;
	private String driverGenderCode;
	private String custGenderPreference; 
	
	private Set<String> childCarClassList;
	private String affCarClassId;
	private String affSysComp;
	
	//for directions cache	
	private List<Ws_LatLng> coordList;
	//	private PolylinePresisionMultiplier polylineMult = PolylinePresisionMultiplier.P_1E5;
	//	private List<String> polylineList;

	public Ws_CarInfo() {}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getCarClass() {
		return carClass;
	}

	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}
	
	public Date getGpsDtm() {
		return gpsDtm;
	}

	public void setGpsDtm(Date gpsDtm) {
		this.gpsDtm = gpsDtm;
	}

	public double getBearing() {
		return bearing;
	}

	public void setBearing(double bearing) {
		this.bearing = bearing;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getDrvrDsplId() {
		return drvrDsplId;
	}

	public void setDrvrDsplId(String drvrDsplId) {
		this.drvrDsplId = drvrDsplId;
	}

	public String getWapPhoneNum() {
		return wapPhoneNum;
	}

	public void setWapPhoneNum(String wapPhoneNum) {
		this.wapPhoneNum = wapPhoneNum;
	}

	public String getWapSubId() {
		return wapSubId;
	}

	public void setWapSubId(String wapSubId) {
		this.wapSubId = wapSubId;
	}

	public String getDeviceTypeCode() {
		return deviceTypeCode;
	}

	public void setDeviceTypeCode(String deviceTypeCode) {
		this.deviceTypeCode = deviceTypeCode;
	}

	public String getCompId() {
		return compId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getCarMakeYear() {
		return carMakeYear;
	}

	public void setCarMakeYear(String carMakeYear) {
		this.carMakeYear = carMakeYear;
	}

	public String getCarModelNme() {
		return carModelNme;
	}

	public void setCarModelNme(String carModelNme) {
		this.carModelNme = carModelNme;
	}

	public String getDriverGenderCode() {
		return driverGenderCode;
	}

	public void setDriverGenderCode(String driverGenderCode) {
		this.driverGenderCode = driverGenderCode;
	}

	public String getCustGenderPreference() {
		return custGenderPreference;
	}

	public void setCustGenderPreference(String custGenderPreference) {
		this.custGenderPreference = custGenderPreference;
	}

	public String getDrvrFirstName() {
		return drvrFirstName;
	}

	public void setDrvrFirstName(String drvrFirstName) {
		this.drvrFirstName = drvrFirstName;
	}

	public String getDrvrLastName() {
		return drvrLastName;
	}

	public void setDrvrLastName(String drvrLastName) {
		this.drvrLastName = drvrLastName;
	}

	public boolean isHasPrevValues() {
		return hasPrevValues;
	}

	public void setHasPrevValues(boolean hasPrevValues) {
		this.hasPrevValues = hasPrevValues;
	}

	public double getPrevLat() {
		return prevLat;
	}

	public void setPrevLat(double prevLat) {
		this.prevLat = prevLat;
	}

	public double getPrevLng() {
		return prevLng;
	}

	public void setPrevLng(double prevLng) {
		this.prevLng = prevLng;
	}

	public Date getPrevGpsDtm() {
		return prevGpsDtm;
	}

	public void setPrevGpsDtm(Date prevGpsDtm) {
		this.prevGpsDtm = prevGpsDtm;
	}

	public double getPrevBearing() {
		return prevBearing;
	}

	public void setPrevBearing(double prevBearing) {
		this.prevBearing = prevBearing;
	}

	public double getPrevSpeed() {
		return prevSpeed;
	}

	public void setPrevSpeed(double prevSpeed) {
		this.prevSpeed = prevSpeed;
	}

	public Set<String> getChildCarClassList() {
		return childCarClassList;
	}

	public void setChildCarClassSet(Set<String> childCarClassList) {
		this.childCarClassList = childCarClassList;
	}

	public String getAffCarClassId() {
		return affCarClassId;
	}

	public void setAffCarClassId(String affCarClassId) {
		this.affCarClassId = affCarClassId;
	}

	public String getAffSysComp() {
		return affSysComp;
	}

	public void setAffSysComp(String affSysComp) {
		this.affSysComp = affSysComp;
	}

	//	public List<String> getPolylineList() {
	//		return polylineList;
	//	}
	//
	//	public void setPolylineList(List<String> polylineList) {
	//		this.polylineList = polylineList;
	//	}

	@Override
	public String toString() {
		return "{" + compId + ":" + carId + ":" + affSysComp + "}";
	}

	@Override
	public boolean equals(Object o) {
		if (o != null && o instanceof Ws_CarInfo) { return toString().equals(((Ws_CarInfo) o).toString()); }
		return false;
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public Ws_CarInfo clone() throws CloneNotSupportedException {

		Ws_CarInfo clone = (Ws_CarInfo) super.clone();
		if (this.childCarClassList != null) {
			clone.childCarClassList = new HashSet<String>();
			clone.childCarClassList.addAll(this.childCarClassList);
		}
		//		if (this.polylineList != null) {
		//			clone.polylineList = new ArrayList<String>();
		//			clone.polylineList.addAll(this.polylineList);
		//		}

		return clone;
	}

	public List<Ws_LatLng> getCoordList() {
		return coordList;
	}

	public void setCoordList(List<Ws_LatLng> coordList) {
		this.coordList = coordList;
	}

	//	public PolylinePresisionMultiplier getPolylineMult() {
	//		return polylineMult;
	//	}
	//
	//	public void setPolylineMult(PolylinePresisionMultiplier polylineMult) {
	//		this.polylineMult = polylineMult;
	//	}

}
