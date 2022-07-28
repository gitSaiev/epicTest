package ru.saiev.epictest.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.saiev.epictest.dto.CounterDto;
import ru.saiev.epictest.entities.Count;
import ru.saiev.epictest.services.CountService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CountController {

    private final CountService countService;

    @GetMapping("/count")
    @Tag(name = "CountController", description = "Получить count по id")
    public ResponseEntity<Count> getCount(Integer id) {
        return new ResponseEntity<>(countService.getCountById(id), HttpStatus.OK);
    }

    @PostMapping("/count")
    @Tag(name = "CountController", description = "Сохранить count")
    public ResponseEntity<Count> saveCount(@RequestBody Count count) {
        return new ResponseEntity<>(countService.save(count), HttpStatus.OK);
    }

    @PatchMapping("/count")
    @Tag(name = "CountController", description = "Инкрементировать count по id")
    public ResponseEntity<Count> incrementCount(@RequestBody CounterDto counterDto) {
        return new ResponseEntity<>(countService.incrementCountById(counterDto), HttpStatus.OK);
    }
}