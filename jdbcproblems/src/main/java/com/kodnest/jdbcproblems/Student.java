package com.kodnest.jdbcproblems;

import java.util.Objects;

public class Student {

	
	int id;
	String name;
	String gender;
	int age;
	String college;
	String university;
	int tenthmarks;
	int twelvethmarks;
	int degreeAggregate;
	Address address;
	
	public Student() {
		
	}
	
	
	public Student(int id, String name, String gender, int age, String college, String university,
			int tenthmarks, int twelvethmarks, int degreeAggregate, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		
		this.age = age;
		this.college = college;
		this.university = university;
		this.tenthmarks = tenthmarks;
		this.twelvethmarks = twelvethmarks;
		this.degreeAggregate = degreeAggregate;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public String getUniversity() {
		return university;
	}


	public void setUniversity(String university) {
		this.university = university;
	}


	public int getTenthmarks() {
		return tenthmarks;
	}


	public void setTenthmarks(int tenthmarks) {
		this.tenthmarks = tenthmarks;
	}


	public int getTwelvethmarks() {
		return twelvethmarks;
	}


	public void setTwelvethmarks(int twelvethmarks) {
		this.twelvethmarks = twelvethmarks;
	}


	public int getDegreeAggregate() {
		return degreeAggregate;
	}


	public void setDegreeAggregate(int degreeAggregate) {
		this.degreeAggregate = degreeAggregate;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age
				+ ", college=" + college + ", university=" + university + ", tenthmarks=" + tenthmarks
				+ ", twelvethmarks=" + twelvethmarks + ", degreeAggregate=" + degreeAggregate +", address="+ address + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, college, degreeAggregate, gender, id, name, tenthmarks, twelvethmarks,
				university);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(college, other.college) && degreeAggregate == other.degreeAggregate
				&& Objects.equals(gender, other.gender) && id == other.id
				&& Objects.equals(name, other.name) && tenthmarks == other.tenthmarks
				&& twelvethmarks == other.twelvethmarks && Objects.equals(university, other.university);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
