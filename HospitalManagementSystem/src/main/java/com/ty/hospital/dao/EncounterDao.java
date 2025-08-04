package com.ty.hospital.dao;

//import com.ty.hospital.dto.Address;
import com.ty.hospital.dto.Encounter;

public interface EncounterDao {
	
	public Encounter SaveEncounter(int bid,Encounter rncounter);
	public Encounter getEncounterById(int eid );
	public boolean DeleteEncounter(int eid);
	public Encounter UpdateEncounter(int eid,Encounter encounter);

}
