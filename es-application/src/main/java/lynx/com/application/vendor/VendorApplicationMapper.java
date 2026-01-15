package lynx.com.application.vendor;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import lynx.com.application.vendor.dto.VendorDto;
import lynx.com.application.vendor.dto.VendorRegisterRequest;
import lynx.com.domain.vendor.Vendor;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendorApplicationMapper {
    @Mapping(target = "id", ignore = true)
    Vendor toDomain(VendorRegisterRequest request);

    @Mapping(target = "address", source = "companyAddress")
    VendorDto toDto(Vendor vendor);
}
