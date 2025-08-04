package com.ty.hospital.dao;

//import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Medorder;

public interface MedOrderDao {
	
	public Medorder SaveMedorder(int eid,Medorder medorder);
	public Medorder getMedorderById(int mid );
	public boolean DeleteMedorder(int mid);
	public Medorder UpdateMedorder(int mid,Medorder medorder);

}
