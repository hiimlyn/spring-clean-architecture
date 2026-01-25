package lynx.com.application.vendor.service;

import lombok.AllArgsConstructor;
import lynx.com.application.vendor.in.VendorFetchUseCase;
import lynx.com.application.vendor.in.VendorQuery;
import lynx.com.application.vendor.mapper.VendorApplicationMapper;
import lynx.com.application.vendor.out.VendorRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public
class VendorFetchService implements VendorFetchUseCase {

    private final VendorRepositoryPort vendorRepository;
    private final VendorApplicationMapper vendorMapper;

    @Override
    public List<VendorQuery> getAllVendors(int limit, int page) {
        var vendors = vendorRepository.findAll(limit, page);
        return vendorMapper.toQueryList(vendors);
    }

    @Override
    public List<VendorQuery> getVendorsByParams(VendorQuery vendorQuery) {
        var vendorDomain = vendorMapper.toDomain(vendorQuery);;
        var vendors = vendorRepository.findByParams(vendorDomain);
        return vendorMapper.toQueryList(vendors);
    }
}
