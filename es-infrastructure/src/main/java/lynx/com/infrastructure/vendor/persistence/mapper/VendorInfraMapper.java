package lynx.com.infrastructure.vendor.persistence.mapper;

import lynx.com.application.vendor.dto.VendorDto;
import lynx.com.domain.vendor.Vendor;
import lynx.com.infrastructure.vendor.persistence.entity.VendorJPAEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendorInfraMapper {
    @Mapping(target = "companyAddress.street", source = "companyAddressStreet")
    @Mapping(target = "companyAddress.city", source = "companyAddressCity")
    @Mapping(target = "companyAddress.zipCode", source = "companyAddressZipCode")
    @Mapping(target = "companyAddress.state", source = "companyAddressState")
    @Mapping(target = "companyAddress.country", source = "companyAddressCountry")
    Vendor toDomain(VendorJPAEntity entity);

    @Mapping(target = "address", source = "companyAddress")
    VendorDto toDto(Vendor vendor);

    @Mapping(target = "companyAddressStreet", source = "companyAddress.street")
    @Mapping(target = "companyAddressCity", source = "companyAddress.city")
    @Mapping(target = "companyAddressZipCode", source = "companyAddress.zipCode")
    @Mapping(target = "companyAddressState", source = "companyAddress.state")
    @Mapping(target = "companyAddressCountry", source = "companyAddress.country")
    VendorJPAEntity toJPAEntity(Vendor vendor);

}