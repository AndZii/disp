package com.limosys.ws.obj.payment;

import java.util.ArrayList;
import java.util.List;

import com.limosys.ws.obj.Ws_Base;
import com.limosys.ws.obj.payment.account.Ws_MobileAccount;

public class Ws_Payments extends Ws_Base {
	private int activeAccount = -1;
	private boolean cashEnabled = false;
	private boolean ccEnabled = false;
	private boolean corpEnabled = false;

	private boolean ccInCar = false;
	private boolean askForCvv = true;
	private boolean emailReq = false;

	private boolean isDefaultUseCC = false;

	private List<Ws_Payment> creditCards = new ArrayList<Ws_Payment>();
	private List<Ws_MobileAccount> accounts = new ArrayList<Ws_MobileAccount>();

	private int activeJob;

	public List<Ws_Payment> getCreditCards() {
		return creditCards;
	}

	public void setCreditCards(List<Ws_Payment> creditCards) {
		this.creditCards = creditCards;
	}

	public List<Ws_MobileAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Ws_MobileAccount> accounts) {
		this.accounts = accounts;
	}

	public void setActiveAccount(int index) {
		this.activeAccount = index;
	}

	public Ws_MobileAccount getActiveAccount() {
		if (activeAccount < 0 || activeAccount >= accounts.size())
			return null;
		return accounts.get(activeAccount);
	}

	public boolean isCashEnabled() {
		return cashEnabled;
	}

	public void setCashEnabled(boolean cashEnabled) {
		this.cashEnabled = cashEnabled;
	}

	public boolean isCcEnabled() {
		return ccEnabled;
	}

	public void setCcEnabled(boolean ccEnabled) {
		this.ccEnabled = ccEnabled;
	}

	public boolean isCorpEnabled() {
		return corpEnabled;
	}

	public void setCorpEnabled(boolean corpEnabled) {
		this.corpEnabled = corpEnabled;
	}

	public boolean isCcInCar() {
		return ccInCar;
	}

	public void setCcInCar(boolean ccInCar) {
		this.ccInCar = ccInCar;
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

	public int getActiveJob() {
		return activeJob;
	}

	public void setActiveJob(int activeJob) {
		this.activeJob = activeJob;
	}

	public boolean isDefaultUseCC() {
		return isDefaultUseCC;
	}

	public void setDefaultUseCC(boolean isDefaultUseCC) {
		this.isDefaultUseCC = isDefaultUseCC;
	}
}
