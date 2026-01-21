package lynx.com.api.vendor;

import lynx.com.api.vendor.mapper.VendorApiMapper;
import lynx.com.common.entities.ESBaseResponse;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import lynx.com.api.vendor.dto.VendorRegisterRequest;
import lynx.com.api.vendor.dto.VendorRegisterResponse;
import lynx.com.application.vendor.in.VendorRegisterUseCase;

@AllArgsConstructor
@RestController
@RequestMapping("/vendors")
public class VendorController {

    private final VendorRegisterUseCase vendorRegisterUseCase;
    private final VendorApiMapper vendorApiMapper;

    @PostMapping("/register")
    public ResponseEntity<ESBaseResponse<VendorRegisterResponse>> registerVendor(@RequestBody VendorRegisterRequest request) {
        var vendorRegisterCommand = vendorApiMapper.toRegisterCommand(request);
        var vendorRegistered = vendorRegisterUseCase.register(vendorRegisterCommand);
        ESBaseResponse<VendorRegisterResponse> response = ESBaseResponse.<VendorRegisterResponse>builder().data(vendorApiMapper.toRegisterResponse(vendorRegistered)).build();
        return ResponseEntity.status(Response.SC_CREATED).body(response);
    }
}
