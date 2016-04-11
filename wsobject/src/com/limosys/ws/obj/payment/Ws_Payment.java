package com.limosys.ws.obj.payment;

import com.limosys.ws.obj.Ws_Address;

public class Ws_Payment {

	private String type;
	private String details;
	private String name;
	private String compId;
	private Ws_CreditCardInfo creditCardInfo;
	private Ws_Address address;
	private Integer seq;
	private boolean isDefault = false;

	public Ws_Payment() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDetails() {
		return (details == null || details.equals("") ? getFullType() : details);
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullType() {
		return getFullType(type);
	}

	public static String getFullType(String type) {
		if (type == null)
			type = "CA";

		if (type.equals("VI"))
			return "Visa";
		if (type.equals("AE"))
			return "American Express";
		if (type.equals("DC"))
			return "Diners Club";
		if (type.equals("MC"))
			return "MasterCard";
		if (type.equals("DS"))
			return "Discover";
		if (type.equals("CA"))
			return "Cash";
		if (type.equals("CH"))
			return "Charge Account";
		if (type.equals("PV"))
				return "Paid Voucher";

		return "Cash";
	}

	public boolean isCreditCard() {
		return isCreditCard(type);
	}

	public static boolean isCreditCard(String type) {
		if (type.equals("VI") || type.equals("AE") || type.equals("DC") || type.equals("MC") || type.equals("DS"))
			return true;
		else
			return false;
	}

	public Ws_CreditCardInfo getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(Ws_CreditCardInfo creditCardInfo) {
		if (type == null || "".equals(type.trim())) {
			if (creditCardInfo != null && creditCardInfo.getType() != null && !"".equals(creditCardInfo.getType().trim()))
				type = creditCardInfo.getType();
			else
				type = "CA";
		}
		this.creditCardInfo = creditCardInfo;
	}

	public Ws_Address getAddress() {
		return address;
	}

	public void setAddress(Ws_Address address) {
		this.address = address;
	}

	public Integer getSeq() {
		return seq;
	}

	public int getSeqInt() {
		return seq == null ? 0 : seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(boolean value) {
		isDefault = value;
	}

	public String getCompId() {
		return compId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}
}
