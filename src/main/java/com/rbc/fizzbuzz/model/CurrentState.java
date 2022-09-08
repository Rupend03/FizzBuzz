package com.rbc.fizzbuzz.model;

public class CurrentState {

    private int currentState;
    private String currentStateFizzBuzzValue;

    public CurrentState(int currentState, String currentStateFizzBuzzValue)
    {
        this.currentState = currentState;
        this.currentStateFizzBuzzValue = currentStateFizzBuzzValue;
    }

    public int getCurrentState() {
        return currentState;
    }

    public void setCurrentState(int currentState) {
        this.currentState = currentState;
    }

    public String getCurrentStateFizzBuzzValue() {
        return currentStateFizzBuzzValue;
    }

    public void setCurrentStateFizzBuzzValue(String currentStateFizzBuzzValue) {
        this.currentStateFizzBuzzValue = currentStateFizzBuzzValue;
    }
}
