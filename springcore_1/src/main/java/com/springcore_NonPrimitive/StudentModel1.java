package com.springcore_NonPrimitive;

import java.util.*;

public class StudentModel1 {
	private String name;
	private List<String>friends;
	private Set<Integer>phoneNo;
	private Map<String,Integer>marks;
	private Properties props;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<Integer> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Set<Integer> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public StudentModel1(String name, List<String> friends, Set<Integer> phoneNo, Map<String, Integer> marks,
			Properties props) {
		super();
		this.name = name;
		this.friends = friends;
		this.phoneNo = phoneNo;
		this.marks = marks;
		this.props = props;
	}
	public StudentModel1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentModel1 [name=" + name + ", friends=" + friends + ", phoneNo=" + phoneNo + ", marks=" + marks
				+ ", props=" + props + "]";
	}
	

}
