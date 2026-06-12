package com.springcore_constructor_injection;

import java.util.*;

public class StudentModel1 {
	private String name;
	private A obj;
	private List<String>friends;

	public StudentModel1(String name, A obj, List<String> friends) {
		this.name = name;
		this.obj=obj;
		this.friends = friends;
		
	}

	@Override
	public String toString() {
		return "StudentModel1 [name=" + name + ", obj=" + obj + ", friends=" + friends + "]";
	}
	
	
	

}
