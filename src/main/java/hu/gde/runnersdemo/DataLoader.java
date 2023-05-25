package hu.gde.runnersdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final RunnerRepository runnerRepository;
    private final SponzorRepository sponzorRepository;

    @Autowired
    public DataLoader(RunnerRepository runnerRepository, SponzorRepository sponzorRepository) {
        this.runnerRepository = runnerRepository;
        this.sponzorRepository = sponzorRepository;
    }

    @Override
    public void run(String... args) {

        SponzorEntity sponzorEntity = new SponzorEntity();
        sponzorEntity.setSponzorName("MLSZ");
        sponzorRepository.save(sponzorEntity);

        RunnerEntity runnerEntity = new RunnerEntity();
        runnerEntity.setRunnerName("Tomi");
        runnerEntity.setAveragePace(310);
        runnerEntity.setHeight(183);
        runnerEntity.setSponzor(sponzorEntity);

        LapTimeEntity laptime1 = new LapTimeEntity();
        laptime1.setLapNumber(1);
        laptime1.setTimeSeconds(120);
        laptime1.setRunner(runnerEntity);

        LapTimeEntity laptime2 = new LapTimeEntity();
        laptime2.setLapNumber(2);
        laptime2.setTimeSeconds(110);
        laptime2.setRunner(runnerEntity);


        runnerEntity.getLaptimes().add(laptime1);
        runnerEntity.getLaptimes().add(laptime2);

        runnerRepository.save(runnerEntity);

        SponzorEntity sponzorEntity2 = new SponzorEntity();
        sponzorEntity2.setSponzorName("Farszer");
        sponzorRepository.save(sponzorEntity2);

        RunnerEntity runnerEntity2 = new RunnerEntity();
        runnerEntity2.setRunnerName("Zsuzsi");
        runnerEntity2.setAveragePace(290);
        runnerEntity2.setHeight(158);
        runnerEntity.setSponzor(sponzorEntity2);

        LapTimeEntity laptime3 = new LapTimeEntity();
        laptime3.setLapNumber(1);
        laptime3.setTimeSeconds(95);
        laptime3.setRunner(runnerEntity2);

        LapTimeEntity laptime4 = new LapTimeEntity();
        laptime4.setLapNumber(2);
        laptime4.setTimeSeconds(100);
        laptime4.setRunner(runnerEntity2);

        runnerEntity2.getLaptimes().add(laptime3);
        runnerEntity2.getLaptimes().add(laptime4);

        runnerRepository.save(runnerEntity2);

        //3. futó
        SponzorEntity sponzorEntity3 = new SponzorEntity();
        sponzorEntity3.setSponzorName("Microsoft");
        sponzorRepository.save(sponzorEntity3);

        RunnerEntity runnerEntity3 = new RunnerEntity();
        runnerEntity3.setRunnerName("Adam");
        runnerEntity3.setAveragePace(330);
        runnerEntity3.setHeight(191);
        runnerEntity.setSponzor(sponzorEntity3);

        LapTimeEntity laptime5 = new LapTimeEntity();
        laptime5.setLapNumber(1);
        laptime5.setTimeSeconds(50);
        laptime5.setRunner(runnerEntity3);

        LapTimeEntity laptime6 = new LapTimeEntity();
        laptime6.setLapNumber(2);
        laptime6.setTimeSeconds(60);
        laptime6.setRunner(runnerEntity3);

        runnerEntity3.getLaptimes().add(laptime5);
        runnerEntity3.getLaptimes().add(laptime6);

        runnerRepository.save(runnerEntity3);

    }
}

