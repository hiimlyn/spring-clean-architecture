package lynx.com.infrastructure.booking.persistence.mapper;

import javax.annotation.processing.Generated;
import lynx.com.domain.booking.Ticket;
import lynx.com.infrastructure.booking.persistence.entity.TicketJPAEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-30T00:59:46+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class TicketMapperImpl implements TicketMapper {

    @Override
    public Ticket toDomain(TicketJPAEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Ticket ticket = new Ticket();

        ticket.setId( entity.getId() );

        return ticket;
    }

    @Override
    public TicketJPAEntity toEntity(Ticket domain) {
        if ( domain == null ) {
            return null;
        }

        TicketJPAEntity ticketJPAEntity = new TicketJPAEntity();

        ticketJPAEntity.setId( domain.getId() );

        return ticketJPAEntity;
    }
}
