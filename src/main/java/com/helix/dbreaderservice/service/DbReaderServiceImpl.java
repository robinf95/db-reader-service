package com.helix.dbreaderservice.service;

import com.helix.dbreaderservice.model.Partner;
import com.helix.dbreaderservice.repository.PartnerRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DbReaderServiceImpl implements DbReaderService {

    PartnerRepository partnerRepository;

    @Autowired
    public DbReaderServiceImpl(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    @Override
    public List<Partner> getPartners() {
        log.info("Fetching partners from database");
        return partnerRepository.findAll();
    }
}
