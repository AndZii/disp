package com.limosys.ws.obj;

import java.util.ArrayList;
import java.util.List;

public class Ws_ETAMatrixResult extends Ws_Base {
	
	private final List<Ws_CarETA> carETAList = new ArrayList<Ws_CarETA>();
	
	public static class Ws_CarETA {
		private String carId;
		private String compId;
		private String affSysComp;	
		
		private short timeMin;
		private double distance;
		private int timeSec;
		
		public Ws_CarETA(String compId, String carId, String affSysComp, short timeMin, double distance, int timeSec) {
			this.setCompId(compId);
			this.setCarId(carId);
			this.setAffSysComp(affSysComp);
			this.setTimeMin(timeMin);
			this.setDistance(distance);
			this.setTimeSec(timeSec);
		}

		public String getCarId() {
			return carId;
		}

		public void setCarId(String carId) {
			this.carId = carId;
		}

		public String getCompId() {
			return compId;
		}

		public void setCompId(String compId) {
			this.compId = compId;
		}

		public String getAffSysComp() {
			return affSysComp;
		}

		public void setAffSysComp(String affSysComp) {
			this.affSysComp = affSysComp;
		}

		public short getTimeMin() {
			return timeMin;
		}

		public void setTimeMin(short timeMin) {
			this.timeMin = timeMin;
		}

		public double getDistance() {
			return distance;
		}

		public void setDistance(double distance) {
			this.distance = distance;
		}

		public int getTimeSec() {
			return timeSec;
		}

		public void setTimeSec(int timeSec) {
			this.timeSec = timeSec;
		}
	}

	public List<Ws_CarETA> getCarETAList() {
		return carETAList;
	}
}
