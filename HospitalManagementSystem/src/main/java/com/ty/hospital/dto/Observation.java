package com.ty.hospital.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Observation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	private String name;
	//private long phno;
	private String observation;
	@ManyToOne
	@JoinColumn
	private Encounter encount;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public Encounter getEncount() {
		return encount;
	}
	public void setEncount(Encounter encount) {
		this.encount = encount;
	}
	
	
}
