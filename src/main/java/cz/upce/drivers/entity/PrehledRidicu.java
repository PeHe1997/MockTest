package cz.upce.drivers.entity;

import javax.persistence.*;

@Entity
public class PrehledRidicu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pokuta pokuta;

    @ManyToOne
    private StavRidice stavRidice;

    @ManyToOne
    private Ridic ridic;

    private Integer pocet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pokuta getPokuta() {
        return pokuta;
    }

    public void setPokuta(Pokuta pokuta) {
        this.pokuta = pokuta;
    }

    public StavRidice getStavRidice() {
        return stavRidice;
    }

    public void setStavRidice(StavRidice stavRidice) {
        this.stavRidice = stavRidice;
    }

    public Integer getPocet() {
        return pocet;
    }

    public void setPocet(Integer pocet) {
        this.pocet = pocet;
    }

    public Ridic getRidic() {
        return ridic;
    }

    public void setRidic(Ridic ridic) {
        this.ridic = ridic;
    }
}
