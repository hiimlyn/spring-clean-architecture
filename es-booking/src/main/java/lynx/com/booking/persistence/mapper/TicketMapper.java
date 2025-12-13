package lynx.com.booking.persistence.mapper;

import lynx.com.booking.entities.Ticket;
import lynx.com.booking.persistence.entity.TicketJPAEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TicketMapper {

    Ticket toDomain(TicketJPAEntity entity);

    TicketJPAEntity toEntity(Ticket domain);
}
