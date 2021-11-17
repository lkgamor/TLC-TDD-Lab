package com.turntabl.tdd.exceptions;

public class MethodDoesNotExistException extends RuntimeException {
    public MethodDoesNotExistException(String msg) {
        super(msg);
    }
}
