package com.loan.Loan.Microservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.loan.Loan.Microservice.model.DummyModel;

@RestController
public class DummyController {

	@GetMapping("/loans/{number}")
	public DummyModel dummy(@PathVariable String number)
	{
		return new DummyModel("H00987987972342", "car" , 234343,3258,18 );
	}
}
