package com.limosys.ws.obj.displine;

public class Ws_SetLineParametersDispatchParam extends Ws_DispAuthParam {

	private String statusCode;
	private Integer reqCarsCounter;
	private Double incentiveAmount;
	private String lineDescription;

	public Ws_SetLineParametersDispatchParam(int empId, String deviceId, int lineId, String lineDescription) {
		super(empId, deviceId, lineId);
		this.lineDescription = lineDescription;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Integer getReqCarsCounter() {
		return reqCarsCounter;
	}

	public void setReqCarsCounter(Integer reqCarsCounter) {
		this.reqCarsCounter = reqCarsCounter;
	}

	public Double getIncentiveAmount() {
		return incentiveAmount;
	}

	public void setIncentiveAmount(Double incentiveAmount) {
		this.incentiveAmount = incentiveAmount;
	}

	public String getLineDescription() {
		return lineDescription;
	}

	public void setLineDescription(String lineDescription) {
		this.lineDescription = lineDescription;
	}

}
