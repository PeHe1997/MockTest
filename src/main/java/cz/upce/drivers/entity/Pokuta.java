package cz.upce.drivers.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Pokuta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String nazevPokuty;
    @Column
    private Integer castka;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazevPokuty() {
        return nazevPokuty;
    }

    public void setNazevPokuty(String nazevPokuty) {
        this.nazevPokuty = nazevPokuty;
    }

    public Integer getCastka() {
        return castka;
    }

    public void setCastka(Integer castka) {
        this.castka = castka;
    }
}
