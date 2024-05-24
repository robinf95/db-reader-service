package com.helix.dbreaderservice.controller;

import com.helix.dbreaderservice.model.Partner;
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

    @Autowired
    public PartnerController(DbReaderService dbReaderService) {
        this.dbReaderService = dbReaderService;
    }
    @GetMapping("/partners")
    public List<Partner> getPartners() {
        return dbReaderService.getPartners();
    }

}
