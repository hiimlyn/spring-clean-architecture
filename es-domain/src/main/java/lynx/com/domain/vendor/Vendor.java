package lynx.com.domain.vendor;

import lombok.Data;
import lynx.com.common.entities.Address;

@Data
public class Vendor {
    private String id;
    private String name;
    private String description;
    private Address companyAddress;
}
