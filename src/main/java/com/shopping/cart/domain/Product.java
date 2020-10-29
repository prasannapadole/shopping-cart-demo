package com.shopping.cart.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	private List<Cart> carts = new ArrayList<>();
	
	public Product() {
		
	}

	public Product(String productName, Double price, Integer quantity) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
