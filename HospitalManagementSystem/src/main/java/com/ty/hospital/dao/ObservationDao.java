package com.ty.hospital.dao;

import com.ty.hospital.dto.Items;
import com.ty.hospital.dto.Observation;

public interface ObservationDao {
	
	public Observation SaveObservation(int eid,Observation observation);
	public Items getObservationById(int oid );
	public boolean DeleteObservation(int oid);
	public Observation UpdateObservation(int oid,Observation observation);

}
