package lynx.com.application.vendor.in;

import java.util.List;

public interface VendorFetchUseCase {
    List<VendorQuery> getAllVendors(int limit, int page);
    List<VendorQuery> getVendorsByParams(VendorQuery vendorQuery);
}
