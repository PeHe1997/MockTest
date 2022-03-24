package cz.upce.drivers.repository;

import cz.upce.drivers.entity.Ridic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RidicRepository extends JpaRepository<Ridic, Long> {
    Ridic findRidicByJmenoContains(String contains);

    @Query(" select p from Ridic p where p.id between 1 and 2")
    List<Ridic> findRidicByIdBetween(Long start, Long end);

    @Query(" SELECT p FROM Ridic p WHERE p.id = 3")
    Ridic findRidicById(Long selection);
}
