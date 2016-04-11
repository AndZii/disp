package com.limosys.ws.obj.payment.account;

import java.util.HashSet;
import java.util.List;

import com.limosys.ws.obj.Ws_Base;

public class Ws_MobileAccount extends Ws_Base {
	private String accountDispId = "";
	private String compId = "";
	private boolean isDefault = false;
	private boolean chargeAccount = false;
	private boolean ccAccount = false;
	private boolean pvAccount = false;
	private boolean cvAccount = false;
	private boolean cashAccount = false;
	private List<Ws_AcctReq> reqs;
	private boolean askForCvv = true;
	private boolean ccInCar = false;
	private boolean emailReq = false;
	private HashSet<String> restrictedCarClasses = new HashSet<String>();
	private boolean activeForUser = true;
	private boolean activateEmailSent = false;

	public Ws_MobileAccount() {

	}

	public Ws_MobileAccount(String accountDispId, boolean isDefault, boolean ch, boolean cc, boolean cv, boolean pv,
													boolean ca) {
		this.accountDispId = accountDispId;
		this.chargeAccount = ch;
		this.setDefault(isDefault);
		this.ccAccount = cc;
		this.cvAccount = cv;
		this.pvAccount = pv;
		this.cashAccount = ca;
	}

	public void setAccountDispId(String accountDispId) {
		this.accountDispId = accountDispId;
	}

	public String getAccountDispId() {
		return accountDispId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	public String getCompId() {
		return compId;
	}

	public boolean isChargeAccount() {
		return chargeAccount;
	}

	public boolean isPvAccount() {
		return pvAccount;
	}

	public boolean isCcAccount() {
		return ccAccount;
	}

	public boolean isCashAccount() {
		return cashAccount;
	}

	public boolean isCvAccount() {
		return cvAccount;
	}

	public boolean isCvOnly() {
		return (!ccAccount && !chargeAccount && !cashAccount);
	}

	public boolean isOneType() {
		int count = 0;
		if (chargeAccount) count++;
		if (ccAccount) count++;
		if (cashAccount) count++;
		return count == 1;
	}

	public void setReqs(List<Ws_AcctReq> reqs) {
		this.reqs = reqs;
	}

	public List<Ws_AcctReq> getReqs() {
		return reqs;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public boolean isAskForCvv() {
		return askForCvv;
	}

	public void setAskForCvv(boolean askForCvv) {
		this.askForCvv = askForCvv;
	}

	public void setEmailReq(boolean emailReq) {
		this.emailReq = emailReq;
	}

	public boolean isEmailReq() {
		return this.emailReq;
	}

	public boolean isCcInCar() {
		return ccInCar;
	}

	public void setCcInCar(boolean ccInCar) {
		this.ccInCar = ccInCar;
	}

	public HashSet<String> getRestrictedCarClasses() {
		return restrictedCarClasses;
	}

	public void setRestrictedCarClasses(HashSet<String> restrictedCarClasses) {
		this.restrictedCarClasses = restrictedCarClasses;
	}

	public boolean isActiveForUser() {
		return activeForUser;
	}

	public void setActiveForUser(boolean activeForUser) {
		this.activeForUser = activeForUser;
	}

	public boolean isActivateEmailSent() {
		return activateEmailSent;
	}

	public void setActivateEmailSent(boolean activateEmailSent) {
		this.activateEmailSent = activateEmailSent;
	}

}
