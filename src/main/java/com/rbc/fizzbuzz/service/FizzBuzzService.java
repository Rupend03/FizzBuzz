package com.rbc.fizzbuzz.service;

import com.rbc.fizzbuzz.model.CurrentState;

public interface FizzBuzzService {

    public void fizzBuzzWithoutState();

    public CurrentState next();

    public CurrentState cleanState();
}
