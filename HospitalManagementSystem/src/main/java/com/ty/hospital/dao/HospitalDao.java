package com.ty.hospital.dao;

import com.ty.hospital.dto.Hospital;

public interface HospitalDao {
	
	public Hospital SaveHospital(Hospital hospital);
	public Hospital getHospitalById(int hid);
	public boolean DeleteHospital(int hid);
	public Hospital UpdateHospital(int hid,Hospital hospital);

}
