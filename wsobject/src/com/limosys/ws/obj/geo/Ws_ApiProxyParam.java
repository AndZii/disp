package com.limosys.ws.obj.geo;

public class Ws_ApiProxyParam {

	private ApiType type;
	private String parameters;
	private String deviceId;
	private int custId = 0;
	
	public Ws_ApiProxyParam(String deviceId, ApiType type, String parameters, int custId) {
		this.type = type;
		this.deviceId = deviceId;
		this.parameters = parameters;
		this.custId = custId;
	}

	/**
	 * @return the type
	 */
	public ApiType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ApiType type) {
		this.type = type;
	}

	/**
	 * @return the parameters
	 */
	public String getParameters() {
		return parameters;
	}

	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}

	
}
