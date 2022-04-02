package cz.upce.drivers.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Ridic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String jmeno;

    @Column
    private String prijmeni;

    @Column
    private Integer telefonniCislo;

    @OneToMany(mappedBy = "id")
    private Set<PrehledRidicu> ridiciVPrehledu;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public Integer getTelefonniCislo() {
        return telefonniCislo;
    }

    public void setTelefonniCislo(Integer telefonniCislo) {
        this.telefonniCislo = telefonniCislo;
    }

    public Set<PrehledRidicu> getRidiciVPrehledu() {
        return ridiciVPrehledu;
    }

    public void setRidiciVPrehledu(Set<PrehledRidicu> ridiciVPrehledu) {
        this.ridiciVPrehledu = ridiciVPrehledu;
    }
}
