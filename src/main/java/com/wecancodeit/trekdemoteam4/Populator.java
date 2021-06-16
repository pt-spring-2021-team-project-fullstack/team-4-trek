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
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(europe);
        continentRepo.save(africa);
        continentRepo.save(asia);
        continentRepo.save(australia);
        continentRepo.save(antartica);
        Region north = new Region("North");
        Region south = new Region("South");
        Region west = new Region("West");
        Region east = new Region("East");
        regionRepo.save(north);
        regionRepo.save(south);
        regionRepo.save(west);
        regionRepo.save(east);
        TrekType baseCamp = new TrekType("Base Camp Trek");
        TrekType dayHike = new TrekType("Day Hike Trek");
        TrekType llama = new TrekType("Llama Trek");
        TrekType backPacker = new TrekType("Backpacker Trek");
        TrekType hutToHut = new TrekType("Hut to Hut Trek");
        trekTypeRepo.save(baseCamp);
        trekTypeRepo.save(dayHike);
        trekTypeRepo.save(llama);
        trekTypeRepo.save(backPacker);
        trekTypeRepo.save(hutToHut);
        Trek trek1 = new Trek("Northern North America Trek", northAmerica,north,llama, "/images/llamaNA.jpg");
        Trek trek2 = new Trek("Southern North America Trek", northAmerica,south,backPacker,"/images/BANA1.jpg");
        Trek trek3 = new Trek("Eastern North America Trek", northAmerica,east,baseCamp,"/images/BCNA2.jpeg");
        Trek trek4 = new Trek("Western North America Trek", northAmerica,west,dayHike,"/images/DAytrkNA3.jpg");
        Trek trek5 = new Trek("Northern South America Trek",southAmerica,north,baseCamp,"/images/BCSouthA4.jpg");
        Trek trek6 = new Trek("Southern South America Trek",southAmerica,south,backPacker,"/images/BPSA2.jpg");
        Trek trek7 = new Trek("Eastern South America Trek",southAmerica,east,llama,"/images/llamallama.jpg");
        Trek trek8 = new Trek("Western South America Trek",southAmerica,west,llama,"/images/llamaSA1.jpg");
        Trek trek9 = new Trek("Northern Europe Trek", europe,north,baseCamp,"/images/basecEurope2.jpg");
        Trek trek10 = new Trek("Southern Europe Trek", europe, south,llama,"/images/llamaEurope3.jpg");
        Trek trek11 = new Trek("Western Europe Trek", europe,east,hutToHut,"/images/huthuteurope1.jpg");
        Trek trek12 = new Trek("Eastern Europe Trek", europe, west,baseCamp,"/images/basecEurope4.webp");
        Trek trek13 = new Trek("Northern Africa Trek", africa,north,hutToHut,"/images/africahuttohut4.jpg");
        Trek trek14 = new Trek("Southern Africa Trek", africa,south,backPacker,"/images/africaBptrek3.jpg");
        Trek trek15 = new Trek("Eastern Africa Trek", africa,east,baseCamp,"/images/basecampAfrica2.jpeg");
        Trek trek16 = new Trek("Western Africa Trek", africa,west,dayHike,"/images/daytrkAfrica1.jpg");
        Trek trek17 = new Trek("Northern Asia Trek",  asia,north,baseCamp,"/images/asiabasecamp4.jpg");
        Trek trek18 = new Trek("Southern Asia Trek", asia,south,backPacker,"/images/asiabackpacking1.jpg");
        Trek trek19 = new Trek("Eastern Asia Trek", asia,east,hutToHut,"/images/huttohutasis2.jpg");
        Trek trek20 = new Trek("Western Asia Trek", asia,west,hutToHut,"/images/huttohutasia3.jpg");
        Trek trek21= new Trek("Northern Australia Trek", australia,north,backPacker,"/images/australiabackpacking2.jpg");
        Trek trek22 = new Trek("Southern Australia Trek", australia,south,llama,"/images/llamatrek1.jpg");
        Trek trek23= new Trek("Eastern Australia Trek", australia,east,llama,"/images/bwllama2.jpg");
        Trek trek24 = new Trek("Western Australia Trek", australia,west,hutToHut,"/images/australiahut1.jpg");
        Trek trek25= new Trek("Northern Antartica Trek", antartica,north,dayHike,"/images/antarctic-trek-2.jpg");
        Trek trek26 = new Trek("Southern Antartica Trek", antartica,south,dayHike,"/images/antarcticaTrek4.jpg");
        Trek trek27= new Trek("Eastern Antartica Trek", antartica,east,dayHike,"/images/antarcticTrek3.jpg");
        Trek trek28 = new Trek("Western Antartica Trek", antartica,west,dayHike,"/images/antarctic-trek-1.png");
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
