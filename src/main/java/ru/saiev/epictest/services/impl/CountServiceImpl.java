package ru.saiev.epictest.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.saiev.epictest.dto.CounterDto;
import ru.saiev.epictest.entities.Count;
import ru.saiev.epictest.exceptions.CountNotFoundException;
import ru.saiev.epictest.repositories.CountRepository;
import ru.saiev.epictest.services.CountService;

@Service
@RequiredArgsConstructor
public class CountServiceImpl implements CountService {
    @Value("${message}")
    private final String message;

    private final CountRepository countRepository;

    public Count getCountById(Long id) {
        return countRepository.findById(id).orElseThrow(() -> new CountNotFoundException(message));
    }

    public Count incrementCountById(CounterDto counterDto) {
        Count count = getCountById(counterDto.getCounterId());
        count.setValue(count.getValue() + counterDto.getIncrementCount());
        return countRepository.save(count);
    }
}

