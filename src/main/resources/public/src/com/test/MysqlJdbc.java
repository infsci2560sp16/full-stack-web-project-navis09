package com.test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.test.book.ProductBook;



public class MysqlJdbc {

	public static ResultSet connectQuery() throws SQLException{
			ResultSet rs = null;
			Connection connect=null;
			try {
		      Class.forName("com.mysql.jdbc.Driver");       
		      //Class.forName("org.gjt.mm.mysql.Driver");
		     //System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      //System.out.print("Error loading Mysql Driver!");
		      e.printStackTrace();
		    }
		    try {
		      connect = DriverManager.getConnection(
		          "jdbc:mysql://localhost:8889/Maibook","root","root");
		           

		      //System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      rs = stmt.executeQuery("select * from Product_book");  
		      
		      
		    }
		    catch (Exception e) {
		      //System.out.print("get data error! ");
		      e.printStackTrace();
		    }
		    
		    return rs;
	}
	
	public List<ProductBook> getAllBooks() throws Exception{
		List<ProductBook> list = new ArrayList<ProductBook>();
		ResultSet rs = MysqlJdbc.connectQuery();
		String pid;
		String pname;
		int saleamount;
		double price;
		
		try{
			while (rs.next()) {
				pid = rs.getString("pid");
				pname = rs.getString("pname");
				saleamount = rs.getInt("saleamount");
				price = rs.getInt("price");
				ProductBook book = new ProductBook(pid,pname,saleamount,price);
				list.add(book);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return list; 
	}
	
	
	

}
