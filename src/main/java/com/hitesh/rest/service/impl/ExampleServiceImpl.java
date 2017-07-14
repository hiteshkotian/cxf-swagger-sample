package com.hitesh.rest.service.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.hitesh.rest.model.ErrorClass;
import com.hitesh.rest.model.ExampleModel;
import com.hitesh.rest.service.ExampleService;

public class ExampleServiceImpl implements ExampleService
{

	@Override
	public Response get(String modelId) 
	{
		if (modelId.equals("temp"))
		{
			ErrorClass error = new ErrorClass();
			error.setMessage("Invalid argument is passed here!!");
			return Response.status(Status.BAD_REQUEST)
					.entity(error).build();
		}
		ExampleModel example = new ExampleModel("example", 100);
		return Response.ok(example).build();
	}

	@Override
	public Boolean validate(ExampleModel model) {
		System.out.println("Validating : " + model);
		return true;
	}
	
}
