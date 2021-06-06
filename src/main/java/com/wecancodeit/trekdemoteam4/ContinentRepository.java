package com.wecancodeit.trekdemoteam4;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ContinentRepository extends CrudRepository<Continent,Long> {

        Optional<Continent> findByContinentName(String continentName);
}
