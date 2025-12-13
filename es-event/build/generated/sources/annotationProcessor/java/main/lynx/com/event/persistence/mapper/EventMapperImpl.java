package lynx.com.event.persistence.mapper;

import javax.annotation.processing.Generated;
import lynx.com.common.dto.event.EventDto;
import lynx.com.event.entities.Event;
import lynx.com.event.persistence.entities.EventJPAEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-29T20:32:18+0700",
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
