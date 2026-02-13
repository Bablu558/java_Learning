package com.kodnest.productmanagementsystem;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
      @Column
	String productName;
      @Column
	int productPrice;
      @Column
	int productStock;
      @Column
	String description;
      @Column
	String productImageUrl;
	
	public Product() {
		
	}

	public Product(int pid, String productName, int productPrice, int productStock, String description,
			String productImageUrl) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
		this.description = description;
		this.productImageUrl = productImageUrl;
	}

	public Product(String productName, int productPrice, int productStock, String description, String productImageUrl) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
		this.description = description;
		this.productImageUrl = productImageUrl;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productStock=" + productStock + ", description=" + description + ", productImageUrl="
				+ productImageUrl + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, pid, productImageUrl, productName, productPrice, productStock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(description, other.description) && pid == other.pid
				&& Objects.equals(productImageUrl, other.productImageUrl)
				&& Objects.equals(productName, other.productName) && productPrice == other.productPrice
				&& productStock == other.productStock;
	}
	
	
}
