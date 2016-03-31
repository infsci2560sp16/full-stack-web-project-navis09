package com.data;

import java.util.HashMap;
import java.util.Map;
import com.test.book.*;

public class ExampleData {
	private static Map<String,ProductBook> bookData = new HashMap<>();
	private static Map<String,Profile> profile = new HashMap<>();
	
	public static Map<String,ProductBook> getBook(){
		bookData.put("1", new ProductBook("1","Web",10,20));
		bookData.put("2", new ProductBook("2","Database",10,20));
		bookData.put("3", new ProductBook("3","Algorithm",40,20));
		bookData.put("4", new ProductBook("4","Interactive",11,20));
		bookData.put("5", new ProductBook("5","Advanced DB",8,20));
		bookData.put("6", new ProductBook("6","HTML",8,20));
		bookData.put("7", new ProductBook("7","Javascript",8,20));
		bookData.put("8", new ProductBook("8","CSS",8,20));
		bookData.put("9", new ProductBook("9","Decision",8,20));
		bookData.put("10", new ProductBook("10","Data",8,20));
		
		
		return bookData;
	}
	
	public static Map<String,Profile> getProfile(){
		return profile;
	}
	
}
