package com.helix.dbreaderservice.controller;

import com.helix.dbreaderservice.mapper.PartnerMapper;
import com.helix.dbreaderservice.model.PartnerDTO;
import com.helix.dbreaderservice.service.DbReaderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PartnerController {

    DbReaderService dbReaderService;
    PartnerMapper partnerMapper;

    @Autowired
    public PartnerController(DbReaderService dbReaderService, PartnerMapper partnerMapper) {
        this.dbReaderService = dbReaderService;
        this.partnerMapper = partnerMapper;
    }
    @GetMapping("/partners")
    public List<PartnerDTO> getPartners() {
        return partnerMapper.mapListToPartnerDtoList(dbReaderService.getPartners());
    }

}
