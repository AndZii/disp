package com.limosys.ws.obj;

public class Ws_Address {
	private double lat = 0.0;
	private double lon = 0.0;
	private String address;
	private String description;
	private String building;
	private String aptNumber;
	private String street;
	private String crossStreet;
	private String country;
	private String county;
	private String city;
	private String state;
	private String zip;
	private String zone;
	private String airport;
	private String airline;
	private String airlineCd;
	private String apTown;
	private boolean inside;
	private boolean precise;
	private String flight;
	private String terminal;
	private String areacode;
	private int zoneId = -1;
	private int dispZoneId;
	private int rowId = -2;
	private String comment;
	private String remark;
	private String nameOfPlace;
	private double hours;
	private long arrivalDateTime;
	private long departureDateTime;
	private String airportPuType;
	private boolean asDirected;

	public Ws_Address() {

	}

	public Ws_Address(boolean asDirected) {
		this.asDirected = asDirected;
	}

	public Ws_Address(String address, double lat, double lon) {
		this.address = address;
		this.setLat(lat);
		this.setLon(lon);
	}

	public Ws_Address(String streetAdr, String city, String zip) {
		this("", streetAdr, city, zip);
		String buildingNumber = new String();
		String streetName = streetAdr;
		int space = streetName.indexOf(" ");
		if (space > 0) {
			buildingNumber = streetName.substring(0, space);
			if (space + 1 < streetName.length())
				streetName = streetName.substring(space + 1);
		}
		this.building = buildingNumber;
		this.street = streetName;
	}

	public Ws_Address(String building, String street, String city, String zip) {
		this.building = building;
		this.street = street;
		this.city = city;
		this.zip = zip;
	}

	public Ws_Address(String address, String street, String city, String state, String zip, double lat, double lon) {
		this.address = address;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.setLat(lat);
		this.setLon(lon);
		this.parseAddress();
	}

	public Ws_Address(double lat, double lon, String streetNum, String streetName, String cityName, String stateCode,
										String postalCode) {
		this.lat = lat;
		this.lon = lon;
		this.building = streetNum;
		this.street = streetName;
		this.city = cityName;
		this.state = stateCode;
		this.zip = postalCode;
	}

	public String getAddress() {
		prepareAddress();
		return address;
	}

	public void prepareAddress() {
		if (airport == null || airport.equals(""))
			address = (building == null ? "" : building + " ") + (street == null ? "" : street + ", ")
								+ (city == null ? "" : city + ", ") + (state == null ? "" : state + " ") + (zip == null ? "" : zip);
		else if (airport != null && !airport.equals(""))
			address = airport;
	}

	public String getOrigAddress() {
		return address;
	}

	public String getLightAddress() {
		prepareLightAddress();
		return address;
	}

	public void prepareLightAddress() {
		if (airport == null || airport.equals(""))
			address = (building == null ? "" : building + " ") + (street == null ? "" : street + ", ")
								+ (city == null ? "" : city + ", ") + (state == null ? "" : state);
		else if (airport != null && !airport.equals(""))
			address = airport;
	}

	public String getBuildingStreetAddress() {
		prepareBuildingStreetAddress();
		return address;
	}

	public void prepareBuildingStreetAddress() {
		if (airport == null || airport.equals("")) {
			address = (building == null ? "" : building + " ") + (street == null ? "" : street);
		}
		else if (airport != null && !airport.equals(""))
			address = airport + (terminal != null && !"".equals(terminal) ? ", " + terminal : "");
	}

	public String getOutsideUSAddress() {
		prepareOutsideUSAddress();
		return address;
	}

	public void prepareOutsideUSAddress() {
		address = (building == null ? "" : building + " ") + (street == null ? "" : street + ", ")
							+ (city == null ? "" : city + ", ") + (county == null ? "" : county + ", ")
							+ (state == null ? "" : state);

		if (address.substring(0, address.length() - 1) == ", ") {
			address.substring(0, address.length() - 1);
		}
	}

	public String genAddress() {
		String res = "";

		if (airport == null || airport.equals(""))
			res = (building == null ? "" : building + " ") + (street == null ? "" : street + ", ")
						+ (city == null ? "" : city + ", ") + (state == null ? "" : state + " ") + (zip == null ? "" : zip);
		else if (airport != null && !airport.equals(""))
			res = airport;
		return res;
	}

	public String genAddressLight() {
		String res = "";

		if (airport == null || airport.equals(""))
			res = (building == null ? "" : building + " ") + (street == null ? "" : street);
		else if (airport != null && !airport.equals(""))
			res = airport;

		if (res == "" && city != null)
			res = city;
		return res;
	}

