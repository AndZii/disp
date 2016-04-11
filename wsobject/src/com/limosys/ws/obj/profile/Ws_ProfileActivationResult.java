package com.limosys.ws.obj.profile;

import com.limosys.ws.obj.Ws_Base;

public class Ws_ProfileActivationResult extends Ws_Base {

	private boolean active;
	private boolean activateCodeSent;

	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isActivateCodeSent() {
		return activateCodeSent;
	}
	public void setActivateCodeSent(boolean activateCodeSent) {
		this.activateCodeSent = activateCodeSent;
	}
}
