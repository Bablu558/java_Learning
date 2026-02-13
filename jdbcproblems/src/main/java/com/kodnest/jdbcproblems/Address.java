package com.kodnest.jdbcproblems;

import java.util.Objects;

// POJO
public class Address {

	int id;
	int houseNo;
	String streetname;
	String city;
	String state;
	String country;
	int pincode;
	
	
	public Address() {
		
	}
	
	
	public Address(int id,int houseNo, String streetname, String city, String state, String country, int pincode) {
		super();
		this.houseNo = houseNo;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.id=id;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}


	public String getStreetname() {
		return streetname;
	}


	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", streetname=" + streetname + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", pincode=" + pincode + "]";
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(city, country, houseNo, pincode, state, streetname);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country) && houseNo == other.houseNo
				&& pincode == other.pincode && Objects.equals(state, other.state)
				&& Objects.equals(streetname, other.streetname);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
