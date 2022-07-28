package ru.saiev.epictest.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IncrementCountException extends RuntimeException {
    public IncrementCountException(String message) {
        super(message);
    }
}
