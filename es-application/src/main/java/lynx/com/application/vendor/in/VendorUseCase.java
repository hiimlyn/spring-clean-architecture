package lynx.com.application.vendor.in;

import lynx.com.application.vendor.dto.VendorDto;
import lynx.com.application.vendor.dto.VendorRegisterRequest;

public interface VendorUseCase {
     VendorDto registerVendor(VendorRegisterRequest request);
}
