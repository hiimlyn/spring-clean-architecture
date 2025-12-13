package lynx.com.booking.persistence.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "es_tickets")
@Getter
@Setter
public class TicketJPAEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "event_id", nullable = false)
    private String eventId;

}
