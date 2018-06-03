package com.lockward.anubis;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz _fizzBuzz;

    public FizzBuzzTest() {
        _fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldPrintNumber() {
        assertEquals("1", _fizzBuzz.print(1));
        assertEquals("2", _fizzBuzz.print(2));
    }

    @Test
    public void shouldPrintFizz() {
        assertEquals("Fizz", _fizzBuzz.print(3));
        assertEquals("Fizz", _fizzBuzz.print(6));
        assertEquals("Fizz", _fizzBuzz.print(9));
    }

    @Test
    public void shouldPrintBuzz() {
        assertEquals("Buzz", _fizzBuzz.print(5));
        assertEquals("Buzz", _fizzBuzz.print(10));
    }

    @Test
    public void shouldPrintFizzBuzz() {
        assertEquals("FizzBuzz", _fizzBuzz.print(15));
        assertEquals("FizzBuzz", _fizzBuzz.print(30));
    }
}