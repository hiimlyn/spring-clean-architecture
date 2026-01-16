package lynx.com.infrastructure.booking.persistence.mapper;

import lynx.com.domain.booking.Ticket;
import lynx.com.infrastructure.booking.persistence.entity.TicketJPAEntity;
import lynx.com.infrastructure.event.persistence.entities.EventJPAEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TicketMapper {

    @Mapping(target = "eventId", source = "event.id")
    @Mapping(target = "eventTicketClassId", ignore = true)
    @Mapping(target = "startDate", ignore = true)
    Ticket toDomain(TicketJPAEntity entity);

    @Mapping(target = "event", expression = "java(mapEventId(domain.getEventId()))")
    TicketJPAEntity toEntity(Ticket domain);

    default EventJPAEntity mapEventId(String eventId) {
        if (eventId == null) {
            return null;
        }
        EventJPAEntity event = new EventJPAEntity();
        event.setId(eventId);
        return event;
    }
}
