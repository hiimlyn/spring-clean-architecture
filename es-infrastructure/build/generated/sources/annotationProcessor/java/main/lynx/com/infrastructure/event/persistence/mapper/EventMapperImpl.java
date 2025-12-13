package lynx.com.infrastructure.event.persistence.mapper;

import javax.annotation.processing.Generated;
import lynx.com.application.event.dto.EventDto;
import lynx.com.domain.event.Event;
import lynx.com.infrastructure.event.persistence.entities.EventJPAEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-30T00:59:46+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.2 (Oracle Corporation)"
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

        eventJPAEntity.setId( domain.getId() );
        eventJPAEntity.setName( domain.getName() );
        eventJPAEntity.setVendorId( domain.getVendorId() );
        eventJPAEntity.setDescription( domain.getDescription() );
        eventJPAEntity.setStartDate( domain.getStartDate() );
        eventJPAEntity.setEndDate( domain.getEndDate() );

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
