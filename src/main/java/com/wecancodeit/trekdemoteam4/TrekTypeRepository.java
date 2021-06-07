package com.wecancodeit.trekdemoteam4;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekTypeRepository extends CrudRepository<TrekType,Long> {


    Optional<TrekType> findByTypeName(String typeName);
}
