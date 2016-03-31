package com.data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	private int profileid;
	private String id;
	private String name;
	private int saleamount;
	private double price;
	
	public Profile(){
		
	}
	
	public Profile(String id,int profileid,String name,int saleamount,double price){
		this.profileid = profileid;
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

	public int getProfileid() {
		return profileid;
	}

	public void setProfileid(int profileid) {
		this.profileid = profileid;
	}
}
