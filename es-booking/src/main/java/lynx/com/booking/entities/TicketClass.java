package lynx.com.booking.entities;

import lombok.Data;

@Data
public class TicketClass {
    private String id;
    private String eventId;
    private String name;
    private String description;
}
