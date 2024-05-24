package com.helix.dbreaderservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("contracts")
public class Contract {
    @Id
    private String contractId;
    private ContractType contractType;
    private ContractStatus status;
}
