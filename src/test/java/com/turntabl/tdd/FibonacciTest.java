package com.turntabl.tdd;

import com.turntabl.tdd.exceptions.InvalidInputException;
import com.turntabl.tdd.exceptions.MethodDoesNotExistException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testFibonacciSeriesZeroOrNegative(){
        assertThrows(InvalidInputException.class, ()-> Fibonacci.fibonacci(0));
    }

    @Test
    void testFibonacciSeriesOne() {
        assertEquals(0, Fibonacci.fibonacci(1));
    }

    @Test
    void testFibonacciSeriesTwoOrAbove() {
        assertEquals(List.of(0, 1), Fibonacci.fibonacci(2));
    }
}