package lynx.com.api.vendor.dto;

import lombok.Data;
import lynx.com.common.entities.Address;

@Data
public class VendorResponse {
    private String id;
    private String name;
    private String description;
    private Address companyAddress;
}
