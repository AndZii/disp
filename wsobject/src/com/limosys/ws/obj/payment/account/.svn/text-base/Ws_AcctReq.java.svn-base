package com.limosys.ws.obj.payment.account;

import java.util.List;

import com.limosys.ws.obj.Ws_Base;

public class Ws_AcctReq extends Ws_Base implements Cloneable {
	private Integer seq;
	private String desc;
	private String value;
	private List<String> options;
	private boolean must;
	private boolean ask;
	private boolean validate;
	private boolean webLookup;
	private boolean editable;

	public Ws_AcctReq() {

	}

	public Ws_AcctReq(int seq, String value) {
		this.seq = seq;
		this.value = value;
	}

	public Ws_AcctReq(int seq, boolean ask, boolean validate, boolean webValidate, boolean must, String desc, String value) {
		this.seq = seq;
		this.ask = ask;
		this.validate = validate;
		this.webLookup = webValidate;
		this.must = must;
		this.desc = desc;
		this.value = value;
	}

	public boolean validate() {
		if (ask) {
			if (must && getValue().length() == 0)
				return false;
			if (validate && getValue().length() != 0 && options != null && !options.isEmpty()) {
				for (String option : options)
					if (option.equalsIgnoreCase(getValue())) {
						value = option;
						return true;
					}
				return false;
			}
		}
		return true;
	}

	public Integer getSeq() {
		return seq == null ? 0 : seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getValue() {
		return value == null ? "" : value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public boolean isMust() {
		return must;
	}

	public void setMust(boolean must) {
		this.must = must;
	}

	public boolean isAsk() {
		return ask;
	}

	public void setAsk(boolean ask) {
		this.ask = ask;
	}

	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	public boolean isWebLookup() {
		return webLookup;
	}

	public void setWebLookup(boolean webLookup) {
		this.webLookup = webLookup;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
