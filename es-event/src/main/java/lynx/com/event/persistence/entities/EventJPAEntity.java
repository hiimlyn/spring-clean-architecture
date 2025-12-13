package lynx.com.event.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "es_events")
public class EventJPAEntity {
    @Id
    private String id;
    private String name;
    private String vendorId;
    private String description;
    private String startDate;
}
