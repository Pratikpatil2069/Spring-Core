package com.Stereotype;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {
	@Value("Pratik")
	private String names;
	@Value("63.67")
	private double marks;
	
	@Value("#{list}")
	private List<String>city;

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	
	public Students(String names, double marks, List<String> city) {
		super();
		this.names = names;
		this.marks = marks;
		this.city = city;
	}

	
	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNames() {
		return names;
	}

	@Override
	public String toString() {
		return "Students [names=" + names + ", marks=" + marks + ", city=" + city + "]";
	}

	public Students(String names) {
		super();
		this.names = names;
	}

	public void setNames(String names) {
		this.names = names;
	}

}
