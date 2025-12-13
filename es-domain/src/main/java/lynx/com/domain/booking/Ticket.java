package lynx.com.domain.booking;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Ticket {
    private String id;
    private String eventId;
    private String eventTicketClassId;
    private LocalDate startDate;
}
