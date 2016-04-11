package com.limosys.ws.obj;

public class Ws_InitParam extends Ws_Base {

	private String mqttBroker;
	private String mqttBrokerBackup;
	private boolean useMqtt;
	private boolean requireDestination;
	private String dispatchPhoneNumber;
	private String deviceId;
	private int maxStops = 0;
	private boolean enableCashFOP = true;
	private boolean emailReq = false;
	private boolean ccAddressRequired = false;
	private boolean connectedToAleph = false;
	private boolean useAlephLogin = false;
	private boolean useAlephPricing = false;
	private String systemCompany = "";
	private boolean showPassengerAndLuggage = false;
	private boolean overrideCarMarkerIcon = true;
	private int maxCarsOnMap = 10;
	private int carUpdateDelaySec = 15;//TODO: add param to servlet
	private boolean useTwilio = false;//TODO: add param to servlet
	private boolean useMiscJobOptions = true;
	private boolean showVoucherOnSummary = true;
	private long recentCacheDelayMs = 10 * 60 * 1000;//TODO: put to parameters - 10 minutes for now
	private int airportCacheMiles = 20;
	private boolean showCarNumberInsteadOfBaseInfo = true;
	private boolean enableMapMoveDriverOnTheWay = true;
	private boolean showCallBaseIconOnMainScreen = false;
	private int showCustArrivedBeforeMinutes = 60;
	private boolean corpAccountsEnabled = false;
	private boolean showReorderRideOnCurrentJob = true;
	private boolean showOrderRideBackCurrentJob = true;
	private boolean showCancelCurrentJob = false;
	private boolean allowLoginWithAcountAndEmployeeId = false;
	private boolean enableMultipleProfiles = false;
	private boolean showArrivedGotLuggage = true;
	private boolean meetAndGreetEnabled = false;
	private boolean showCancelCarAssigned = true;
	private boolean showCancelCarOnLocation = false;
	private boolean showAllCreditCards = true;
	private boolean useGoogleCalendar = false;
	private boolean useGoogleSignIn = false;
	private boolean enablePhoneNumLogin = false;
	private boolean askForAffiliateCars = false;
	private boolean useEmailAsLogin = false;
	private boolean useOSRMAsDirectionServer = false;// TODO: (for car animations) if false - we use google maps, if true - own ORMS server
	private boolean showMobileAffiliateUsage = false;
	private String regionalGoogleCountryCode = "us";
	private boolean autoCancelEnabled = false;
	private boolean isAddAccountSimpleLogicEnabled = false;
	private boolean requireProfileForWork = false;
	private boolean allowLoginWithAccountAndEmail = false;
	private boolean allowLoginWithAccountAndPhoneNum = false;
	private String googleApiKeyBrowser;
	private String googleApiKeyIos;

	public String getRegionalGoogleCountryCode() {
		return regionalGoogleCountryCode;
	}

	public void setRegionalGoogleCountryCode(String regionalGoogleCountryCode) {
		this.regionalGoogleCountryCode = regionalGoogleCountryCode;
	}

	public Ws_InitParam() {}

	public String getMqttBroker() {
		return mqttBroker;
	}

	public void setMqttBroker(String mqttBroker) {
		this.mqttBroker = mqttBroker;
	}

	public String getMqttBrokerBackup() {
		return mqttBrokerBackup;
	}

	public void setMqttBrokerBackup(String mqttBrokerBackup) {
		this.mqttBrokerBackup = mqttBrokerBackup;
	}

	public boolean isUseMqtt() {
		return useMqtt;
	}

	public void setUseMqtt(boolean useMqtt) {
		this.useMqtt = useMqtt;
	}

	public boolean isRequireDestination() {
		return requireDestination;
	}

	public void setRequireDestination(boolean requireDestination) {
		this.requireDestination = requireDestination;
	}

	public String getDispatchPhoneNumber() {
		return dispatchPhoneNumber;
	}

