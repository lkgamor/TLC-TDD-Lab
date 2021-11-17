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
        assertEquals(List.of(0), Fibonacci.fibonacci(1));
    }

    @Test
    void testFibonacciSeriesTwo() {
        assertEquals(List.of(0, 1), Fibonacci.fibonacci(2));
    }

    @Test
    void testFibonacciSeriesAboveTwo() {
        assertEquals(List.of(0, 1, 1, 2, 3, 5, 8), Fibonacci.fibonacci(7));
    }
}