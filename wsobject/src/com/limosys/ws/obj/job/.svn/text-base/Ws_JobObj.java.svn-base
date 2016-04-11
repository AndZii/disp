package com.limosys.ws.obj.job;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.limosys.ws.obj.Ws_Address;
import com.limosys.ws.obj.Ws_Base;
import com.limosys.ws.obj.Ws_Coupon;
import com.limosys.ws.obj.Ws_Fare;
import com.limosys.ws.obj.Ws_MiscCharge;
import com.limosys.ws.obj.affiliate.Ws_Affiliate;
import com.limosys.ws.obj.car.Ws_CarClass;
import com.limosys.ws.obj.payment.Ws_Payment;
import com.limosys.ws.obj.payment.account.Ws_AcctReq;

public class Ws_JobObj extends Ws_Base {
	private int jobId;
	private String deviceId;
	private int custId;
	private String nameFirst;
	private String nameLast;
	private String phoneNumber;
	private String phoneExtention;
	private String emailAddr;
	private String accountDispId;
	private LinkedList<Ws_Address> addrList = new LinkedList<Ws_Address>();
	private Date datetime;
	private boolean isASAP = true;
	private int passengers;
	private int luggage;
	private String compId;
	private String compName;
	private String comments;
	private String drvrNotes;
	private Ws_CarClass carClass;
	private Ws_Payment payment;
	private Ws_JobInfo jobInfo;
	private boolean isRated;
	private List<String> polylines;
	private Ws_Fare fare;
	private List<Ws_MiscCharge> miscChargeSelectedList;
	private List<Ws_AcctReq> acctReq;
	private boolean isCustArrived = false;
	private double carPrice;
	private String alephFareId;
	private Ws_Coupon coupon;
	private String refInJobId;
	private Set<Ws_Affiliate> exposeToAffSet;

	public Ws_JobObj() {}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getNameFirst() {
		return nameFirst;
	}

	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	public String getNameLast() {
		return nameLast;
	}

	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneExtention() {
		return phoneExtention;
	}

	public void setPhoneExtention(String phoneExtention) {
		this.phoneExtention = phoneExtention;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getAccountDispId() {
		return accountDispId;
	}

	public void setAccountDispId(String accountDispId) {
		this.accountDispId = accountDispId;
	}

	public LinkedList<Ws_Address> getAddrList() {
		return addrList;
	}

	public void setAddrList(LinkedList<Ws_Address> addrList) {
		this.addrList = addrList;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime == null ? new Date() : datetime;
		if (datetime != null)
			this.isASAP = false;
		else
			this.isASAP = true;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getLuggage() {
		return luggage;
	}

	public void setLuggage(int luggage) {
		this.luggage = luggage;
	}

	public String getCompId() {
		return compId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDrvrNotes() {
		return drvrNotes;
	}

	public void setDrvrNotes(String drvrNotes) {
		this.drvrNotes = drvrNotes;
	}

	public Ws_CarClass getCarClass() {
		return carClass;
	}

	public void setCarClass(Ws_CarClass carClass) {
		this.carClass = carClass;
	}

	public Ws_Payment getPayment() {
		return payment;
	}

	public void setPayment(Ws_Payment payment) {
		this.payment = payment;
	}

	public boolean isASAP() {
		return isASAP;
	}

	public void setDOAddress(Ws_Address address) {
		if (addrList.size() == 1)
			addrList.addLast(address);
		else if (addrList.size() > 1) {
			addrList.pollLast();
			addrList.addLast(address);
		}
	}

	public void setPUAddress(Ws_Address address) {
		if (addrList.size() == 0)
			addrList.add(address);
		else {
			addrList.pollFirst();
			addrList.addFirst(address);
		}
	}

	public void addStopAddress(Ws_Address address) {
		if (addrList.size() == 0)
			setPUAddress(address);
		else if (addrList.size() == 1) {
			Ws_Address doAddr = new Ws_Address();
			doAddr.setAsDirected(true);
			setDOAddress(doAddr);
			addStopAddressInternal(address);
		} else {
			addStopAddressInternal(address);
		}
	}

	private void addStopAddressInternal(Ws_Address address) {
		addrList.add(addrList.size() - 1, address);
	}

	public void replaceStopAddress(int position, Ws_Address address) {
		if (position < 0 || position > addrList.size() - 2)
			return;
		//		addrList.remove(position + 1);
		//		addrList.add(position + 1, address);
		addrList.set(position + 1, address);
	}

	public void fixAddrList() {
		if (addrList.size() == 1) {
			Ws_Address doAddr = new Ws_Address();
			doAddr.setAsDirected(true);
			setDOAddress(doAddr);
		}
	}

	/**
	 * positions must be from 0 to N-1, where N is stop count
	 * @param position
	 */
	public void removeStopAddress(int position) {
		if (position < 0 || position >= addrList.size() - 2)
			return;

		addrList.remove(position + 1);
	}

	public void removeStopAddress(Ws_Address addr) {
		if (addrList.contains(addr) && addrList.peekFirst() != addr && addrList.peekLast() != addr)
			addrList.remove(addr);
	}

	public boolean hasAddress() {
		return !addrList.isEmpty();
	}

	public Ws_Address getPUAddress() {
		//LinkedList<Ws_Address> addrList = jobObj.getAddrList();
		if (addrList.size() < 1)
			return null;
		return addrList.getFirst();
	}

	public Ws_Address getDOAddress() {
		//LinkedList<Ws_Address> addrList = jobObj.getAddrList();
		if (addrList.size() < 2)
			return null;

		return addrList.getLast();
	}

	public Ws_JobInfo getJobInfo() {
		return jobInfo;
	}

	public void setJobInfo(Ws_JobInfo jobInfo) {
		this.jobInfo = jobInfo;
	}

	public boolean isRated() {
		return isRated;
	}

	public void setRated(boolean isRated) {
		this.isRated = isRated;
	}

	public List<String> getPolylines() {
		return polylines;
	}

	public void setPolylines(List<String> polylines) {
		this.polylines = polylines;
	}

	public Ws_Fare getFare() {
		return fare;
	}

	public void setFare(Ws_Fare fare) {
		this.fare = fare;
	}

	public List<Ws_MiscCharge> getMiscChargeSelectedList() {
		return miscChargeSelectedList;
	}

	public void setMiscChargeSelectedList(List<Ws_MiscCharge> miscChargeSelectedList) {
		this.miscChargeSelectedList = miscChargeSelectedList;
	}

	public Boolean isJobFinalized() {
		return jobInfo.isJobFinalized();
	}

	public boolean isCustArrived() {
		return isCustArrived;
	}

	public void setCustArrived(boolean isCustArrived) {
		this.isCustArrived = isCustArrived;
	}

	public List<Ws_AcctReq> getAcctReq() {
		return acctReq;
	}

	public void setAcctReq(List<Ws_AcctReq> acctReq) {
		this.acctReq = acctReq;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public Ws_Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Ws_Coupon coupon) {
		this.coupon = coupon;
	}

	public String getAlephFareId() {
		return alephFareId;
	}

	public void setAlephFareId(String alephFareId) {
		this.alephFareId = alephFareId;
	}

	public String getRefInJobId() {
		return refInJobId;
	}

	public void setRefInJobId(String refInJobId) {
		this.refInJobId = refInJobId;
	}

	public void setASAP(boolean value) {
		isASAP = value;
	}

	public Set<Ws_Affiliate> getExposeToAffSet() {
		return exposeToAffSet;
	}

	public void setExposeToAffSet(Set<Ws_Affiliate> exposeToAffSet) {
		this.exposeToAffSet = exposeToAffSet;
	}

}
