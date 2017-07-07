package com.hitesh.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.hitesh.rest.model.ExampleModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api (value="/example", description="Sample JAX-RS service with Swagger documentation")
@Path ("/example")
@Produces ("application/json")
public interface ExampleService 
{
	@GET
	@Path ("/{id}")
	@ApiOperation (
			value = "Get opertaion with Response",
			response = ExampleModel.class
			)
	ExampleModel get (
			@ApiParam(value="id", required=true)
			@PathParam ("id") String modelId);
	
	@POST
	@Path ("/validate")
	@Consumes ("application/json")
	Boolean validate (
			@ApiParam (value="model", required=true)
			ExampleModel model
			);
}
