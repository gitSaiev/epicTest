package ru.saiev.epictest.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.saiev.epictest.dto.CounterDto;
import ru.saiev.epictest.entities.Count;
import ru.saiev.epictest.repositories.CountRepository;


public interface CountService {

    Count getCountById(Long id);

    Count incrementCountById(CounterDto counterDto);

    Count save(Count count);
}
