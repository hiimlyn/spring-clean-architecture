package lynx.com.application.vendor.mapper;

import lynx.com.application.vendor.in.VendorRegisterCommand;
import lynx.com.domain.vendor.Vendor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VendorApplicationMapper {
    Vendor toDomain(VendorRegisterCommand command);
    VendorRegisterCommand toCommand(Vendor vendor);
}
