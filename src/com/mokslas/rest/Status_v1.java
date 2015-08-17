package com.mokslas.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/status/*")

public class Status_v1 {
	
	private static final String version = "v0.01";
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String returnTitle() {
		return "<p>Dovanu REST API veikia</p>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String returnVersion() {
		return "<p>Version:</p>" + version;
	}
	
	
}
