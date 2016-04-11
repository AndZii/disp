package com.limosys.ws.obj.affiliate;

public class Ws_Affiliate {

	final private String compId;
	final private int blngId;
	private String affCompId;
	private String affSysComp;
	private String affName;

	public Ws_Affiliate(String compId, int blngId) {
		this.compId = compId;
		this.blngId = blngId;
	}

	public Ws_Affiliate(String compId, int blngId, String affCompId, String affSysComp) {
		this(compId, blngId);
		this.affCompId = affCompId;
		this.affSysComp = affSysComp;
	}

	public String getCompId() {
		return compId;
	}

	public int getBlngId() {
		return blngId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + blngId;
		result = prime * result + ((compId == null) ? 0 : compId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) { return true; }
		if (obj == null) { return false; }
		if (!(obj instanceof Ws_Affiliate)) { return false; }
		Ws_Affiliate other = (Ws_Affiliate) obj;
		if (blngId != other.blngId) { return false; }
		if (compId == null) {
			if (other.compId != null) { return false; }
		} else if (!compId.equals(other.compId)) { return false; }
		return true;
	}

	public String getAffCompId() {
		return affCompId;
	}

	public void setAffCompId(String affCompId) {
		this.affCompId = affCompId;
	}

	public String getAffSysComp() {
		return affSysComp;
	}

	public void setAffSysComp(String affSysComp) {
		this.affSysComp = affSysComp;
	}

	public String getAffName() {
		return affName;
	}

	public void setAffName(String affName) {
		this.affName = affName;
	}
}
