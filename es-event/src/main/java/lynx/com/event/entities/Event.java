package lynx.com.event.entities;

import lombok.Data;
import lynx.com.common.entities.Address;

import java.time.LocalDate;

@Data
public class Event {
    private String id;
    private String name;
    private String vendorId;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Address address;
}
