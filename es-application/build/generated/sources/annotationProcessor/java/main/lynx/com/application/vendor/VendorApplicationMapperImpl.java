package lynx.com.application.vendor;

import javax.annotation.processing.Generated;
import lynx.com.application.vendor.dto.VendorDto;
import lynx.com.application.vendor.dto.VendorRegisterRequest;
import lynx.com.domain.vendor.Vendor;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-15T22:32:34+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class VendorApplicationMapperImpl implements VendorApplicationMapper {

    @Override
    public Vendor toDomain(VendorRegisterRequest request) {
        if ( request == null ) {
            return null;
        }

        Vendor vendor = new Vendor();

        vendor.setName( request.getName() );
        vendor.setDescription( request.getDescription() );
        vendor.setCompanyAddress( request.getCompanyAddress() );

        return vendor;
    }

    @Override
    public VendorDto toDto(Vendor vendor) {
        if ( vendor == null ) {
            return null;
        }

        VendorDto vendorDto = new VendorDto();

        vendorDto.setAddress( vendor.getCompanyAddress() );
        vendorDto.setId( vendor.getId() );
        vendorDto.setName( vendor.getName() );

        return vendorDto;
    }
}
