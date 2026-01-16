package lynx.com.domain.vendor;

import lynx.com.common.entities.Address;
import java.util.Objects;

/**
 * Domain entity representing a Vendor.
 * Pure Java - no framework annotations.
 */
public class Vendor {
    private String id;
    private String name;
    private String description;
    private Address companyAddress;

    public Vendor() {}

    public Vendor(String id, String name, String description, Address companyAddress) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.companyAddress = companyAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vendor vendor = (Vendor) o;
        return Objects.equals(id, vendor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", companyAddress=" + companyAddress +
                '}';
    }
}
