package com.rbc.fizzbuzz.service.impl;

import com.rbc.fizzbuzz.model.CurrentState;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.CacheManager;
import org.springframework.cache.*;
import com.rbc.fizzbuzz.service.FizzBuzzService;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class FizzBuzzServiceImpl implements FizzBuzzService {

    private CacheManager cacheManager;

    public FizzBuzzServiceImpl(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public void fizzBuzzWithoutState(){
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }

    @CachePut(value="currentState", key = "'FizzBuzzState'")
    public CurrentState next(){
        Cache cache = this.cacheManager.getCache("currentState");
        CurrentState currentState;
        int nextValue;
        if ( null == cache.get("FizzBuzzState")){
            currentState = new CurrentState(0, "");
        }else{
            currentState = (CurrentState)cache.get("FizzBuzzState").get();
        }
        if (currentState.getCurrentState() == 100) {
            nextValue = 1;
        }
        else{
            nextValue = currentState.getCurrentState() + 1;
        }
        String nextFizzBuzzValue =  nextValue % 3 == 0 ? (nextValue % 5 == 0 ? "FizzBuzz" : "Fizz") :
                (nextValue % 5 == 0 ? "Buzz" : String.valueOf(nextValue));
        System.out.println(nextFizzBuzzValue);
        return new CurrentState(nextValue, nextFizzBuzzValue);
    }

    @CachePut(value="currentState", key = "'FizzBuzzState'")
    public CurrentState cleanState()
    {
        return new CurrentState(0,"");
    }
}
