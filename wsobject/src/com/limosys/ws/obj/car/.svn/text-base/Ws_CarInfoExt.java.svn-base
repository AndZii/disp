package com.limosys.ws.obj.car;

import java.util.Date;

public class Ws_CarInfoExt implements Cloneable {

	private String carId = "";
	private String drvrDsplId;
	private String deviceId;
	private String subId;
	private String deviceTypeCode;
	private String compId;
	private String carClass;
	private String carClassDesc;
	private String color;
	private String plate;
	private String driverName;
	private String driverCell;
	private String make;
	private String makeYear;
	private double lat, lon;
	private long locationTimeStamp = 0;
	private boolean locationSet = false;
	private double prevLat, prevLon;
	private long prevLocationTimeStamp = 0;
	private boolean prevLocationSet = false;
	private String icon;
	private long lastReadingTime;
	private double lastReadingDirection;
	private double lastReadingSpeed;
	private double bidAmt;
	private int ETA = -1;
	private int driverRating;
	private int compRating;
	private int affBlngId;
	private String compName;
	private String driverNickName;
	private double etaDistance;
	private String tlcBaseNumber;

	public long getLocationTimeStamp() {
		return locationTimeStamp;
	}

	public double getPrevLon() {
		return prevLon;
	}

	public double getPrevLat() {
		return prevLat;
	}

	public long getPrevLocationTimeStamp() {
		return prevLocationTimeStamp;
	}

	public boolean isPrevLocationSet() {
		return prevLocationSet;
	}

