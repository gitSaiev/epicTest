package ru.saiev.epictest.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.saiev.epictest.services.CountService;

@RestController
@RequiredArgsConstructor
public class CountController {

    private final CountService countService;
}
