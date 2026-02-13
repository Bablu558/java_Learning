package com.kodnest.mappingproject;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student2")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sid;
	@Column
	String sname;
	@Column
	int smarks;
	@Column
	int sage;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aid",referencedColumnName = "addrid")
	Address address;
	
	public Student() {
		
	}

	public Student(int sid, String sname, int smarks, int sage, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.sage = sage;
		this.address = address;
	}

	public Student(String sname, int smarks, int sage, Address address) {
		super();
		this.sname = sname;
		this.smarks = smarks;
		this.sage = sage;
		this.address = address;
	}

	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSmarks() {
		return smarks;
	}

	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", sage=" + sage + ", address="
				+ address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, sage, sid, smarks, sname);
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
		return Objects.equals(address, other.address) && sage == other.sage && sid == other.sid
				&& smarks == other.smarks && Objects.equals(sname, other.sname);
	}
	
	
	
}
