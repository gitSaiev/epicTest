package ru.saiev.epictest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.saiev.epictest.entities.Count;

@Repository
public interface CountRepository extends JpaRepository<Count, Long> {
}
