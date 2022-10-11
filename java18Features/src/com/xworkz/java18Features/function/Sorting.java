package com.xworkz.java18Features.function;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.java18Features.Enum.*;
import com.xworkz.java18Features.dto.HouseDTO;

public class Sorting {

	public static void main(String[] args) {
		
		HouseDTO house1 = new HouseDTO(1, "Honey", "Hanumath", Type.INDIVIDUAL, 3, false, OwningType.OWN, 1200.00);
		HouseDTO house2 = new HouseDTO(2, "Prajwal", "DP", Type.VILLA, 1, true, OwningType.RENT, 2800.0);
		HouseDTO house3 = new HouseDTO(3, "GOH", "Sharath", Type.VILLA, 2, true, OwningType.PARTNERSHIP, 3500.0);
		HouseDTO house4 = new HouseDTO(4, "Kadam", "Suhas", Type.APARTMENT, 7, false, OwningType.OWN, 1200.0);
		HouseDTO house5 = new HouseDTO(5, "Paramel", "Nandish", Type.INDIVIDUAL, 3, false, OwningType.RENT, 1500.0);
		HouseDTO house6 = new HouseDTO(6, "Prestige", "Chandru", Type.APARTMENT, 25, true, OwningType.OWN, 3500.0);
		HouseDTO house7 = new HouseDTO(7, "Rocla", "Bahubali", Type.INDIVIDUAL, 5, false, OwningType.PARTNERSHIP, 1200.0);
		HouseDTO house8 = new HouseDTO(8, "Heritage", "Shadow", Type.VILLA, 1, true, OwningType.LEASE, 1200.0);
		HouseDTO house9 = new HouseDTO(9, "Brigade", "Sharan", Type.APARTMENT, 36, false, OwningType.PARTNERSHIP, 1200.0);
		HouseDTO house10 = new HouseDTO(10, "nilkamal", "Kalyan", Type.INDIVIDUAL, 1, true, OwningType.RENT, 1200.0);
		HouseDTO house11 = new HouseDTO(11, "Sans", "Sankalp", Type.INDIVIDUAL, 2, false, OwningType.OWN, 1500.0);
		HouseDTO house12 = new HouseDTO(12, "Niklamm", "Nikhil", Type.INDIVIDUAL, 1, true, OwningType.OWN, 800.0);
		HouseDTO house13 = new HouseDTO(13, "Basent", "Maniish", Type.APARTMENT, 1, false, OwningType.LEASE, 1200.0);
		HouseDTO house14 = new HouseDTO(14, "manuals", "Manjunath", Type.VILLA, 5, true, OwningType.RENT, 1200.0);
		HouseDTO house15 = new HouseDTO(15, "Creaters", "Claris", Type.APARTMENT, 12, true, OwningType.PARTNERSHIP, 1200.0);
		HouseDTO house16 = new HouseDTO(16, "HBuilders", "Buljin", Type.VILLA, 3, false, OwningType.LEASE, 2200.0);
		HouseDTO house17 = new HouseDTO(17, "Harris", "Kelvin", Type.INDIVIDUAL, 5, true, OwningType.PARTNERSHIP, 1700.0);
		HouseDTO house18 = new HouseDTO(18, "HRB", "Saish", Type.APARTMENT, 18, false, OwningType.RENT, 1200.0);
		HouseDTO house19 = new HouseDTO(19, "ACR", "PushPak", Type.VILLA,2, true, OwningType.PARTNERSHIP, 3000.0);
		HouseDTO house20 = new HouseDTO(20, "NGSB", "Nagendra", Type.APARTMENT, 19, true, OwningType.OWN, 1700.0);
		
		List<HouseDTO> houseDTOs = new ArrayList<HouseDTO>();
		houseDTOs.add(house1);
		houseDTOs.add(house2);
		houseDTOs.add(house3);
		houseDTOs.add(house4);
		houseDTOs.add(house5);
		houseDTOs.add(house6);
		houseDTOs.add(house7);
		houseDTOs.add(house8);
		houseDTOs.add(house9);
		houseDTOs.add(house10);
		houseDTOs.add(house11);
		houseDTOs.add(house12);
		houseDTOs.add(house13);
		houseDTOs.add(house14);
		houseDTOs.add(house15);
		houseDTOs.add(house16);
		houseDTOs.add(house17);
		houseDTOs.add(house18);
		houseDTOs.add(house19);
		houseDTOs.add(house20);
		
		houseDTOs.stream().sorted((e1,e2)->e1.getId().compareTo(e2.getId())).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getType().compareTo(e1.getType())).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getSqft().compareTo(e1.getSqft())).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().filter((e)->e.getLoan() == true)
		.sorted((e1,e2)->((e2.getOwner().compareTo(e1.getOwner())))).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().filter((e)->e.getLoan() == false)
		.sorted((e1,e2)->((e2.getOwner().compareTo(e1.getOwner())))).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().filter((e)->e.getOwningType() == OwningType.LEASE).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().filter((e)->e.getType() == Type.APARTMENT).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().filter((e)->e.getType() == Type.VILLA).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().sorted((r,r2)->{
		int m=	r.getType().compareTo(r2.getType());
		if(m==0) {
		return	r.getOwningType().compareTo(r2.getOwningType());
			
		}	
		return m;		
		}).forEach((ref)->System.out.println(ref));
		
		houseDTOs.stream().sorted((r,r2)->{
			int m=	r2.getName().compareTo(r.getName());
			if(m==0) {
			return	r2.getId().compareTo(r.getId());
				
			}	
			return m;		
			}).forEach((ref)->System.out.println(ref));



		
	}
	
	
}
