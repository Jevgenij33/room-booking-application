package com.roombookingapplication.exception;

public class ValidateException extends Exception {

    private String message;

    public ValidateException(String message) {
    }

    public String getMessage() {
        return message;
    }
}
