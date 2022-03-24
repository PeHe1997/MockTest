package cz.upce.drivers.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Pokuta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String nazevPokuty;
    @Column()
    private Integer castka;

    private Set<PrehledRidicu> pokutyVPrehledu;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getNazevPokuty() {
        return nazevPokuty;
    }

    public void setNazevPokuty(String nazevPokuty) {
        this.nazevPokuty = nazevPokuty;
    }

    @OneToMany(mappedBy = "id")
    public Set<PrehledRidicu> getPokutyVPrehledu() {
        return pokutyVPrehledu;
    }

    public void setPokutyVPrehledu(Set<PrehledRidicu> pokutyVPrehledu) {
        this.pokutyVPrehledu = pokutyVPrehledu;
    }

    public Integer getCastka() {
        return castka;
    }

    public void setCastka(Integer castka) {
        this.castka = castka;
    }
}
