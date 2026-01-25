package lynx.com.application.vendor.service;

import lombok.AllArgsConstructor;
import lynx.com.application.vendor.in.GetVendorsUseCase;
import lynx.com.application.vendor.in.VendorQuery;
import lynx.com.application.vendor.mapper.VendorApplicationMapper;
import lynx.com.application.vendor.out.VendorRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GetVendorsService implements GetVendorsUseCase {

    private final VendorRepositoryPort vendorRepository;
    private final VendorApplicationMapper vendorMapper;

    @Override
    public List<VendorQuery> getAllVendors() {
        var vendors = vendorRepository.findAll();
        return vendorMapper.toQueryList(vendors);
    }

    @Override
    public List<VendorQuery> getVendorsByParams(VendorQuery vendorQuery) {
        var vendorDomain = vendorMapper.toDomain(vendorQuery);;
        var vendors = vendorRepository.findByParams(vendorDomain);
        return vendorMapper.toQueryList(vendors);
    }
}
