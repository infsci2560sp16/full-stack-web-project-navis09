package com.test;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/message")
public class Message {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Message only for test</p>";
	}
	
}



