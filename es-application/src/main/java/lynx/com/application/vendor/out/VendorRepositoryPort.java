package lynx.com.application.vendor.out;

import lynx.com.domain.vendor.Vendor;

import java.util.List;

public interface VendorRepositoryPort {
    Vendor save(Vendor vendor);
    Vendor findById(String id);
    List<Vendor> findAll(int limit, int page);
    List<Vendor> findByParams(Vendor vendor);
}
