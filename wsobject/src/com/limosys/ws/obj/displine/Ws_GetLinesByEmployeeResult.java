package com.limosys.ws.obj.displine;

import java.util.List;

import com.limosys.ws.obj.Ws_Base;

public class Ws_GetLinesByEmployeeResult extends Ws_Base {
	
	private List<Ws_DispLineShortInfo> dispLineInfo;
	
	public Ws_GetLinesByEmployeeResult() {
		
	}
	
	public List<Ws_DispLineShortInfo> getDispLineInfo() {
		return dispLineInfo;
	}

	public void setDispLineInfo(List<Ws_DispLineShortInfo> dispLineInfo) {
		this.dispLineInfo = dispLineInfo;
	}

	public static class Ws_DispLineShortInfo {
		private final int lineId;
		private final String name;
		public Ws_DispLineShortInfo(int lineId, String name) {			
			this.lineId = lineId;
			this.name = name;
		}
		public int getLineId() {
			return lineId;
		}
		public String getName() {
			return name;
		}		
	}
}
