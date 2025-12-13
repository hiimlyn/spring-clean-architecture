package lynx.com.infrastructure.booking.persistence.mapper;

import lynx.com.domain.booking.Ticket;
import lynx.com.infrastructure.booking.persistence.entity.TicketJPAEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TicketMapper {

    Ticket toDomain(TicketJPAEntity entity);

    TicketJPAEntity toEntity(Ticket domain);
}
