package lynx.com.api.vendor.mapper;

import lynx.com.api.vendor.dto.VendorRegisterRequest;
import lynx.com.api.vendor.dto.VendorRegisterResponse;
import lynx.com.api.vendor.dto.VendorResponse;
import lynx.com.application.vendor.in.VendorQuery;
import lynx.com.application.vendor.in.VendorRegisterCommand;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendorApiMapper {
    VendorRegisterCommand toRegisterCommand(VendorRegisterRequest request);
    VendorRegisterResponse toRegisterResponse(VendorRegisterCommand command);
    VendorResponse toVendorResponse(VendorQuery query);
    List<VendorResponse> toVendorResponseList(List<VendorQuery> queries);
}
