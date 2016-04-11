package com.limosys.ws.obj.displine;

/**
 * Base class for disp line parameters, which require authorization. 
 * @author nik
 *
 */
public abstract class Ws_DispAuthParam {

	private int empId;
	private String deviceId;
	private int lineId;
	private String compName;
	private String carId;
	
	public Ws_DispAuthParam(String deviceId, String compName, String carId) {
		this.deviceId = deviceId;
		this.compName = compName;
		this.carId = carId;
	}
	
	public Ws_DispAuthParam(int empId, String deviceId, int lineId) {
		this.empId = empId;
		this.deviceId = deviceId;
		this.lineId = lineId;
	}
	
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public int getLineId() {
		return lineId;
	}

	public void setLineId(int lineId) {
		this.lineId = lineId;
	}



	public String getCompName() {
		return compName;
	}



	public void setCompName(String compName) {
		this.compName = compName;
	}



	public String getCarId() {
		return carId;
	}



	public void setCarId(String carId) {
		this.carId = carId;
	}
}
