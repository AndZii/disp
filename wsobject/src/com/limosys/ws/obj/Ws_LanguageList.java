package com.limosys.ws.obj;

import java.util.ArrayList;
import java.util.List;

public class Ws_LanguageList extends Ws_Base {
	private List<Ws_Language> languages = new ArrayList<Ws_Language>();

	public List<Ws_Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Ws_Language> languages) {
		this.languages = languages;
	}
}
