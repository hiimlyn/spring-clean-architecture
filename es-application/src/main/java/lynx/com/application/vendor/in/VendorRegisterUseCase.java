package lynx.com.application.vendor.in;

import lynx.com.domain.vendor.Vendor;

public interface VendorRegisterUseCase {
    VendorRegisterCommand register(VendorRegisterCommand vendor);
}
