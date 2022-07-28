package ru.saiev.epictest.services;


import ru.saiev.epictest.dto.CounterDto;
import ru.saiev.epictest.entities.Count;


public interface CountService {

    Count getCountById(Integer id);

    Count incrementCountById(CounterDto counterDto);

    Count save(Count count);
}
