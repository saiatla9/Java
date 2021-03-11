package com.cg.jh02.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Long order_id;
	
	@Column(name = "purchase_date")
	private Date purchaseDate;
	
	@ManyToMany
	@JoinColumn(name = "prod_id")
	private Set<Product> products;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Date purchaseDate) {
		super();
		this.purchaseDate = purchaseDate;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	
	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return String.format("Order [order_id=%s, purchaseDate=%s]", order_id, purchaseDate);
	}
	
	

}