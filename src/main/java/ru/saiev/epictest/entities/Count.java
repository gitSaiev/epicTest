package ru.saiev.epictest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "epic-test", name = "count")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Count {

    @Id
    private Integer id;

    @Column(name = "value")
    private int value;

}
