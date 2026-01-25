package lynx.com.domain.vendor;

import lynx.com.common.entities.Address;

import java.time.LocalDateTime;
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
    private Boolean removed;
    private String removedBy;
    private LocalDateTime removedDate;

    public Vendor() {
    }

    public Vendor(String id, String name, String description, Address companyAddress, Boolean removed, String removedBy, LocalDateTime removedDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.companyAddress = companyAddress;
        this.removed = removed;
        this.removedBy = removedBy;
        this.removedDate = removedDate;
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

    public Boolean getRemoved() {
        return removed;
    }

    public void setRemoved(Boolean removed) {
        this.removed = removed;
    }

    public String getRemovedBy() {
        return removedBy;
    }

    public void setRemovedBy(String removedBy) {
        this.removedBy = removedBy;
    }

    public LocalDateTime getRemovedDate() {
        return removedDate;
    }

    public void setRemovedDate(LocalDateTime removedDate) {
        this.removedDate = removedDate;
    }
}
