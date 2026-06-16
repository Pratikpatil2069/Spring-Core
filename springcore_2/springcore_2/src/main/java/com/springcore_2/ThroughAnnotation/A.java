package com.springcore_2.ThroughAnnotation;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class A{
	private int prise;

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [prise=" + prise + "]";
	}

	@PreDestroy
	public void end(){
		System.out.println("Destroying the beans");
		
	}

	@PostConstruct
	public void start() {
		
		System.out.println("initializing  the beans");
	}
	
	
}
