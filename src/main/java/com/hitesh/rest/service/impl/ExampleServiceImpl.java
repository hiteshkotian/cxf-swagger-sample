package com.hitesh.rest.service.impl;

import com.hitesh.rest.model.ExampleModel;
import com.hitesh.rest.service.ExampleService;

public class ExampleServiceImpl implements ExampleService
{

	@Override
	public ExampleModel get(String modelId) 
	{
		return new ExampleModel("example", 100);
	}

	@Override
	public Boolean validate(ExampleModel model) {
		System.out.println("Validating : " + model);
		return true;
	}
	
}
