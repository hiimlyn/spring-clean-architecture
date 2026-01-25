package lynx.com.api.vendor;

import lynx.com.api.vendor.dto.VendorResponse;
import lynx.com.api.vendor.mapper.VendorApiMapper;
import lynx.com.application.vendor.in.VendorQuery;
import lynx.com.common.entities.Address;
import lynx.com.common.entities.ESBaseResponse;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import lynx.com.api.vendor.dto.VendorRegisterRequest;
import lynx.com.api.vendor.dto.VendorRegisterResponse;
import lynx.com.application.vendor.in.GetVendorsUseCase;
import lynx.com.application.vendor.in.VendorRegisterUseCase;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/vendors")
public class VendorController {

    private final VendorRegisterUseCase vendorRegisterUseCase;
    private final GetVendorsUseCase getVendorsUseCase;
    private final VendorApiMapper vendorApiMapper;

    @PostMapping("/register")
    public ResponseEntity<ESBaseResponse<VendorRegisterResponse>> registerVendor(@RequestBody VendorRegisterRequest request) {

        var vendorRegisterCommand = vendorApiMapper.toRegisterCommand(request);
        var vendorRegistered = vendorRegisterUseCase.register(vendorRegisterCommand);
        ESBaseResponse<VendorRegisterResponse> response = ESBaseResponse.<VendorRegisterResponse>builder()
                .data(vendorApiMapper.toRegisterResponse(vendorRegistered))
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<ESBaseResponse<List<VendorResponse>>> getVendors() {
        var vendors = getVendorsUseCase.getAllVendors();
        ESBaseResponse<List<VendorResponse>> response = ESBaseResponse.<List<VendorResponse>>builder()
                .data(vendorApiMapper.toVendorResponseList(vendors))
                .build();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/search")
    public ResponseEntity<ESBaseResponse<List<VendorResponse>>> getVendorsByQueryParams(@RequestParam(required = false) String name,
                                                                                        @RequestParam(required = false) String addressStreet,
                                                                                        @RequestParam(required = false) String addressCity,
                                                                                        @RequestParam(required = false) String addressState,
                                                                                        @RequestParam(required = false) String addressZipCode,
                                                                                        @RequestParam(required = false) String addressCountry) {
        var vendorQuery = VendorQuery.builder()
                .name(name)
                .companyAddress(
                        Address.builder()
                                .street(addressStreet)
                                .city(addressCity)
                                .state(addressState)
                                .zipCode(addressZipCode)
                                .country(addressCountry)
                                .build()
                )
                .build();
        var vendors = getVendorsUseCase.getVendorsByParams(vendorQuery);
        ESBaseResponse<List<VendorResponse>> response = ESBaseResponse.<List<VendorResponse>>builder()
                .data(vendorApiMapper.toVendorResponseList(vendors))
                .build();
        return ResponseEntity.ok(response);
    }
}
