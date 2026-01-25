package lynx.com.infrastructure.vendor.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

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

    @Column(name = "is_removed", columnDefinition = " boolean default false" )
    private Boolean removed;

    @Column(name = "removed_by", length = 30)
    private String removedBy;

    @Column(name = "removed_date")
    private LocalDateTime removedDate;
}
