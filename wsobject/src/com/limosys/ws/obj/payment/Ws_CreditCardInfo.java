package com.limosys.ws.obj.payment;

public class Ws_CreditCardInfo {

	private String type;
	private String name;
	private String number;
	private String displayNumber;
	private String expire;
	private String cvv;
	private String sourceCd = "W";

	public Ws_CreditCardInfo() {
	}

	public Ws_CreditCardInfo(String type, String name, String number, String displayNumber, String expire, String cvv) {
		this.type = type;
		this.name = name;
		this.number = number;
		this.setDisplayNumber(displayNumber);
		this.expire = expire;
		this.cvv = cvv;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDisplayNumber() {
		return displayNumber;
	}

	public void setDisplayNumber(String displayNumber) {
		this.displayNumber = displayNumber;
	}

	public String getExpire() {
		return expire;
	}

	public void setExpire(String expire) {
		this.expire = expire;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getSourceCd() {
	  return sourceCd;
  }

	public void setSourceCd(String sourceCd) {
	  this.sourceCd = sourceCd;
  }
}
