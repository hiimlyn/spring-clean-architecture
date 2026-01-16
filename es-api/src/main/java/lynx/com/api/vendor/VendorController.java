package lynx.com.api.vendor;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lynx.com.api.vendor.dto.VendorRegisterRequest;
import lynx.com.api.vendor.dto.VendorRegisterResponse;
import lynx.com.application.vendor.in.VendorRegisterUseCase;

@AllArgsConstructor
@RestController
@RequestMapping("/vendors")
public class VendorController {

    private final VendorRegisterUseCase vendorRegisterUseCase;

    public ResponseEntity<VendorRegisterResponse> registerVendor(@RequestBody VendorRegisterRequest request) {
        //  vendorUseCase.registerVendor(request);
        var a = vendorRegisterUseCase.register(null);
         return ResponseEntity.status(Response.SC_CREATED).body(null);
    }
}
