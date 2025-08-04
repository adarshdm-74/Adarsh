package com.ty.hospital.dao;

import com.ty.hospital.dto.Items;
import com.ty.hospital.dto.Observation;
import com.ty.hospital.dto.Person;

public interface PersonDao {
	public Person SavePerson(int pid,Person person);
	public Person getPersonById(int pid );
	public boolean DeletePerson(int pid);
	public Person UpdatePerson(int pid,Person person);

}
