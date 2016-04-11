package com.limosys.ws.obj;

import java.util.List;
import java.util.Vector;

public class Ws_MobileFeedbackList extends Ws_Base {

	private int custId;
	private List<Ws_MobileFeedback> mobileFeedbackList = new Vector<Ws_MobileFeedback>();

	public Ws_MobileFeedbackList() {}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public List<Ws_MobileFeedback> getMobileFeedbackList() {
		return mobileFeedbackList;
	}

	public void setMobileFeedbackList(List<Ws_MobileFeedback> mobileFeedbackList) {
		this.mobileFeedbackList = mobileFeedbackList;
	}

}
