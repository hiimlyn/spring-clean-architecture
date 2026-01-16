package lynx.com.api.vendor;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lynx.com.api.vendor.dto.VendorRegisterRequest;
import lynx.com.api.vendor.dto.VendorRegisterResponse;
import lynx.com.application.vendor.in.VendorUseCase;

@AllArgsConstructor
@RestController
@RequestMapping("/vendors")
public class VendorController {

    private final VendorUseCase vendorUseCase;

    public ResponseEntity<VendorRegisterResponse> registerVendor(@RequestBody VendorRegisterRequest request) {
        //  vendorUseCase.registerVendor(request);
         return ResponseEntity.status(Response.SC_CREATED).body(null);
    }
}
