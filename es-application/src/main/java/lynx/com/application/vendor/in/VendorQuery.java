package lynx.com.application.vendor.in;

import lombok.Builder;
import lombok.Data;
import lynx.com.common.entities.Address;

@Data
@Builder
public class VendorQuery {
    private String id;
    private String name;
    private String description;
    private Address companyAddress;
}
