package com.limosys.ws.obj.param;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.limosys.ws.obj.Ws_Base;

public class Ws_ParamGoogleApiStat extends Ws_Base {
	private String deviceId;
	private Date date;
	private Map<String, Integer> taskStatMap = new HashMap<String, Integer>();

	public Ws_ParamGoogleApiStat(String device_id, Date date) {
		this.deviceId = device_id;
		this.date = date;

	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String device_id) {
		this.deviceId = device_id;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Map<String, Integer> getTaskStatMap() {
		return taskStatMap;
	}

	public void setTaskStatMap(Map<String, Integer> taskStatMap) {
		this.taskStatMap = taskStatMap;
	}

}
