package com.gaanz.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/dynamic")
public class DemoRestJersey {
 
	@GET
	@Path("/status.xml")
	public Response getMsg() {
 
		String output = "<?xml version=\"1.0\" ?>\r\n<PrivateData>\r\n<PrivateItem key=\"STATUS\" value=\"{'success': true, 'errorDescription': '', 'status': 'OPT_IN', 'channel': '', 'agentName': '', 'date': ''}\" />\r\n</PrivateData>";
		
		return Response.status(200).header("Content-Type", "application/xml;charset=utf-8").entity(output).build();
 
	}
 
}