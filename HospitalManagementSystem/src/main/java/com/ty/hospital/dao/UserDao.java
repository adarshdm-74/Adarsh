package com.ty.hospital.dao;

import com.ty.hospital.dto.Person;
import com.ty.hospital.dto.User;

public interface UserDao {
	
	public User SaveUser(int uid,User User);
	public User getUserById(int uid );
	public boolean DeleteUser(int uid);
	public User UpdateUser(int uid,User user);

}
