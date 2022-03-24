package cz.upce.drivers.repository;

import cz.upce.drivers.entity.Pokuta;
import cz.upce.drivers.entity.Ridic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokutaRepository extends JpaRepository<Pokuta, Long> {

}
