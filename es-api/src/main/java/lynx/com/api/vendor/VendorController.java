package lynx.com.api.vendor;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lynx.com.application.vendor.dto.VendorRegisterRequest;
import lynx.com.application.vendor.in.VendorUseCase;

@AllArgsConstructor
@RestController
@RequestMapping("/vendors")
public class VendorController {

    private final VendorUseCase vendorUseCase;

    public ResponseEntity<String> registerVendor(@RequestBody VendorRegisterRequest request) {
         vendorUseCase.registerVendor(request);
         return ResponseEntity.status(Response.SC_CREATED).body("Vendor registered successfully");
    }
}
