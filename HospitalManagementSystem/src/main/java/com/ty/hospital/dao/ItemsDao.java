package com.ty.hospital.dao;

//import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Items;

public interface ItemsDao {
	
	public Items SaveItems(int mid,Items items);
	public Items getItemsById(int id );
	public boolean DeleteItems(int id);
	public Items UpdateItems(int id,Items items);

}
