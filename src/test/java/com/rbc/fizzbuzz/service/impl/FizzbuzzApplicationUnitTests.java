package com.rbc.fizzbuzz.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class FizzbuzzApplicationUnitTests {

	@Autowired
	FizzBuzzServiceImpl fizzBuzzService;

	@Test
	public void fizzBuzzWithoutState(){
       fizzBuzzService.fizzBuzzWithoutState();
	}

}
