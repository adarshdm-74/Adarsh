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
@Entity
public class Medorder {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	private String dname;
	//private long phno;
	private String orderdate;
	private int total;
	@OneToMany(mappedBy ="order",cascade=CascadeType.ALL)
	private  List<Items> items;
	@ManyToOne
	@JoinColumn
	private Encounter encount;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	public Encounter getEncount() {
		return encount;
	}
	public void setEncount(Encounter encount) {
		this.encount = encount;
	}
	
}
