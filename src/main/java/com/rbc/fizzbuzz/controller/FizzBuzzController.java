package com.rbc.fizzbuzz.controller;

import com.rbc.fizzbuzz.service.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {

    @Autowired
    FizzBuzzService fizzBuzzService;

    @GetMapping("fizzBuzzWithoutState")
    public void fizzBuzzWithoutState()
    {
        fizzBuzzService.fizzBuzzWithoutState();
    }

    @GetMapping("next")
    public String next()
    {
        return fizzBuzzService.next().getCurrentStateFizzBuzzValue();
    }

    @GetMapping("cleanState")
    public void cleanState()
    {
        fizzBuzzService.cleanState();
    }
}
