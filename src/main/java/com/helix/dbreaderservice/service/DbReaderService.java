package com.helix.dbreaderservice.service;

import com.helix.dbreaderservice.model.Partner;
import java.util.List;

public interface DbReaderService {
    List<Partner> getPartners();
}
