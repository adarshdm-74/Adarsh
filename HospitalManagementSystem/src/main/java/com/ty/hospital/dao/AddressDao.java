package com.ty.hospital.dao;

import com.ty.hospital.dto.Address;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Hospital;

public interface AddressDao {
	
	public Address SaveAddress(int bid,Address dddress);
	public Address getAddressById(int aid );
	public boolean DeleteBranch(int aid);
	public Address UpdateBranch(int aid,Address address);


}
