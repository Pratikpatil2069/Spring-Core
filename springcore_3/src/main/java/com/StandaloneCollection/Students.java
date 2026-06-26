package com.StandaloneCollection;

import java.util.List;
import java.util.Map;

public class Students {
	private List<String> names;
	private Map<String,Integer> marks;

	public Students(List<String> names, Map<String, Integer> marks) {
		super();
		this.names = names;
		this.marks = marks;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getNames() {
		return names;
	}

	@Override
	public String toString() {
		return "Students [names=" + names + ", marks=" + marks + "]";
	}

	public Students(List<String> names) {
		super();
		this.names = names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

}
