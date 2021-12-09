package com.btech.test.ws;

import java.io.IOException;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;



public class TestService02 {


	@GET 
	@Path("/test03")
	public Response doGet(String data) throws IOException {
    return Response.ok().build();
	}
}
