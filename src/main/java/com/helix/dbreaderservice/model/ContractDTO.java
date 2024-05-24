package com.helix.dbreaderservice.model;

import lombok.Data;

@Data
public class ContractDTO {
    String contractId;
    ContractType contractType;
    ContractStatus status;
}
