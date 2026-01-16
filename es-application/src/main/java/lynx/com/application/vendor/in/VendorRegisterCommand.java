package lynx.com.application.vendor.in;

import lombok.Data;
import lynx.com.common.entities.Address;

@Data
public class VendorRegisterCommand {
    private String id;
    private String name;
    private String description;
    private Address companyAddress;
}
