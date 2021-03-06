package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.data.ExampleData;
import com.test.book.*;


public class BookService {
	
	private Map<String,ProductBook> bookData = ExampleData.getBook();
	
	public List<ProductBook> getBookExample(){
		return new ArrayList<ProductBook>(bookData.values());
	}
	
	public ProductBook addBook(String id,String name,int saleamount,double price){
		ProductBook newbook = new ProductBook(id,name,saleamount,price);
		//List<ProductBook> list = getBookExample();
		bookData.put(newbook.getId(), newbook);
		
		return newbook;
	}
	
	
}
