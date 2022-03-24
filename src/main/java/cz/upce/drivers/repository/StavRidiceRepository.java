package cz.upce.drivers.repository;

import cz.upce.drivers.entity.StavRidice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StavRidiceRepository extends JpaRepository<StavRidice, Long> {

        @EntityGraph(attributePaths = "prehledRidicu")
        Optional<StavRidice> findById(Long id);
}
