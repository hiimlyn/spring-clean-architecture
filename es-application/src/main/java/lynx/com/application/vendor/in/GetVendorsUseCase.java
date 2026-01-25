package lynx.com.application.vendor.in;

import java.util.List;

public interface GetVendorsUseCase {
    List<VendorQuery> getAllVendors();
    List<VendorQuery> getVendorsByParams(VendorQuery vendorQuery);
}
