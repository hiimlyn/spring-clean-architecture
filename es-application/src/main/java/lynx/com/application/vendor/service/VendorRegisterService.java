package lynx.com.application.vendor.service;

import lombok.AllArgsConstructor;
import lynx.com.application.vendor.in.VendorRegisterCommand;
import lynx.com.application.vendor.in.VendorRegisterUseCase;
import lynx.com.application.vendor.mapper.VendorApplicationMapper;
import lynx.com.application.vendor.out.VendorRepositoryPort;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class VendorRegisterService implements VendorRegisterUseCase {

    private final VendorRepositoryPort vendorRepository;
    private final VendorApplicationMapper vendorMapper;

    @Override
    public VendorRegisterCommand register(VendorRegisterCommand vendorRegisterCommand) {
        var vendor = vendorMapper.toDomain(vendorRegisterCommand);
        var savedVendor = vendorRepository.save(vendor);
        return  vendorMapper.toCommand(savedVendor);
    }

}
