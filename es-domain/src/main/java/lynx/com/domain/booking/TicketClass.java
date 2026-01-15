package lynx.com.domain.booking;

import java.util.Objects;

/**
 * Domain entity representing a TicketClass.
 * Pure Java - no framework annotations.
 */
public class TicketClass {
    private String id;
    private String eventId;
    private String name;
    private String description;

    public TicketClass() {}

    public TicketClass(String id, String eventId, String name, String description) {
        this.id = id;
        this.eventId = eventId;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketClass that = (TicketClass) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TicketClass{" +
                "id='" + id + '\'' +
                ", eventId='" + eventId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
