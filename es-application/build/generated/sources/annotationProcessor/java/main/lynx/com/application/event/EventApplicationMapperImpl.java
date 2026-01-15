package lynx.com.application.event;

import javax.annotation.processing.Generated;
import lynx.com.application.event.dto.CreateEventRequestDto;
import lynx.com.application.event.dto.EventDto;
import lynx.com.domain.event.Event;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-15T22:12:41+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class EventApplicationMapperImpl implements EventApplicationMapper {

    @Override
    public Event toDomain(CreateEventRequestDto entity) {
        if ( entity == null ) {
            return null;
        }

        Event event = new Event();

        event.setName( entity.getName() );
        event.setVendorId( entity.getVendorId() );
        event.setDescription( entity.getDescription() );
        event.setStartDate( entity.getStartDate() );
        event.setEndDate( entity.getEndDate() );
        event.setAddress( entity.getAddress() );

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
    public EventDto toDto(Event domain) {
        if ( domain == null ) {
            return null;
        }

        EventDto eventDto = new EventDto();

        return eventDto;
    }
}
