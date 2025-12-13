package lynx.com.infrastructure.booking.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lynx.com.infrastructure.event.persistence.entities.EventJPAEntity;

@Getter
@Setter
@Entity
@Table(name = "es_ticket_class")
public class TicketClassJPAEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id", nullable = false)
    private EventJPAEntity event;
}
