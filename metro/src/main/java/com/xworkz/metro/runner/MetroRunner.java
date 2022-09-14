package com.xworkz.metro.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.metro.dao.MetroDAO;
import com.xworkz.metro.dao.MetroDAOImpl;
import com.xworkz.metro.entity.MetroEntity;

public class MetroRunner {

	public static void main(String[] args) {
		
		MetroEntity train1 = new MetroEntity(1,"Green", "Green", 35.00D, LocalDate.of(18, 7, 17), "Prakash", LocalDate.now(), "Bahauballi");
		MetroEntity train2 = new MetroEntity(2,"Purple", "Purple", 55.00D, LocalDate.of(18, 7, 17), "Prashanth", LocalDate.now(), "Manohar");
		MetroEntity train3 = new MetroEntity(3,"Green", "Green", 35.00D, LocalDate.of(18, 7, 17), "Prakash", LocalDate.now(), "Bahauballi");
		
		MetroDAO dao = new MetroDAOImpl();
		List<MetroEntity> list = new ArrayList<MetroEntity>();
		list.add(train1);
		list.add(train2);
		list.add(train3);
		
		Boolean save = dao.save(list);
		System.out.println(save);
	}
	

}
