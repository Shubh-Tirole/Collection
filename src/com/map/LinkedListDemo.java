package com.map;

import java.util.*;



public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> l1=new HashMap<>();
		
		
		Employee e1 = new Employee(111,100000);
		Employee e2 = new Employee(222,600000);
		Employee e3 = new Employee(111,900000);
		
		Map<Employee,String> MapE=new HashMap<>();
		
		MapE.put(e3, "Neeraj");
		MapE.put(e1, "Shubham");
		MapE.put(e2, "Rohit");
		
		System.out.println(MapE);
		

	}

}