	public boolean isAirport() {
		return !(airport == null || airport.equals(""));
	}

	public double getLat() {
		return lat;
	}

	public double getLon() {
		return lon;
	}

	public String getBuilding() {
		return building;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCrossStreet() {
		return crossStreet;
	}

	public void setCrossStreet(String crossStreet) {
		this.crossStreet = crossStreet;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getZip() {
		return zip;
	}

	public String getZone() {
		return zone;
	}

	public int getZoneId() {
		return zoneId;
	}

	public String getAirport() {
		return airport;
	}

	public String getAirline() {
		return airline;
	}

	public String getFlight() {
		return flight;
	}

	public boolean getInside() {
		return inside;
	}

	public String getAreaCode() {
		return areacode;
	}

	public void setLatLng(double lat, double lon) {
		this.setLat(lat);
		this.setLon(lon);
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public void setAddress(String name) {
		this.address = name;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public void setFlight(String number) {
		this.flight = number;
	}

	public void setInside(boolean value) {
		this.inside = value;
	}

	public void setAreaCode(String areaCode) {
		this.areacode = areaCode;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void parseAddress() {
		if (street != null && !street.isEmpty()) {
			int space = street.indexOf(" ");
			if (space > 0) {
				String number = street.substring(0, space);
				if (number.matches("[0-9-]+")) {
					building = number;
					street = street.substring(space + 1, street.length());
				}

			}
		}
		// street.replace("Ave", "Avenue");
		// street.replace("St", "Street");
		// if(city.equals("New York")) city = "NYC";
	}

	public String toString() {
		//		return "[" + zone + "] " + (airport != null && !airport.equals("") ? "Airport: [" + airport + "] [" : "[")
		//				+ building + "] [" + street + "] [" + city + "] [" + zip + "]";
		return address == null ? (asDirected ? "As directed" : "Empty Address") : address;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		if (description != null)
			return description;
		return "";
	}

	public int getSeq() {
		return rowId;
	}

	public void setSeq(int seq) {
		rowId = seq;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public void setApTown(String apTown) {
		this.apTown = apTown;
	}

	public String getApTown() {
		return apTown;
	}

	public String getDebugStr() {
		return "[Lat]" + lat + " [Lon]" + lon + " [Address]" + address + " [Descr]" + description + " [Building]"
						+ building
						+ " [Street]" + street + " [City]" + city + " [State]" + state + " [Zip]" + zip + " [Zone]" + zone
						+ " [Airport]" + airport
						+ " [Airline]" + airline + " [ApTown]" + apTown + " [Inside]" + (inside ? "yes" : "no") + " [Flight]"
						+ flight + " [AreaCode]" + areacode
						+ " [ZoneId]" + zoneId + " [rowId]" + rowId;
	}

	public boolean isPrecise() {
		return precise;
	}

	public void setPrecise(boolean precise) {
		this.precise = precise;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAptNumber() {
		return aptNumber;
	}

	public void setAptNumber(String aptNumber) {
		this.aptNumber = aptNumber;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getNameOfPlace() {
		return nameOfPlace;
	}

	public void setNameOfPlace(String nameOfPlace) {
		this.nameOfPlace = nameOfPlace;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public long getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(long arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public long getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(long departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public String getAirportPuType() {
		return airportPuType;
	}

	public void setAirportPuType(String airportPuType) {
		this.airportPuType = airportPuType;
	}

	public boolean isAsDirected() {
		return asDirected;
	}

	public void setAsDirected(boolean asDirected) {
		this.asDirected = asDirected;
	}

	public int getDispZoneId() {
		return dispZoneId;
	}

	public void setDispZoneId(int dispZoneId) {
		this.dispZoneId = dispZoneId;
	}

	public String getBuildingStreet() {
		String res = "";

		if (airport == null || airport.equals(""))
			res = (building == null ? "" : building + " ") + (street == null ? "" : street);
		else if (airport != null && !airport.equals(""))
			res = airport;
		return res;
	}

	public String getCityState() {
		String res = "";

		//		if (airport == null || airport.equals(""))
		res = (city == null ? "" : city + ", ") + (state == null ? "" : state);
		//		else if (airport != null && !airport.equals(""))
		//			res = airport;
		return res;
	}

	public String getAirlineCd() {
		return airlineCd;
	}

	public void setAirlineCd(String airlineCd) {
		this.airlineCd = airlineCd;
	}
}