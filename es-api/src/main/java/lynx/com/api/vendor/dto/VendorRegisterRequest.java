package lynx.com.api.vendor.dto;

import lombok.Data;
import lynx.com.common.entities.Address;

@Data
public class VendorRegisterRequest {
    private String name;
    private String description;
    private Address companyAddress;
}
