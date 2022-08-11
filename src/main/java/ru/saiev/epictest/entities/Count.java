package ru.saiev.epictest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(schema = "epic-data", name = "counters")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Count {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "counter")
    private int value;

}
