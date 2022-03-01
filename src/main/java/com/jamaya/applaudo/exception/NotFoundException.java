package com.jamaya.applaudo.exception;

public class NotFoundException extends Exception {

    public NotFoundException(String errorMessage) {
        super(errorMessage);
    }
    public NotFoundException() {
        super();
    }
}
