package com.test.book;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductBook {
	private String id;
	private String name;
	private int saleamount;
	private double price;
	
	public ProductBook(){
		
	}
	
	public ProductBook(String id,String name,int saleamount,double price){
		this.id = id;
		this.name = name;
		this.saleamount = saleamount;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSaleamount() {
		return saleamount;
	}
	public void setSaleamount(int amount) {
		this.saleamount = amount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
