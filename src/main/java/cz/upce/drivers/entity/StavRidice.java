package cz.upce.drivers.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class StavRidice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private StateEnum state;

    private Set<PrehledRidicu> stavVPrehledu;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    @OneToMany(mappedBy = "id")
    public Set<PrehledRidicu> getStavVPrehledu() {
        return stavVPrehledu;
    }

    public void setStavVPrehledu(Set<PrehledRidicu> stavVPrehledu) {
        this.stavVPrehledu = stavVPrehledu;
    }
}
