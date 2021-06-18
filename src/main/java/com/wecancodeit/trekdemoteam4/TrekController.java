package com.wecancodeit.trekdemoteam4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class TrekController {

    @Resource
    private  ContinentRepository continentRepo;

    @Resource
    private RegionRepository regionRepo;

    @Resource
    private TrekTypeRepository trekTypeRepo;

    @Resource
    private TrekRepository trekRepo;

    @RequestMapping("/treks")
    public String displayTreks(Model model){
        model.addAttribute("treksModel",trekRepo.findAll());
        model.addAttribute("continentModel",continentRepo.findAll());
        model.addAttribute("regionModel",regionRepo.findAll());
        model.addAttribute("typeModel",trekTypeRepo.findAll());
        return "treksView";
    }

    @RequestMapping("/regions")
    public String displayRegions(Model model){
        model.addAttribute("regionsModel", regionRepo.findAll());
        return "regions";
    }

    @PostMapping("/create-trek")
    public String createOwnTrek(@RequestParam String trekName, @RequestParam String continentName, @RequestParam String regionName, @RequestParam String typeName, @RequestParam String imageUrl){

        Continent continentToAdd;
        Optional<Continent> continentToAddOpt = continentRepo.findByContinentName(continentName);

        if (continentToAddOpt.isEmpty()){
            continentToAdd = new Continent(continentName);
            continentRepo.save(continentToAdd);
        } else {
            continentToAdd = continentToAddOpt.get();
        }

        Region regionToAdd;
        Optional<Region> regionToAddOpt = regionRepo.findByRegionName(regionName);

        if (regionToAddOpt.isEmpty()){
            regionToAdd = new Region(regionName);
            regionRepo.save(regionToAdd);
        } else {
            regionToAdd = regionToAddOpt.get();
        }

        TrekType trekTypeToAdd;
        Optional<TrekType> trekTypeToAddOpt = trekTypeRepo.findByTypeName(typeName);

        if (trekTypeToAddOpt.isEmpty()){
            trekTypeToAdd = new TrekType(typeName);
            trekTypeRepo.save(trekTypeToAdd);
        } else {
            trekTypeToAdd = trekTypeToAddOpt.get();
        }

        Optional<Trek> trekToAddOpt = trekRepo.findByTrekName(trekName);

        if (trekToAddOpt.isEmpty()){
            Trek trekToAdd = new Trek(trekName,continentToAdd,regionToAdd,trekTypeToAdd,imageUrl);
            trekRepo.save(trekToAdd);
        }

        return "redirect:/treks/";
    }

    @GetMapping("/continent/{continentName}")
    public String displayContinentOfTrek(@PathVariable String continentName, Model model){
        Optional<Continent> retrievedContinent = continentRepo.findByContinentName(continentName);
        model.addAttribute("continentModel",retrievedContinent.get());
        return "continentView";
    }

    @GetMapping("/region/{regionName}")
    public String displayRegionOfTrek(@PathVariable String regionName, Model model){
        Optional<Region> retrievedRegion = regionRepo.findByRegionName(regionName);
        model.addAttribute("regionModel", retrievedRegion.get());
        return "regionView";
    }

    @GetMapping("/trek-type/{typeName}")
    public String displayTrekTypeName(@PathVariable String typeName, Model model){
        Optional<TrekType> retrievedTypeName = trekTypeRepo.findByTypeName(typeName);
        model.addAttribute("trekTypeModel", retrievedTypeName.get());
        return "trekTypeView";
    }

}
