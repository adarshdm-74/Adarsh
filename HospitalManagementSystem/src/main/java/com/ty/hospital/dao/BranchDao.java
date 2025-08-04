package com.ty.hospital.dao;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Hospital;

public interface BranchDao {
	
	public Branch SaveBranch(int hid,Branch branches);
	public Branch getBranchById(int bid );
	public boolean DeleteBranch(int bid);
	public Branch UpdateBranch(int bid,Branch branches);

}
