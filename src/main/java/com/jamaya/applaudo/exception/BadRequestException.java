package com.jamaya.applaudo.exception;

public class BadRequestException extends Exception{

    public BadRequestException() {
        super();
    }
    public BadRequestException(String errorMessage) {
        super(errorMessage);
    }
}
