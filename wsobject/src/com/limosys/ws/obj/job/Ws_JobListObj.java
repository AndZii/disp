package com.limosys.ws.obj.job;

import java.util.ArrayList;
import java.util.List;

import com.limosys.ws.obj.Ws_Base;

public class Ws_JobListObj extends Ws_Base {
	private List<Ws_JobObj> jobList = new ArrayList<Ws_JobObj>();
	private int totalJobs = 0;

	public Ws_JobListObj() {
	}

	public Ws_JobListObj(List<Ws_JobObj> list) {
		jobList = list;
	}

	public List<Ws_JobObj> getJobList() {
		return jobList;
	}

	public void setJobList(ArrayList<Ws_JobObj> jobList) {
		this.jobList = jobList;
	}

	public int getTotalJobs() {
		return totalJobs;
	}

	public void setTotalJobs(int totalJobs) {
		this.totalJobs = totalJobs;
	}

}
