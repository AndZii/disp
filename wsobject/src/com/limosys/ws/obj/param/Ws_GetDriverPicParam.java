package com.limosys.ws.obj.param;

public class Ws_GetDriverPicParam {
	private String deviceId;
	private int custId;
	private int jobId;
	private String affCompId;
	private String affSystemComp;
	
	public Ws_GetDriverPicParam(String deviceId, int custId, int jobId) {
		this.setDeviceId(deviceId);
		this.setCustId(custId);
		this.setJobId(jobId);
	}

	public Ws_GetDriverPicParam(int jobId, String affCompId, String affSystemComp){
		this.jobId = jobId;
		this.affCompId = affCompId;
		this.affSystemComp = affSystemComp;
	}
	
	public String getAffCompId() {
		return affCompId;
	}



	public void setAffCompId(String affCompId) {
		this.affCompId = affCompId;
	}



	public String getAffSystemComp() {
		return affSystemComp;
	}



	public void setAffSystemComp(String affSystemComp) {
		this.affSystemComp = affSystemComp;
	}



	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	
}
