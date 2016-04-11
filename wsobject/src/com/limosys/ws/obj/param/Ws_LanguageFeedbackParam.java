package com.limosys.ws.obj.param;

public class Ws_LanguageFeedbackParam {

	private String code;
	private String phrase;

	public Ws_LanguageFeedbackParam(String code, String phrase) {
		this.setCode(code);
		this.setPhrase(phrase);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

}
