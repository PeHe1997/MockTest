package cz.upce.drivers;

import cz.upce.drivers.entity.*;
import cz.upce.drivers.repository.PokutaRepository;
import cz.upce.drivers.repository.PrehledRidicuRepository;
import cz.upce.drivers.repository.RidicRepository;
import cz.upce.drivers.repository.StavRidiceRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class saveTest {
        @Autowired
        private RidicRepository ridicRepository;
        @Autowired
        private StavRidiceRepository stavRidiceRepository;
        @Autowired
        private PokutaRepository pokutaRepository;
        @Autowired
        private PrehledRidicuRepository prehledRidicuRepository;

        @Test
        void pridatRidiceTest() {

            Ridic ridic = new Ridic();
            ridic.setId(Long.valueOf("2"));
            ridic.setJmeno("Josef");
            ridic.setPrijmeni("Skocdopole");
            ridic.setTelefonniCislo(Integer.valueOf("777666777"));
            ridicRepository.save(ridic);

            StavRidice stavRidice = new StavRidice();
            stavRidice.setId(1L);
            stavRidice.setState(StateEnum.AKTIVNI);
            stavRidiceRepository.save(stavRidice);

            Pokuta pokuta = new Pokuta();
            pokuta.setId(1L);
            pokuta.setCastka(2000);
            pokuta.setNazevPokuty("Rychlost");
            pokutaRepository.save(pokuta);

            PrehledRidicu prehledRidicu = new PrehledRidicu();
            prehledRidicu.setRidic(ridic);
            prehledRidicu.setPokuta(pokuta);
            prehledRidicu.setPocet(1);
            prehledRidicu.setStavRidice(stavRidice);
            prehledRidicuRepository.save(prehledRidicu);

            List<StavRidice> stav = stavRidiceRepository.findAll();
        }
}
