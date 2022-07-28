package ru.saiev.epictest.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.saiev.epictest.dto.CounterDto;
import ru.saiev.epictest.entities.Count;
import ru.saiev.epictest.exceptions.CountNotFoundException;
import ru.saiev.epictest.repositories.CountRepository;
import ru.saiev.epictest.services.CountService;
import ru.saiev.epictest.services.ValidationService;

@Service
@RequiredArgsConstructor
public class CountServiceImpl implements CountService {

    private final CountRepository countRepository;
    private final ValidationService validationService;

    public Count getCountById(Integer id) {
        return countRepository.findById(id).orElseThrow(() -> new CountNotFoundException("Count not found!"));
    }

    public Count incrementCountById(CounterDto counterDto) {
        validationService.validateIncrementValue(counterDto.getIncrementCount());
        if (getCountById(counterDto.getCounterId()) == null) {
            throw new CountNotFoundException("Count not found!");
        }
        Count count = getCountById(counterDto.getCounterId());
        count.setValue(count.getValue() + counterDto.getIncrementCount());
        return countRepository.save(count);
    }

    @Override
    public Count save(Count count) {
        validationService.validateIncrementValue(count.getValue());
        return countRepository.save(count);
    }
}

