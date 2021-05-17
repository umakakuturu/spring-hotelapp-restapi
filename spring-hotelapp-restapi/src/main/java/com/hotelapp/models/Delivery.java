package com.hotelapp.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DELIVERY")
public class Delivery {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "deliver_id", unique = true)
	private int deliveryId;
	@Column(name = "partner_name")
	private String partnerName;
	@Column(name = "charges")
	private double charges;
	@ManyToMany(mappedBy = "delivery", cascade = CascadeType.ALL)
	private List<Hotel> hotellist;

	public Delivery(String partnerName, double charges) {
		super();
		this.partnerName = partnerName;
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "Delivery [partnerName=" + partnerName + ", charges=" + charges + "]";
	}

}
