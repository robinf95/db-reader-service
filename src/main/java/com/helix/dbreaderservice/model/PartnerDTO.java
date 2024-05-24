package com.helix.dbreaderservice.model;

import java.util.List;
import lombok.Data;

@Data
public class PartnerDTO {
    String partnerId;
    String partnerName;
    List<ContractDTO> contracts;
}
