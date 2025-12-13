package lynx.com.application.vendor.dto;

import lombok.Data;
import lynx.com.common.entities.Address;

@Data
public class VendorDto {
    private String id;
    private String name;
    private Address address;
}
