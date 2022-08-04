package com.idbi.intech.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/home")
public class TestApi {

	
	
	@GET
	@Path("/testing")
	public String test() {
		return "Hello Welcome to Rest API";
	}
	
}
