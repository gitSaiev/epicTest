package ru.saiev.epictest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.saiev.epictest.exceptions.CountNotFoundException;
import ru.saiev.epictest.exceptions.IncrementCountException;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = CountNotFoundException.class)
    public ResponseEntity<?> handleCountNotFoundException(CountNotFoundException countNotFoundException) {
        return new ResponseEntity<>(countNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = CountNotFoundException.class)
    public ResponseEntity<?> handleIncrementCountException(IncrementCountException incrementCountException) {
        return new ResponseEntity<>(incrementCountException.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
