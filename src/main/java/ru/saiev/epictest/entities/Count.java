package ru.saiev.epictest.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "epic-test", name = "count")
@AllArgsConstructor
@NoArgsConstructor
public class Count {

    @Id
    private Long id;
}
