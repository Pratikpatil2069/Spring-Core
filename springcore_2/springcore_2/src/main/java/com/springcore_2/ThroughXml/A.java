package com.springcore_2.ThroughXml;

public class A {
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
	
	public void init() {
		System.out.println("initializing the beans!");
	}
	
	public void destroy() {
		System.out.println("destrotying the beans");
	}
	
	
}