	public Ws_CarInfoExt() {
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getDrvrDsplId() {
		return drvrDsplId;
	}

	public void setDrvrDsplId(String drvrDsplId) {
		this.drvrDsplId = drvrDsplId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getSubId() {
		return subId;
	}

	public void setSubId(String subId) {
		this.subId = subId;
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

	public String getCarClass() {
		return carClass;
	}

	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}

	public String getCarClassDesc() {
		return carClassDesc;
	}

	public void setCarClassDesc(String carClassDesc) {
		this.carClassDesc = carClassDesc;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverCell() {
		return driverCell;
	}

	public void setDriverCell(String driverCell) {
		this.driverCell = driverCell;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(String makeYear) {
		this.makeYear = makeYear;
	}

	public double getLat() {
		return lat;
	}

	public void setLocation(double lat, double lon, long timeStamp) {
		this.lat = lat;
		this.lon = lon;
		this.locationTimeStamp = timeStamp;
		this.locationSet = true;
	}

	public double getLon() {
		return lon;
	}

	public boolean isLocationSet() {
		return locationSet;
	}

	public void setPrevLocation(double lat, double lon, long timeStamp) {
		this.prevLat = lat;
		this.prevLon = lon;
		this.prevLocationTimeStamp = timeStamp;
		this.prevLocationSet = true;
	}
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public long getLastReadingTime() {
		return lastReadingTime;
	}

	public void setLastReadingTime(long lastReadingTime) {
		this.lastReadingTime = lastReadingTime;
	}

	public double getLastReadingDirection() {
		return lastReadingDirection;
	}

	public void setLastReadingDirection(double lastReadingDirection) {
		this.lastReadingDirection = lastReadingDirection;
	}

	public double getLastReadingSpeed() {
		return lastReadingSpeed;
	}

	public void setLastReadingSpeed(double lastReadingSpeed) {
		this.lastReadingSpeed = lastReadingSpeed;
	}

	public double getBidAmt() {
		return bidAmt;
	}

	public void setBidAmt(double bidAmt) {
		this.bidAmt = bidAmt;
	}

	public int getETA() {
		return ETA;
	}

	public void setETA(int eTA) {
		ETA = eTA;
	}

	public int getDriverRating() {
		return driverRating;
	}

	public void setDriverRating(int driverRating) {
		this.driverRating = driverRating;
	}

	public int getCompRating() {
		return compRating;
	}

	public void setCompRating(int compRating) {
		this.compRating = compRating;
	}

	public int getAffBlngId() {
		return affBlngId;
	}

	public void setAffBlngId(int affBlngId) {
		this.affBlngId = affBlngId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getDriverNickName() {
		return driverNickName;
	}

	public void setDriverNickName(String driverNickName) {
		this.driverNickName = driverNickName;
	}

	public double getEtaDistance() {
		return etaDistance;
	}

	public void setEtaDistance(double etaDistance) {
		this.etaDistance = etaDistance;
	}

	public String getTlcBaseNumber() {
		return tlcBaseNumber;
	}

	public void setTlcBaseNumber(String tlcBaseNumber) {
		this.tlcBaseNumber = tlcBaseNumber;
	}

	public Ws_CarInfoExt clone() {
		try {
			return (Ws_CarInfoExt) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new RuntimeException("Clone not supported");
		}
	}

	public Ws_CarInfo createWsCarInfo() {
		Ws_CarInfo carInfo = new Ws_CarInfo();
		carInfo.setCarId(carId);
		carInfo.setCarClass(carClass);
		carInfo.setLat(lat);
		carInfo.setLng(lon);
		carInfo.setGpsDtm(new Date(locationTimeStamp));
		if (prevLocationSet) {
			carInfo.setHasPrevValues(true);
			carInfo.setPrevLat(prevLat);
			carInfo.setPrevLng(prevLon);
			carInfo.setPrevGpsDtm(new Date(prevLocationTimeStamp));
		}

		//TODO: for now we need just this data, but should complete this method

		return carInfo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ETA;
		result = prime * result + affBlngId;
		long temp;
		temp = Double.doubleToLongBits(bidAmt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((carClass == null) ? 0 : carClass.hashCode());
		result = prime * result + ((carClassDesc == null) ? 0 : carClassDesc.hashCode());
		result = prime * result + ((carId == null) ? 0 : carId.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((compId == null) ? 0 : compId.hashCode());
		result = prime * result + ((compName == null) ? 0 : compName.hashCode());
		result = prime * result + compRating;
		result = prime * result + ((deviceId == null) ? 0 : deviceId.hashCode());
		result = prime * result + ((deviceTypeCode == null) ? 0 : deviceTypeCode.hashCode());
		result = prime * result + ((driverCell == null) ? 0 : driverCell.hashCode());
		result = prime * result + ((driverName == null) ? 0 : driverName.hashCode());
		result = prime * result + ((driverNickName == null) ? 0 : driverNickName.hashCode());
		result = prime * result + driverRating;
		result = prime * result + ((drvrDsplId == null) ? 0 : drvrDsplId.hashCode());
		temp = Double.doubleToLongBits(etaDistance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((icon == null) ? 0 : icon.hashCode());
		temp = Double.doubleToLongBits(lastReadingDirection);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lastReadingSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (lastReadingTime ^ (lastReadingTime >>> 32));
		temp = Double.doubleToLongBits(lat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (locationSet ? 1231 : 1237);
		result = prime * result + (int) (locationTimeStamp ^ (locationTimeStamp >>> 32));
		temp = Double.doubleToLongBits(lon);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((makeYear == null) ? 0 : makeYear.hashCode());
		result = prime * result + ((plate == null) ? 0 : plate.hashCode());
		temp = Double.doubleToLongBits(prevLat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (prevLocationSet ? 1231 : 1237);
		result = prime * result + (int) (prevLocationTimeStamp ^ (prevLocationTimeStamp >>> 32));
		temp = Double.doubleToLongBits(prevLon);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((subId == null) ? 0 : subId.hashCode());
		result = prime * result + ((tlcBaseNumber == null) ? 0 : tlcBaseNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Ws_CarInfoExt)) return false;
		Ws_CarInfoExt other = (Ws_CarInfoExt) obj;
		if (ETA != other.ETA) return false;
		if (affBlngId != other.affBlngId) return false;
		if (Double.doubleToLongBits(bidAmt) != Double.doubleToLongBits(other.bidAmt)) return false;
		if (carClass == null) {
			if (other.carClass != null) return false;
		} else if (!carClass.equals(other.carClass)) return false;
		if (carClassDesc == null) {
			if (other.carClassDesc != null) return false;
		} else if (!carClassDesc.equals(other.carClassDesc)) return false;
		if (carId == null) {
			if (other.carId != null) return false;
		} else if (!carId.equals(other.carId)) return false;
		if (color == null) {
			if (other.color != null) return false;
		} else if (!color.equals(other.color)) return false;
		if (compId == null) {
			if (other.compId != null) return false;
		} else if (!compId.equals(other.compId)) return false;
		if (compName == null) {
			if (other.compName != null) return false;
		} else if (!compName.equals(other.compName)) return false;
		if (compRating != other.compRating) return false;
		if (deviceId == null) {
			if (other.deviceId != null) return false;
		} else if (!deviceId.equals(other.deviceId)) return false;
		if (deviceTypeCode == null) {
			if (other.deviceTypeCode != null) return false;
		} else if (!deviceTypeCode.equals(other.deviceTypeCode)) return false;
		if (driverCell == null) {
			if (other.driverCell != null) return false;
		} else if (!driverCell.equals(other.driverCell)) return false;
		if (driverName == null) {
			if (other.driverName != null) return false;
		} else if (!driverName.equals(other.driverName)) return false;
		if (driverNickName == null) {
			if (other.driverNickName != null) return false;
		} else if (!driverNickName.equals(other.driverNickName)) return false;
		if (driverRating != other.driverRating) return false;
		if (drvrDsplId == null) {
			if (other.drvrDsplId != null) return false;
		} else if (!drvrDsplId.equals(other.drvrDsplId)) return false;
		if (Double.doubleToLongBits(etaDistance) != Double.doubleToLongBits(other.etaDistance)) return false;
		if (icon == null) {
			if (other.icon != null) return false;
		} else if (!icon.equals(other.icon)) return false;
		if (Double.doubleToLongBits(lastReadingDirection) != Double.doubleToLongBits(other.lastReadingDirection))
			return false;
		if (Double.doubleToLongBits(lastReadingSpeed) != Double.doubleToLongBits(other.lastReadingSpeed)) return false;
		if (lastReadingTime != other.lastReadingTime) return false;
		if (Double.doubleToLongBits(lat) != Double.doubleToLongBits(other.lat)) return false;
		if (locationSet != other.locationSet) return false;
		if (locationTimeStamp != other.locationTimeStamp) return false;
		if (Double.doubleToLongBits(lon) != Double.doubleToLongBits(other.lon)) return false;
		if (make == null) {
			if (other.make != null) return false;
		} else if (!make.equals(other.make)) return false;
		if (makeYear == null) {
			if (other.makeYear != null) return false;
		} else if (!makeYear.equals(other.makeYear)) return false;
		if (plate == null) {
			if (other.plate != null) return false;
		} else if (!plate.equals(other.plate)) return false;
		if (Double.doubleToLongBits(prevLat) != Double.doubleToLongBits(other.prevLat)) return false;
		if (prevLocationSet != other.prevLocationSet) return false;
		if (prevLocationTimeStamp != other.prevLocationTimeStamp) return false;
		if (Double.doubleToLongBits(prevLon) != Double.doubleToLongBits(other.prevLon)) return false;
		if (subId == null) {
			if (other.subId != null) return false;
		} else if (!subId.equals(other.subId)) return false;
		if (tlcBaseNumber == null) {
			if (other.tlcBaseNumber != null) return false;
		} else if (!tlcBaseNumber.equals(other.tlcBaseNumber)) return false;
		return true;
	}

}
