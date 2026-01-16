package lynx.com.domain.booking;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Domain entity representing a Ticket.
 * Pure Java - no framework annotations.
 */
public class Ticket {
    private String id;
    private String eventId;
    private String eventTicketClassId;
    private LocalDate startDate;

    public Ticket() {}

    public Ticket(String id, String eventId, String eventTicketClassId, LocalDate startDate) {
        this.id = id;
        this.eventId = eventId;
        this.eventTicketClassId = eventTicketClassId;
        this.startDate = startDate;
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

    public String getEventTicketClassId() {
        return eventTicketClassId;
    }

    public void setEventTicketClassId(String eventTicketClassId) {
        this.eventTicketClassId = eventTicketClassId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(id, ticket.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", eventId='" + eventId + '\'' +
                ", eventTicketClassId='" + eventTicketClassId + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
