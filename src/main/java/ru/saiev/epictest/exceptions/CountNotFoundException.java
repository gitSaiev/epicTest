package ru.saiev.epictest.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CountNotFoundException extends RuntimeException {
    public CountNotFoundException(String message) {
        super(message);
    }
}
