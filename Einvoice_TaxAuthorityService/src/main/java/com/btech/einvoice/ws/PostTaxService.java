package com.btech.einvoice.ws;

import java.io.IOException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value = "/AX")
public class PostTaxService {

	@Path(value = "/PostTax")
	@POST
	@Produces(MediaType.APPLICATION_JSON)

	public Response doPost(String data) throws IOException {
		return Response.ok().build();
	}

}
