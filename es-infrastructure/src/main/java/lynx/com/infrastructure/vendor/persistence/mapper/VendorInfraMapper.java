package lynx.com.infrastructure.vendor.persistence.mapper;

import lynx.com.application.vendor.dto.VendorDto;
import lynx.com.domain.vendor.Vendor;
import lynx.com.infrastructure.vendor.persistence.entity.VendorJPAEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendorInfraMapper {
    VendorDto toDto(VendorJPAEntity entity);
    VendorDto toDto(Vendor vendor);
}