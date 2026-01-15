package lynx.com.domain.event;

import lynx.com.common.entities.Address;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Domain entity representing an Event.
 * Pure Java - no framework annotations.
 */
public class Event {
    private String id;
    private String name;
    private String vendorId;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Address address;

    public Event() {}

    public Event(String id, String name, String vendorId, String description,
                 LocalDate startDate, LocalDate endDate, Address address) {
        this.id = id;
        this.name = name;
        this.vendorId = vendorId;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.address = address;
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

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", vendorId='" + vendorId + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", address=" + address +
                '}';
    }
}
