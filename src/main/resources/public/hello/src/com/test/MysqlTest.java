package com.test;

import com.test.book.ProductBook;

public class MysqlTest {
	
	public static String print(String[] data){
		String result="";
		for(int i=0;i<data.length;i++){
			if(data[i]!=null)
				result = result + data[i];
		}
		return result;
	
	}
	public static void main(String[] args){
//		MysqlJdbc test1 = new MysqlJdbc();
//		String[] output = test1.connectDb();
//		String outputS = print(output);
//		System.out.println(outputS);
		
		ProductBook p1 = new ProductBook("1","Web",10,23);
		ProductBook p2 = new ProductBook("2","Database",12,25);
		System.out.println(p1.getSaleamount());
		p2.getName();
	}
}
