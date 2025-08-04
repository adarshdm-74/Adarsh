package com.ty.hospital.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String name;
	private long phno;
	private String gmail;
	@JoinColumn
	@ManyToOne
	private Hospital hosp;
	@JoinColumn
	@OneToOne
	private Address address;
	@OneToMany(mappedBy="branches")
	private List<Encounter> Ecount;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public Hospital getHosp() {
		return hosp;
	}
	public void setHosp(Hospital hosp) {
		this.hosp = hosp;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Encounter> getEcount() {
		return Ecount;
	}
	public void setEcount(List<Encounter> ecount) {
		Ecount = ecount;
	}
	

}
