package lynx.com.application.vendor.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lynx.com.application.vendor.in.VendorUseCase;
import lynx.com.application.vendor.out.VendorRepositoryPort;
import lynx.com.domain.vendor.Vendor;

@AllArgsConstructor
@Service
public class VendorService implements VendorUseCase {

    private final VendorRepositoryPort vendorRepository;

    @Override
    public Vendor registerVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }
}
