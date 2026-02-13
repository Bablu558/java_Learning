package com.kodnest.firsthibernate;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table
public class Bankuser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int userid;
	@Column
	String customername;
	@Column
	String customeremail;
	@Column
	int customerphone;
	String accountnumber;
	
	public Bankuser() {
		
	}
	
	
	
	
	
	
	
	public Bankuser(int userid, String customername, String customeremail, int customerphone, String accountnumber) {
		super();
		this.userid = userid;
		this.customername = customername;
		this.customeremail = customeremail;
		this.customerphone = customerphone;
		this.accountnumber = accountnumber;
	}







	public Bankuser(String customername, String customeremail, int customerphone, String accountnumber) {
		super();
		this.customername = customername;
		this.customeremail = customeremail;
		this.customerphone = customerphone;
		this.accountnumber = accountnumber;
	}







	public int getUserid() {
		return userid;
	}







	public void setUserid(int userid) {
		this.userid = userid;
	}







	public String getCustomername() {
		return customername;
	}







	public void setCustomername(String customername) {
		this.customername = customername;
	}







	public String getCustomeremail() {
		return customeremail;
	}







	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}







	public int getCustomerphone() {
		return customerphone;
	}







	public void setCustomerphone(int customerphone) {
		this.customerphone = customerphone;
	}







	public String getAccountnumber() {
		return accountnumber;
	}







	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}







	@Override
	public String toString() {
		return "Bankuser [userid=" + userid + ", customername=" + customername + ", customeremail=" + customeremail
				+ ", customerphone=" + customerphone + ", accountnumber=" + accountnumber + "]";
	}







	@Override
	public int hashCode() {
		return Objects.hash(accountnumber, customeremail, customername, customerphone, userid);
	}







	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bankuser other = (Bankuser) obj;
		return Objects.equals(accountnumber, other.accountnumber) && Objects.equals(customeremail, other.customeremail)
				&& Objects.equals(customername, other.customername) && customerphone == other.customerphone
				&& userid == other.userid;
	}







	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
