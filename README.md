# FizzBuzz

Project has 3 services

1. fizzBuzzWithoutState() (which can be accessed from url http://localhost:8080/fizzBuzzWithoutState, if url and port is dafault)
This one iterates through 1 to 100 and demonstrates the FizzBuzz algorithm.

2. next() (which can be accessed from url http://localhost:8080/fizzBuzzWithoutState, if url and port is dafault)
This one advances the sequence from 1..100, maintains the current state and returns the current result (this is stateful). Once the value reaches 100 it starts again from 1.

3. cleanState()
This one clears the state of the stateful FizzBuzz implementation in the 2. above. This sets the current state to the initial state.
