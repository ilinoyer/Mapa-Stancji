package com.classifiedmapbackend.control.repositories;

import com.classifiedmapbackend.entity.jpa.AddressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressEntity, String> {

}