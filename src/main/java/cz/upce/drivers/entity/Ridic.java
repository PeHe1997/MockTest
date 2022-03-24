package cz.upce.drivers.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Ridic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String jmeno;

    @Column()
    private String prijmeni;

    @Column()
    private Integer telefonniCislo;


    private Set<PrehledRidicu> ridiciVPrehledu;

    public Ridic() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
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

    @OneToMany(mappedBy = "id")
    public Set<PrehledRidicu> getRidiciVPrehledu() {
        return ridiciVPrehledu;
    }

    public void setRidiciVPrehledu(Set<PrehledRidicu> ridiciVPrehledu) {
        this.ridiciVPrehledu = ridiciVPrehledu;
    }
}
