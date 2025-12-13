package lynx.com.application.vendor.dto;

import lombok.Data;
import lynx.com.common.entities.Address;

@Data
public class RegisterVendorRequest {
    private String name;
    private String description;
    private Address companyAddress;
}
