package com.turntabl.tdd;
/*
TASK:
Use TDD to write a function that calculates the first N number
of the Fibonacci series for a given natural number N.

TIPS:
1. Work in pairs
2. Be extreme
   i. use baby steps
   ii. define test, code, test
3. commit often
  i. show that you're really using TDD

DEFINITION OF TRHE FIBONACCI SERIES
The Fibonacci sequence is a series of numbers: 0 1 1 2 3 5 8 13 21 34 ...
The next number is found by adding the two numbers before it.
*/

import com.turntabl.tdd.exceptions.InvalidInputException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    static List<Integer> fibonacci(Integer number) {

        if(number <= 0) throw new InvalidInputException("Invalid Number Provided");

        if(number == 1) return List.of(0);

        if(number == 2) return List.of(0,1);

        return getFibonacciNumbers(number);
    }

    private static List<Integer> getFibonacciNumbers(Integer number) {
        List<Integer> fibonacciList = Arrays.asList(new Integer[number]);
        for(int i = 0; i < fibonacciList.size(); i++){
            if (i < 2) {
                fibonacciList.set(i, i);
            } else {
                fibonacciList.set(i, fibonacciList.get(i-1) + fibonacciList.get(i-2));
            }
        }
        return fibonacciList;
    }

}
