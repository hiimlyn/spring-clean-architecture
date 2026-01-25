package lynx.com.infrastructure.vendor.persistence.repository;

import lombok.AllArgsConstructor;
import lynx.com.application.vendor.out.VendorRepositoryPort;
import lynx.com.domain.vendor.Vendor;
import lynx.com.infrastructure.vendor.persistence.entity.VendorJPAEntity;
import lynx.com.infrastructure.vendor.persistence.mapper.VendorInfraMapper;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Vendor> findAll(int limit, int page) {
        var pageable  = PageRequest.of(page, limit);
        return vendorJPARepository.findAllByRemovedIsNullOrRemovedIsFalse(pageable).stream()
                .map(vendorInfraMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public List<Vendor> findByParams(Vendor vendor) {
        Specification<VendorJPAEntity> spec = Specification.unrestricted();

        if (vendor.getName() != null) {
            spec = spec.and((root, query, cb) ->
                    cb.like(root.get("name"), "%" + vendor.getName() + "%"));
        }

        if (vendor.getCompanyAddress() != null && vendor.getCompanyAddress().getStreet() != null) {
            spec = spec.and((root, query, cb) ->
                    cb.equal(root.get("companyAddressStreet"), vendor.getCompanyAddress().getStreet()));
        }

        return vendorJPARepository.findAll(spec).stream()
                .map(vendorInfraMapper::toDomain)
                .collect(Collectors.toList());
    }

}
