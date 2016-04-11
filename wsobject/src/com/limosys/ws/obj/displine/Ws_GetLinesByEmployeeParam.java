package com.limosys.ws.obj.displine;

public class Ws_GetLinesByEmployeeParam {
	
	private int empId;

	public Ws_GetLinesByEmployeeParam(int empId) {
		this.setEmpId(empId);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
