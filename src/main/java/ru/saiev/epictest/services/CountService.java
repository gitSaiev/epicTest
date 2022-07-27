package ru.saiev.epictest.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.saiev.epictest.repositories.CountRepository;

@Service
@RequiredArgsConstructor
public class CountService {

    private final CountRepository countRepository;
}
