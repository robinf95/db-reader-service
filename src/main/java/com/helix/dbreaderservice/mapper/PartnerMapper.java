package com.helix.dbreaderservice.mapper;

import com.helix.dbreaderservice.model.Partner;
import com.helix.dbreaderservice.model.PartnerDTO;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface PartnerMapper {
        PartnerDTO mapToPartnerDto(Partner inboundPartner);

        List<PartnerDTO> mapListToPartnerDtoList(List<Partner> inboundPartner);
}
