package ru.saiev.epictest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CounterDto {

    @NotNull
    private Integer counterId;

    private int incrementCount;
}
