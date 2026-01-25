package lynx.com.application.vendor.service;

import lombok.AllArgsConstructor;
import lynx.com.application.vendor.in.VendorRemoveUseCase;
import lynx.com.application.vendor.out.VendorRepositoryPort;
import lynx.com.common.entities.exception.ESException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class VendorRemoveService implements VendorRemoveUseCase {

    private final VendorRepositoryPort vendorRepositoryPort;

    @Transactional
    @Override
    public boolean softRemove(String id) {
        var vendor = vendorRepositoryPort.findById(id);
        if (vendor == null) {
            throw new ESException("Requested Vendor not found");
        }
        vendor.setRemoved(true);
        vendor.setRemovedBy("system");
        vendor.setRemovedDate(LocalDateTime.now());

        return vendorRepositoryPort.save(vendor) != null;
    }
}
