package com.limosys.ws.obj.job;

import com.limosys.ws.obj.Ws_Base;

public class Ws_Confirmation extends Ws_Base {

	private int jobId;
	private String msg = "";
	private Ws_JobInfo jobInfo;
	private Ws_JobObj jobObj;

	public Ws_Confirmation() {
	}

	public Ws_Confirmation(int jobId) {
		this.jobId = jobId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Ws_JobInfo getJobInfo() {
		return jobInfo;
	}

	public void setJobInfo(Ws_JobInfo jobInfo) {
		this.jobInfo = jobInfo;
	}

	public Ws_JobObj getJobObj() {
		return jobObj;
	}

	public void setJobObj(Ws_JobObj jobObj) {
		this.jobObj = jobObj;
	}

}
