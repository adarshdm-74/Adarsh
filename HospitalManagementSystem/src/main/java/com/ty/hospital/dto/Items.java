package com.ty.hospital.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int cost;
	private int quntity;
	@ManyToOne
	@JoinColumn
	private Medorder order;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQuntity() {
		return quntity;
	}
	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}
	public Medorder getOrder() {
		return order;
	}
	public void setOrder(Medorder order) {
		this.order = order;
	}
	

}
