package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;


public class CollectionExample{

	public static void main(String[] args) {

		String Hello = "Hello";
		
		Collection<String> al = new ArrayList<String>();
		al.add("********");
		al.add(Hello);
		al.add("Devil");
		al.add("Welcome");
		al.add("Back");
		al.add("To");
		al.add("Hell");
		al.add("********");
	
		System.out.println("col"+al);
		
	System.out.println("___________________________________________________________");
	
	Collection<Float> ll = new LinkedList<Float>();
	
	Float f1 = 29.56f;	
	
	ll.add(f1);
	ll.add(24.50f);
	ll.add(35.97f);
	ll.add(107f);
	ll.add(97.89f);
	ll.add(24.57f);
	
	System.out.println(ll);
	System.out.println(ll.size());
	ll.remove(f1);
	ll.clear();
	System.out.println(ll);
	System.out.println(ll.isEmpty());
	System.out.println(ll.size());
	
	System.out.println("_____________________________________________________________");
	
	Collection<Integer> stack = new Stack<>();
	
	}
}
