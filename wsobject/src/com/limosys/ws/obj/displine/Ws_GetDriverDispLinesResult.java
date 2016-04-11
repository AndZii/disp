package com.limosys.ws.obj.displine;

import java.util.List;

import com.limosys.ws.obj.Ws_Base;

public class Ws_GetDriverDispLinesResult extends Ws_Base {
	
	private List<Ws_DispLineInfo> lineList;

	public Ws_GetDriverDispLinesResult() {
	}

	public List<Ws_DispLineInfo> getLineList() {
		return lineList;
	}

	public void setLineList(List<Ws_DispLineInfo> lineList) {
		this.lineList = lineList;
	}

}
