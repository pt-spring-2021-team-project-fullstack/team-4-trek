package com.wecancodeit.trekdemoteam4;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekRepository extends CrudRepository<Trek,Long> {

        Optional<Trek> findByTrekName(String trekName);
}
