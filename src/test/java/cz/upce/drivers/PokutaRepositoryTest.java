package cz.upce.drivers;

import cz.upce.drivers.entity.Pokuta;
import cz.upce.drivers.repository.PokutaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class PokutaRepositoryTest {
    @Autowired
    private PokutaRepository pokutaRepository;

    @Test
    void pridatPokutuTest() {
        Pokuta pokuta = new Pokuta();
        pokuta.setNazevPokuty("Rychlost");
        pokuta.setCastka(2000);

        pokutaRepository.save(pokuta);
        List<Pokuta> all = pokutaRepository.findAll();

    }

}
