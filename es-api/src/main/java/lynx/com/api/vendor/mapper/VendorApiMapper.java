package lynx.com.api.vendor.mapper;

import lynx.com.api.vendor.dto.VendorRegisterRequest;
import lynx.com.api.vendor.dto.VendorRegisterResponse;
import lynx.com.application.vendor.in.VendorRegisterCommand;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendorApiMapper {
    VendorRegisterCommand toRegisterCommand(VendorRegisterRequest request);
    VendorRegisterResponse toRegisterResponse(VendorRegisterCommand command);
}
