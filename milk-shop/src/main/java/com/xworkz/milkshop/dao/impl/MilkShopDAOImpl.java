package com.xworkz.milkshop.dao.impl;


import org.springframework.stereotype.Repository;

import com.xworkz.milkshop.dao.MilkShopDAO;
import com.xworkz.milkshop.dto.MilkShopDTO;

@Repository
public class MilkShopDAOImpl implements MilkShopDAO {

	@Override
	public void Save(MilkShopDTO milk) {
		System.out.println("Calling Save Method Of MilkShopDAO");
	}

}
