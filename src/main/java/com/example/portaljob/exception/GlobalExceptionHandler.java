package com.example.portaljob.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex, WebRequest request) {
        ex.printStackTrace();
        return new ResponseEntity<>("This request cannot proceed because of error "+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<String> handleRuntimeException2(RuntimeException ex, WebRequest request) {
        ex.printStackTrace();
        return new ResponseEntity<>("This request cannot proceed because of error because of some null value"+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
