package ru.saiev.epictest.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.saiev.epictest.dto.CounterDto;
import ru.saiev.epictest.entities.Count;
import ru.saiev.epictest.services.CountService;
import ru.saiev.epictest.services.ValidationService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CountController {

    private final CountService countService;
    private final ValidationService validationService;

    @GetMapping("/count")
    @Tag(name = "CountController", description = "Получить count по id")
    public ResponseEntity<Count> getCount(Long id) {
        return new ResponseEntity<>(countService.getCountById(id), HttpStatus.OK);
    }

    @PostMapping("/count")
    @Tag(name = "CountController", description = "Инкрементировать count по id")
    public ResponseEntity<Count> incrementCount(CounterDto counterDto) {
        validationService.validateIncrementValue(counterDto.getIncrementCount());
        return new ResponseEntity<>(countService.incrementCountById(counterDto), HttpStatus.OK);
    }
}