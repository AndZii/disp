package com.limosys.ws.obj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ws_Translations extends Ws_Base {
	private Map<String, List<Ws_Translation>> languageTranslations = new HashMap<String, List<Ws_Translation>>();

	public Map<String, List<Ws_Translation>> getLanguageTranslations() {
		return languageTranslations;
	}

	public void setLanguageTranslations(
			Map<String, List<Ws_Translation>> languageTranslations) {
		this.languageTranslations = languageTranslations;
	}
}
