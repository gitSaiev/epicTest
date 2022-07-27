package ru.saiev.epictest.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IncrementValueException extends RuntimeException {
    public IncrementValueException(String message) {
        super(message);
    }
}