	public void setDispatchPhoneNumber(String dispatchPhoneNumber) {
		this.dispatchPhoneNumber = dispatchPhoneNumber;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public int getMaxStops() {
		return maxStops;
	}

	public void setMaxStops(int maxStops) {
		this.maxStops = maxStops;
	}

	public boolean isEnableCashFOP() {
		return enableCashFOP;
	}

	public void setEnableCashFOP(boolean enableCashFOP) {
		this.enableCashFOP = enableCashFOP;
	}

	public boolean isEmailReq() {
		return emailReq;
	}

	public void setEmailReq(boolean emailReq) {
		this.emailReq = emailReq;
	}

	public boolean isCcAddressRequired() {
		return ccAddressRequired;
	}

	public void setCcAddressRequired(boolean ccAddressRequired) {
		this.ccAddressRequired = ccAddressRequired;
	}

	public boolean isConnectedToAleph() {
		return connectedToAleph;
	}

	public void setConnectedToAleph(boolean connectedToAleph) {
		this.connectedToAleph = connectedToAleph;
	}

	public String getSystemCompany() {
		return systemCompany;
	}

	public void setSystemCompany(String systemCompany) {
		this.systemCompany = systemCompany;
	}

	public boolean isShowPassengerAndLuggage() {
		return showPassengerAndLuggage;
	}

	public void setShowPassengerAndLuggage(boolean showPassengerAndLuggage) {
		this.showPassengerAndLuggage = showPassengerAndLuggage;
	}

	public boolean isOverrideCarMarkerIcon() {
		return overrideCarMarkerIcon;
	}

	public void setOverrideCarMarkerIcon(boolean overrideCarMarkerIcon) {
		this.overrideCarMarkerIcon = overrideCarMarkerIcon;
	}

	public int getMaxCarsOnMap() {
		return maxCarsOnMap;
	}

	public void setMaxCarsOnMap(int maxCarsOnMap) {
		this.maxCarsOnMap = maxCarsOnMap;
	}

	public int getCarUpdateDelaySec() {
		return carUpdateDelaySec;
	}

	public void setCarUpdateDelaySec(int carUpdateDelaySec) {
		this.carUpdateDelaySec = carUpdateDelaySec;
	}

	public boolean isUseTwilio() {
		return useTwilio;
	}

	public void setUseTwilio(boolean useTwillio) {
		this.useTwilio = useTwillio;
	}

	public boolean isUseMiscJobOptions() {
		return useMiscJobOptions;
	}

	public void setUseMiscJobOptions(boolean useMiscJobOptions) {
		this.useMiscJobOptions = useMiscJobOptions;
	}

	public long getRecentCacheDelayMs() {
		return recentCacheDelayMs;
	}

	public void setRecentCacheDelayMs(long cacheDelayMs) {
		this.recentCacheDelayMs = cacheDelayMs;
	}

	public int getAirportCacheMiles() {
		return airportCacheMiles;
	}

	public void setAirportCacheMiles(int airportCacheMiles) {
		this.airportCacheMiles = airportCacheMiles;
	}

	public boolean isShowCarNumberInsteadOfBaseInfo() {
		return showCarNumberInsteadOfBaseInfo;
	}

	public void setShowCarNumberInsteadOfBaseInfo(boolean showCarNumberInsteadOfBaseInfo) {
		this.showCarNumberInsteadOfBaseInfo = showCarNumberInsteadOfBaseInfo;
	}

	public boolean isEnableMapMoveDriverOnTheWay() {
		return enableMapMoveDriverOnTheWay;
	}

	public void setEnableMapMoveDriverOnTheWay(boolean enableMapMoveDriverOnTheWay) {
		this.enableMapMoveDriverOnTheWay = enableMapMoveDriverOnTheWay;
	}

	public boolean isShowCallBaseIconOnMainScreen() {
		return showCallBaseIconOnMainScreen;
	}

	public void setShowCallBaseIconOnMainScreen(boolean showCallBaseIconOnMainScreen) {
		this.showCallBaseIconOnMainScreen = showCallBaseIconOnMainScreen;
	}

	public int getShowCustArrivedBeforeMinutes() {
		return showCustArrivedBeforeMinutes;
	}

	public void setShowCustArrivedBeforeMinutes(int showCustArrivedBeforeMinutes) {
		this.showCustArrivedBeforeMinutes = showCustArrivedBeforeMinutes;
	}

	public boolean isUseAlephLogin() {
		return useAlephLogin;
	}

	public void setUseAlephLogin(boolean useAlephLogin) {
		this.useAlephLogin = useAlephLogin;
	}

	public boolean isCorpAccountsEnabled() {
		return corpAccountsEnabled;
	}

	public void setCorpAccountsEnabled(boolean corpAccountsEnabled) {
		this.corpAccountsEnabled = corpAccountsEnabled;
	}

	public boolean isUseAlephPricing() {
		return useAlephPricing;
	}

	public void setUseAlephPricing(boolean useAlephPricing) {
		this.useAlephPricing = useAlephPricing;
	}

	public boolean isShowVoucherOnSummary() {
		return showVoucherOnSummary;
	}

	public void setShowVoucherOnSummary(boolean showVoucherOnSummary) {
		this.showVoucherOnSummary = showVoucherOnSummary;
	}

	public boolean isShowReorderRideOnCurrentJob() {
		return showReorderRideOnCurrentJob;
	}

	public void setShowReorderRideOnCurrentJob(boolean showReorderRideOnCurrentJob) {
		this.showReorderRideOnCurrentJob = showReorderRideOnCurrentJob;
	}

	public boolean isShowOrderRideBackCurrentJob() {
		return showOrderRideBackCurrentJob;
	}

	public void setShowOrderRideBackCurrentJob(boolean showOrderRideBackCurrentJob) {
		this.showOrderRideBackCurrentJob = showOrderRideBackCurrentJob;
	}

	public boolean isShowCancelCurrentJob() {
		return showCancelCurrentJob;
	}

	public void setShowCancelCurrentJob(boolean showCancelCurrentJob) {
		this.showCancelCurrentJob = showCancelCurrentJob;
	}

	public boolean isAllowLoginWithAcountAndEmployeeId() {
		return allowLoginWithAcountAndEmployeeId;
	}

	public void setAllowLoginWithAcountAndEmployeeId(boolean allowLoginWithAcountAndEmployeeId) {
		this.allowLoginWithAcountAndEmployeeId = allowLoginWithAcountAndEmployeeId;
	}

	public boolean isEnableMultipleProfiles() {
		return enableMultipleProfiles;
	}

	public void setEnableMultipleProfiles(boolean enableMultipleProfiles) {
		this.enableMultipleProfiles = enableMultipleProfiles;
	}

	public boolean isMeetAndGreetEnabled() {
		return meetAndGreetEnabled;
	}

	public void setMeetAndGreetEnabled(boolean meetAndGreetEnabled) {
		this.meetAndGreetEnabled = meetAndGreetEnabled;
	}

	public boolean isShowArrivedGotLuggage() {
		return showArrivedGotLuggage;
	}

	public void setShowArrivedGotLuggage(boolean showArrivedGotLuggage) {
		this.showArrivedGotLuggage = showArrivedGotLuggage;
	}

	public boolean isShowCancelCarAssigned() {
		return showCancelCarAssigned;
	}

	public void setShowCancelCarAssigned(boolean showCancelCarAssigned) {
		this.showCancelCarAssigned = showCancelCarAssigned;
	}

	public boolean isShowCancelCarOnLocation() {
		return showCancelCarOnLocation;
	}

	public void setShowCancelCarOnLocation(boolean showCancelCarOnLocation) {
		this.showCancelCarOnLocation = showCancelCarOnLocation;
	}

	public boolean isShowAllCreditCards() {
		return showAllCreditCards;
	}

	public void setShowAllCreditCards(boolean showAllCreditCards) {
		this.showAllCreditCards = showAllCreditCards;
	}

	public boolean isUseGoogleCalendar() {
		return useGoogleCalendar;
	}

	public void setUseGoogleCalendar(boolean useGoogleCalendar) {
		this.useGoogleCalendar = useGoogleCalendar;
	}

	public boolean isUseGoogleSignIn() {
		return useGoogleSignIn;
	}

	public void setUseGoogleSignIn(boolean useGoogleSignIn) {
		this.useGoogleSignIn = useGoogleSignIn;
	}

	public boolean isEnablePhoneNumLogin() {
		return enablePhoneNumLogin;
	}

	public void setEnablePhoneNumLogin(boolean enablePhoneNumLogin) {
		this.enablePhoneNumLogin = enablePhoneNumLogin;
	}

	public boolean isAskForAffiliateCars() {
		return askForAffiliateCars;
	}

	public void setAskForAffiliateCars(boolean askForAffiliateCars) {
		this.askForAffiliateCars = askForAffiliateCars;
	}

	public boolean isUseEmailAsLogin() {
		return useEmailAsLogin;
	}

	public void setUseEmailAsLogin(boolean useEmailAsLogin) {
		this.useEmailAsLogin = useEmailAsLogin;
	}

	public boolean isUseOSRMAsDirectionServer() {
		return useOSRMAsDirectionServer;
	}

	public void setUseOSRMAsDirectionServer(boolean useOSRMAsDirectionServer) {
		this.useOSRMAsDirectionServer = useOSRMAsDirectionServer;
	}

	public boolean isShowMobileAffiliateUsage() {
		return showMobileAffiliateUsage;
	}

	public void setShowMobileAffiliateUsage(boolean showMobileAffiliateUsage) {
		this.showMobileAffiliateUsage = showMobileAffiliateUsage;
	}
	
	public boolean isAutoCancelEnabled() {
		return autoCancelEnabled;
	}

	public void setAutoCancelEnabled(boolean autoCancelEnabled) {
		this.autoCancelEnabled = autoCancelEnabled;
	}

	public boolean isAddAccountSimpleLogicEnabled() {
	  return isAddAccountSimpleLogicEnabled;
  }

	public void setAddAccountSimpleLogicEnabled(boolean isAddAccountSimpleLogicEnabled) {
	  this.isAddAccountSimpleLogicEnabled = isAddAccountSimpleLogicEnabled;
  }

	public boolean isRequireProfileForWork() {
		return requireProfileForWork;
	}

	public void setRequireProfileForWork(boolean requireProfileForWork) {
		this.requireProfileForWork = requireProfileForWork;
	}

	public boolean isAllowLoginWithAccountAndEmail() {
		return allowLoginWithAccountAndEmail;
	}

	public void setAllowLoginWithAccountAndEmail(boolean allowLoginWithAccountAndEmail) {
		this.allowLoginWithAccountAndEmail = allowLoginWithAccountAndEmail;
	}

	public boolean isAllowLoginWithAccountAndPhoneNum() {
		return allowLoginWithAccountAndPhoneNum;
	}

	public void setAllowLoginWithAccountAndPhoneNum(boolean allowLoginWithAccountAndPhoneNum) {
		this.allowLoginWithAccountAndPhoneNum = allowLoginWithAccountAndPhoneNum;
	}

	public String getGoogleApiKeyBrowser() {
		return googleApiKeyBrowser;
	}

	public void setGoogleApiKeyBrowser(String googleApiKeyBrowser) {
		this.googleApiKeyBrowser = googleApiKeyBrowser;
	}

	public String getGoogleApiKeyIos() {
		return googleApiKeyIos;
	}

	public void setGoogleApiKeyIos(String googleApiKeyIos) {
		this.googleApiKeyIos = googleApiKeyIos;
	}
}
