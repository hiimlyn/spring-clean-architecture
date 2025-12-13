package lynx.com.application.event.dto;

import lombok.Data;
import lynx.com.common.entities.Address;

import java.time.LocalDate;

@Data
public class CreateEventRequestDto {
    private String name;
    private String vendorId;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Address address;
}
