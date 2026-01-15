package lynx.com.infrastructure.vendor.persistence.mapper;

import javax.annotation.processing.Generated;
import lynx.com.application.vendor.dto.VendorDto;
import lynx.com.common.entities.Address;
import lynx.com.domain.vendor.Vendor;
import lynx.com.infrastructure.vendor.persistence.entity.VendorJPAEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-15T22:12:43+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class VendorInfraMapperImpl implements VendorInfraMapper {

    @Override
    public Vendor toDomain(VendorJPAEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Vendor vendor = new Vendor();

        vendor.setCompanyAddress( vendorJPAEntityToAddress( entity ) );
        vendor.setId( entity.getId() );
        vendor.setName( entity.getName() );
        vendor.setDescription( entity.getDescription() );

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

    @Override
    public VendorJPAEntity toJPAEntity(Vendor vendor) {
        if ( vendor == null ) {
            return null;
        }

        VendorJPAEntity vendorJPAEntity = new VendorJPAEntity();

        vendorJPAEntity.setCompanyAddressStreet( vendorCompanyAddressStreet( vendor ) );
        vendorJPAEntity.setCompanyAddressCity( vendorCompanyAddressCity( vendor ) );
        vendorJPAEntity.setCompanyAddressZipCode( vendorCompanyAddressZipCode( vendor ) );
        vendorJPAEntity.setCompanyAddressState( vendorCompanyAddressState( vendor ) );
        vendorJPAEntity.setCompanyAddressCountry( vendorCompanyAddressCountry( vendor ) );
        vendorJPAEntity.setId( vendor.getId() );
        vendorJPAEntity.setName( vendor.getName() );
        vendorJPAEntity.setDescription( vendor.getDescription() );

        return vendorJPAEntity;
    }

    protected Address vendorJPAEntityToAddress(VendorJPAEntity vendorJPAEntity) {
        if ( vendorJPAEntity == null ) {
            return null;
        }

        Address address = new Address();

        address.setStreet( vendorJPAEntity.getCompanyAddressStreet() );
        address.setCity( vendorJPAEntity.getCompanyAddressCity() );
        address.setZipCode( vendorJPAEntity.getCompanyAddressZipCode() );
        address.setState( vendorJPAEntity.getCompanyAddressState() );
        address.setCountry( vendorJPAEntity.getCompanyAddressCountry() );

        return address;
    }

    private String vendorCompanyAddressStreet(Vendor vendor) {
        if ( vendor == null ) {
            return null;
        }
        Address companyAddress = vendor.getCompanyAddress();
        if ( companyAddress == null ) {
            return null;
        }
        String street = companyAddress.getStreet();
        if ( street == null ) {
            return null;
        }
        return street;
    }

    private String vendorCompanyAddressCity(Vendor vendor) {
        if ( vendor == null ) {
            return null;
        }
        Address companyAddress = vendor.getCompanyAddress();
        if ( companyAddress == null ) {
            return null;
        }
        String city = companyAddress.getCity();
        if ( city == null ) {
            return null;
        }
        return city;
    }

    private String vendorCompanyAddressZipCode(Vendor vendor) {
        if ( vendor == null ) {
            return null;
        }
        Address companyAddress = vendor.getCompanyAddress();
        if ( companyAddress == null ) {
            return null;
        }
        String zipCode = companyAddress.getZipCode();
        if ( zipCode == null ) {
            return null;
        }
        return zipCode;
    }

    private String vendorCompanyAddressState(Vendor vendor) {
        if ( vendor == null ) {
            return null;
        }
        Address companyAddress = vendor.getCompanyAddress();
        if ( companyAddress == null ) {
            return null;
        }
        String state = companyAddress.getState();
        if ( state == null ) {
            return null;
        }
        return state;
    }

    private String vendorCompanyAddressCountry(Vendor vendor) {
        if ( vendor == null ) {
            return null;
        }
        Address companyAddress = vendor.getCompanyAddress();
        if ( companyAddress == null ) {
            return null;
        }
        String country = companyAddress.getCountry();
        if ( country == null ) {
            return null;
        }
        return country;
    }
}
