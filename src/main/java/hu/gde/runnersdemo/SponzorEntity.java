package hu.gde.runnersdemo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SponzorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sponzorId;
    private String sponzorName;
    @JsonIgnore
    @OneToMany
    private List<RunnerEntity> runners = new ArrayList<>();

    public long getSponzorId() {
        return sponzorId;
    }

    public void setSponzorId(long sponzorId) {
        this.sponzorId = sponzorId;
    }

    public String getSponzorName() {
        return sponzorName;
    }

    public void setSponzorName(String sponzorName) {
        this.sponzorName = sponzorName;
    }

    public List<RunnerEntity> getRunners() {
        return runners;
    }

    public void setRunners(List<RunnerEntity> runners) {
        this.runners = runners;
    }
}
