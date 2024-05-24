package com.helix.dbreaderservice.repository;

import com.helix.dbreaderservice.model.Partner;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartnerRepository extends MongoRepository<Partner, String> {

}
