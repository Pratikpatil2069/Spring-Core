package com.springcore_reference_obj;

public class B {
	private int y;
	private A obj;
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public A getObj() {
		return obj;
	}
	public void setObj(A obj) {
		this.obj = obj;
	}
	public B() {
		
	}
	@Override
	public String toString() {
		return "B [y=" + y + ", obj=" + obj + "]";
	}
	
}
