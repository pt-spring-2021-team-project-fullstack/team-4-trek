package com.wecancodeit.trekdemoteam4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import javax.annotation.Resource;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JpaWiringTest {

    @Autowired
    private TestEntityManager entityManager;

    @Resource
    private  ContinentRepository continentRepo;


    @Resource
    private RegionRepository regionRepo;

    @Resource
    private TrekTypeRepository trekTypeRepo;


    @Resource
    private TrekRepository trekRepo;

    @Test
    public void shouldReturnAListOfTreks(){
        Continent nA = new Continent("North America");
        Continent sA = new Continent("South America");

        continentRepo.save(nA);
        continentRepo.save(sA);

        Region north = new Region("north");
        Region south = new Region("south");

        regionRepo.save(north);
        regionRepo.save(south);

        TrekType backPack = new TrekType("BackPack");
        TrekType llamaTrack = new TrekType("Llama");

        trekTypeRepo.save(backPack);
        trekTypeRepo.save(llamaTrack);


        Trek trek1 = new Trek(nA,north,backPack);
        Trek trek2 = new Trek(nA,south,llamaTrack);
        Trek trek3 = new Trek(sA,south,llamaTrack);

        trekRepo.save(trek1);
        trekRepo.save(trek2);

        entityManager.flush();
        entityManager.clear();


        Optional<Continent> foundContinentOpt = continentRepo.findById(nA.getId());
        Continent foundContinent = foundContinentOpt.get();

        assertThat(foundContinent.getTreks()).contains(trek1,trek2);
    }
}
