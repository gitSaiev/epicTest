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
@Setter
@Getter
public class Count {

    @Id
    private Long id;

    @Column(name = "value")
    private int value;

    public Count(int value) {
        this.value = value;
    }
}
