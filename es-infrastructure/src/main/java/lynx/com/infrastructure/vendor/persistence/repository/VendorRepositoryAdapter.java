package lynx.com.infrastructure.vendor.persistence.repository;

import lombok.AllArgsConstructor;
import lynx.com.application.vendor.out.VendorRepositoryPort;
import lynx.com.domain.vendor.Vendor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class VendorRepositoryAdapter implements VendorRepositoryPort {
    private final VendorJPARepository vendorJPARepository;

    @Override
    public Vendor save(Vendor vendor) {
        return vendorJPARepository.save(vendor);
    }

    @Override
    public Vendor findById(String id) {
        return null;
    }
}
