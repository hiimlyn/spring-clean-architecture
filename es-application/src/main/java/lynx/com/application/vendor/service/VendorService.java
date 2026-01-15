package lynx.com.application.vendor.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lynx.com.application.vendor.VendorApplicationMapper;
import lynx.com.application.vendor.dto.VendorDto;
import lynx.com.application.vendor.dto.VendorRegisterRequest;
import lynx.com.application.vendor.in.VendorUseCase;
import lynx.com.application.vendor.out.VendorRepositoryPort;

@AllArgsConstructor
@Service
public class VendorService implements VendorUseCase {

    private final VendorRepositoryPort vendorRepository;
    private final VendorApplicationMapper vendorApplicationMapper;

    @Override
    public VendorDto registerVendor(VendorRegisterRequest request) {
        var vendor = vendorApplicationMapper.toDomain(request);
        var savedVendor = vendorRepository.save(vendor);
        return vendorApplicationMapper.toDto(savedVendor);
    }
}
