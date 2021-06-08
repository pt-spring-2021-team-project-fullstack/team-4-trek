package com.wecancodeit.trekdemoteam4;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ContinentRepository continentRepo;

    @Resource
    private RegionRepository regionRepo;

    @Resource
    private TrekTypeRepository trekTypeRepo;

    @Resource
    private TrekRepository trekRepo;

    @Override
    public void run(String... args) throws Exception {
        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        Continent australia = new Continent("Australia");
        Continent antartica = new Continent("Antartica");

        Region north = new Region("North");
        Region south = new Region("South");
        Region west = new Region("West");
        Region east = new Region("East");

        TrekType baseCamp = new TrekType("Base Camp Trek");
        TrekType dayHike = new TrekType("Day Hike Trek");
        TrekType llama = new TrekType("Llama Trek");
        TrekType backPacker = new TrekType("Backpacker Trek");
        TrekType hutToHut = new TrekType("Hut to Hut Trek");

        Trek trek1 = new Trek(northAmerica,north,llama);
        Trek trek2 = new Trek(northAmerica,south,backPacker);
        Trek trek3 = new Trek(northAmerica,east,baseCamp);
        Trek trek4 = new Trek(northAmerica,west,dayHike);
        Trek trek5 = new Trek(southAmerica,north,baseCamp);
        Trek trek6 = new Trek(southAmerica,south,backPacker);
        Trek trek7 = new Trek(southAmerica,east,llama);
        Trek trek8 = new Trek(southAmerica,west,llama);
        Trek trek9 = new Trek(europe,north,baseCamp);
        Trek trek10 = new Trek(europe, south,llama);
        Trek trek11 = new Trek(europe,east,hutToHut);
        Trek trek12 = new Trek(europe, west,baseCamp;
        Trek trek13 = new Trek(africa,north,hutToHut);
        Trek trek14 = new Trek(africa,south,backPacker);
        Trek trek15 = new Trek(africa,east,baseCamp);
        Trek trek16 = new Trek(africa,west,dayHike);
        Trek trek17 = new Trek(asia,north,baseCamp);
        Trek trek18 = new Trek(asia,south,backPacker);
        Trek trek19 = new Trek(asia,east,hutToHut);
        Trek trek20 = new Trek(asia,west,hutToHut);
        Trek trek21= new Trek(australia,north,backPacker);
        Trek trek22 = new Trek(australia,south,llama);
        Trek trek23= new Trek(australia,east,llama);
        Trek trek24 = new Trek(australia,west,hutToHut);
        Trek trek25= new Trek(antartica,north,dayHike);
        Trek trek26 = new Trek(antartica,south,dayHike);
        Trek trek27= new Trek(antartica,east,dayHike);
        Trek trek28 = new Trek(antartica,west,dayHike);

        trekRepo.save(trek1);
        trekRepo.save(trek2);
        trekRepo.save(trek3);
        trekRepo.save(trek4);
        trekRepo.save(trek5);
        trekRepo.save(trek6);
        trekRepo.save(trek7);
        trekRepo.save(trek8);
        trekRepo.save(trek9);
        trekRepo.save(trek10);
        trekRepo.save(trek11);
        trekRepo.save(trek12);
        trekRepo.save(trek13);
        trekRepo.save(trek14);
        trekRepo.save(trek15);
        trekRepo.save(trek16);
        trekRepo.save(trek17);
        trekRepo.save(trek18);
        trekRepo.save(trek19);
        trekRepo.save(trek20);
        trekRepo.save(trek21);
        trekRepo.save(trek22);
        trekRepo.save(trek23);
        trekRepo.save(trek24);
        trekRepo.save(trek25);
        trekRepo.save(trek26);
        trekRepo.save(trek27);
        trekRepo.save(trek28);

    }


}
