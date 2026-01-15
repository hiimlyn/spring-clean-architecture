package lynx.com.infrastructure.vendor.persistence.repository;

import lombok.AllArgsConstructor;
import lynx.com.application.vendor.out.VendorRepositoryPort;
import lynx.com.domain.vendor.Vendor;
import lynx.com.infrastructure.vendor.persistence.mapper.VendorInfraMapper;

import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class VendorRepositoryAdapter implements VendorRepositoryPort {
    private final VendorJPARepository vendorJPARepository;
    private final VendorInfraMapper vendorInfraMapper;

    @Override
    public Vendor save(Vendor vendor) {
        var vendorEntity = vendorInfraMapper.toJPAEntity(vendor);
        var savedEntity = vendorJPARepository.save(vendorEntity);
        return vendorInfraMapper.toDomain(savedEntity);
    }

    @Override
    public Vendor findById(String id) {
        return null;
    }
}
