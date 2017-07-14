package com.hitesh.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.hitesh.rest.model.ExampleModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api (value="/example", description="Sample JAX-RS service with Swagger documentation")
@Path ("/example")
public interface ExampleService 
{
	@GET
	@Path ("/{id}")
	@Produces ({MediaType.APPLICATION_JSON})
	@ApiOperation (
			value = "Get opertaion with Response",
			response = ExampleModel.class
			)
	Response get (
			@ApiParam(value="id", required=true)
			@PathParam ("id") String modelId);
	
	@POST
	@Path ("/validate")
	@Produces ({MediaType.APPLICATION_JSON})
	@Consumes ("application/json")
	Boolean validate (
			@ApiParam (value="model", required=true)
			ExampleModel model
			);
}
