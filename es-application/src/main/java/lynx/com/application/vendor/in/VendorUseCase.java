package lynx.com.application.vendor.in;

import lynx.com.application.vendor.dto.RegisterVendorRequest;
import lynx.com.application.vendor.dto.VendorDto;

public interface VendorUseCase {
     VendorDto registerVendor(RegisterVendorRequest request);
}
