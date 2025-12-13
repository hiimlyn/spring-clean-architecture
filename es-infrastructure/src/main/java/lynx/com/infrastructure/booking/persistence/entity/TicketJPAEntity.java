package lynx.com.infrastructure.booking.persistence.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lynx.com.infrastructure.event.persistence.entities.EventJPAEntity;

@Entity
@Table(name = "es_tickets")
@Getter
@Setter
public class TicketJPAEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id", nullable = false)
    private EventJPAEntity event;

}
