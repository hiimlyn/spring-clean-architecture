package lynx.com.infrastructure.vendor.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "es_vendor")
@Getter
@Setter
public class VendorJPAEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String description;

    @Column(name = "company_address_street")
    private String companyAddressStreet;

    @Column(name = "company_address_city")
    private String companyAddressCity;

    @Column(name = "company_address_state")
    private String companyAddressState;

    @Column(name = "company_address_zip_code")
    private String companyAddressZipCode;

    @Column(name = "company_address_country")
    private String companyAddressCountry;
}
