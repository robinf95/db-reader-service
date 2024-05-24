package com.helix.dbreaderservice.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Document("partners")
public class Partner {
    @Id
    private String partnerId;
    private String partnerName;
    @Field("contracts")
    private List<Contract> contracts;
}
