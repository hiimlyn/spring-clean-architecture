package lynx.com.infrastructure.event.persistence.mapper;

import javax.annotation.processing.Generated;
import lynx.com.application.event.dto.EventDto;
import lynx.com.domain.event.Event;
import lynx.com.infrastructure.event.persistence.entities.EventJPAEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-15T22:21:29+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260101-2150, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class EventMapperImpl implements EventMapper {

    @Override
    public Event toDomain(EventJPAEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Event event = new Event();

        event.setId( entity.getId() );
        event.setName( entity.getName() );
        event.setVendorId( entity.getVendorId() );
        event.setDescription( entity.getDescription() );
        event.setStartDate( entity.getStartDate() );
        event.setEndDate( entity.getEndDate() );

        return event;
    }

    @Override
    public Event toDomain(EventDto dto) {
        if ( dto == null ) {
            return null;
        }

        Event event = new Event();

        return event;
    }

    @Override
    public EventJPAEntity toEntity(Event domain) {
        if ( domain == null ) {
            return null;
        }

        EventJPAEntity eventJPAEntity = new EventJPAEntity();

        eventJPAEntity.setDescription( domain.getDescription() );
        eventJPAEntity.setEndDate( domain.getEndDate() );
        eventJPAEntity.setId( domain.getId() );
        eventJPAEntity.setName( domain.getName() );
        eventJPAEntity.setStartDate( domain.getStartDate() );
        eventJPAEntity.setVendorId( domain.getVendorId() );

        return eventJPAEntity;
    }

    @Override
    public EventDto toDto(Event domain) {
        if ( domain == null ) {
            return null;
        }

        EventDto eventDto = new EventDto();

        return eventDto;
    }
}
