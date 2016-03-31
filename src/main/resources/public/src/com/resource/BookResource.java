package com.resource;

import com.test.*;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;

import com.test.book.ProductBook;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/BookResource")
public class BookResource {
	
	BookService bookservice = new BookService();
	MysqlJdbc mysql = new MysqlJdbc();
	
	@POST
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
public Response addPcParts(String incomingData) throws Exception {
		
		String returnString = null;
		JSONArray jsonArray = new JSONArray(); //not needed
		
		
		try {
			System.out.println("incomingData: " + incomingData);
			
			/*
			 * ObjectMapper is from Jackson Processor framework
			 * http://jackson.codehaus.org/
			 * 
			 * Using the readValue method, you can parse the json from the http request
			 * and data bind it to a Java Class.
			 */
			ObjectMapper mapper = new ObjectMapper();  
			ProductBook itemEntry = mapper.readValue(incomingData, ProductBook.class);
			
			BookService bs = new BookService();
			bs.addBook(itemEntry.getId(), itemEntry.getName(), itemEntry.getSaleamount(), itemEntry.getPrice());
			
			
			
			returnString = jsonArray.toString();
				
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to process your request").build();
		}
		
		return Response.ok(returnString).build();
	}
	
	@Path("/JSON")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ProductBook addBook(ProductBook book){
		String pid = book.getId();
		String pname = book.getName();
		int saleamount = book.getSaleamount();
		double price = book.getPrice();
		
		bookservice.addBook(pid, pname, saleamount, price);
		return book;
		
	}
	
	@Path("/XML")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<ProductBook> returnXML(){
		return bookservice.getBookExample();
	}
	
	@Path("/JSON")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductBook> returnJSON(){
		return bookservice.getBookExample();
	}
	
	
	@Path("/DbXml")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<ProductBook> returnDbXml() throws Exception{
		return mysql.getAllBooks();
	}
	
	@Path("/DbJson")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductBook> returnDbJson() throws Exception{
		return mysql.getAllBooks();
	}
	
	
	
	
	
}
