package lynx.com.application.vendor.mapper;

import lynx.com.application.vendor.in.VendorQuery;
import lynx.com.application.vendor.in.VendorRegisterCommand;
import lynx.com.domain.vendor.Vendor;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VendorApplicationMapper {
    Vendor toDomain(VendorRegisterCommand command);
    Vendor toDomain(VendorQuery query);
    VendorRegisterCommand toCommand(Vendor vendor);
    VendorQuery toQuery(Vendor vendor);
    List<VendorQuery> toQueryList(List<Vendor> vendors);
}
