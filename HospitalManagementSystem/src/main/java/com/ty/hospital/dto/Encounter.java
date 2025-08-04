package com.ty.hospital.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String Dateofjoin;
	//private long phno;
	private String discharge;
	@OneToMany(mappedBy ="Ecount",cascade=CascadeType.ALL)
	List<Observation> obser;
	@ManyToOne
	@JoinColumn
	private Person person;
	@ManyToOne
	@JoinColumn
	private Branch branches;
	@OneToMany(mappedBy="Ecount")
	List<Medorder> medord;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDateofjoin() {
		return Dateofjoin;
	}
	public void setDateofjoin(String dateofjoin) {
		Dateofjoin = dateofjoin;
	}
	public String getDischarge() {
		return discharge;
	}
	public void setDischarge(String discharge) {
		this.discharge = discharge;
	}
	public List<Observation> getObser() {
		return obser;
	}
	public void setObser(List<Observation> obser) {
		this.obser = obser;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Branch getBranches() {
		return branches;
	}
	public void setBranches(Branch branches) {
		this.branches = branches;
	}
	public List<Medorder> getMedord() {
		return medord;
	}
	public void setMedord(List<Medorder> medord) {
		this.medord = medord;
	}
	
	

}
