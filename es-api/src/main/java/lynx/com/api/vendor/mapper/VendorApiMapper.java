package lynx.com.api.vendor.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendorApiMapper {
    Vendor toDomain(lynx.com.api.vendor.dto.VendorRegisterRequest request);
}
