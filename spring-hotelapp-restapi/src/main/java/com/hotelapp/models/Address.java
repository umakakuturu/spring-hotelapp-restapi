package com.hotelapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id", unique = true)
	private int addressId;
	@Column(name = "city")
	private String city;
	@Column(name = "pincode")
	private long pincode;
	@Column(name = "state")
	private String state;

	public Address(String city, long pincode, String state) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", state=" + state + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
