package lynx.com.application.vendor.out;

import lynx.com.domain.vendor.Vendor;

public interface VendorRepositoryPort {
    Vendor save(Vendor vendor);
    Vendor findById(String id);
}
