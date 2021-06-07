package com.wecancodeit.trekdemoteam4;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegionRepository extends CrudRepository<Region,Long> {

        Optional<Region> findByRegionName(String regionName);
}
