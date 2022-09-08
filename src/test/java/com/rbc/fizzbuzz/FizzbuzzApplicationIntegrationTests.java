package com.rbc.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

@SpringBootTest
class FizzbuzzApplicationIntegrationTests {

	@Test
	public void fizzBuzzWithState(){
		RestTemplate restTemplate = new RestTemplate();
		Object result = null;

		//To test Fizz for value 3
		String url = "http://localhost:8080/cleanState";
		restTemplate.getForObject(url, Object.class);
		url = "http://localhost:8080/next";
		for (int i = 0; i < 3; i ++)
		{
			result = restTemplate.getForObject(url, String.class);
		}
		assertTrue(String.valueOf(result).equals("Fizz"));

		//To test Buzz for value 5
		url = "http://localhost:8080/cleanState";
		restTemplate.getForObject(url, Object.class);
		url = "http://localhost:8080/next";
		for (int i = 0; i < 5; i ++)
		{
			result = restTemplate.getForObject(url, String.class);
		}
		assertTrue(String.valueOf(result).equals("Buzz"));

		//To test FizzBuzz for value 15
		url = "http://localhost:8080/cleanState";
		restTemplate.getForObject(url, Object.class);
		url = "http://localhost:8080/next";
		for (int i = 0; i < 15; i ++)
		{
			result = restTemplate.getForObject(url, String.class);
		}
		assertTrue(String.valueOf(result).equals("FizzBuzz"));

	}

}
