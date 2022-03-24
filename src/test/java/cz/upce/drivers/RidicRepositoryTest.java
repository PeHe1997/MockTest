package cz.upce.drivers;

import cz.upce.drivers.entity.Ridic;
import cz.upce.drivers.repository.RidicRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@SpringBootTest
class RidicRepositoryTest {
    @Autowired
    private RidicRepository ridicRepository;

    @Test
    void pridatRidiceTest() {
        Ridic ridic = new Ridic();
        ridic.setId(Long.valueOf("1"));
        ridic.setJmeno("Josef");
        ridic.setPrijmeni("Skocdopole");
        ridic.setTelefonniCislo(Integer.valueOf("777666777"));

        ridicRepository.save(ridic);
        List<Ridic> all = ridicRepository.findAll();
        Ridic Tomas = ridicRepository.findRidicByJmenoContains("Tomas");


        List<Ridic> jednaAzDva = ridicRepository.findRidicByIdBetween(1L, 2L);
        Ridic Novotny = ridicRepository.findRidicById(3L);


        List<Ridic> ascSort = ridicRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
        List<Ridic> descSort = ridicRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));


        Page<Ridic> all1 = ridicRepository.findAll(PageRequest.of(0, 2));
    }

}
