package ru.saiev.epictest.services.impl;

import org.springframework.stereotype.Service;
import ru.saiev.epictest.exceptions.IncrementCountException;
import ru.saiev.epictest.services.ValidationService;

@Service
public class ValidationServiceImpl implements ValidationService {

    @Override
    public void validateIncrementValue(int incrementCount) {
        if (incrementCount <= 0) {
            throw new IncrementCountException("Illegal increment value");
        }
    }
}
