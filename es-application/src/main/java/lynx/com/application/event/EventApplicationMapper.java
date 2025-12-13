package lynx.com.application.event;

import lynx.com.application.event.dto.CreateEventRequestDto;
import lynx.com.application.event.dto.EventDto;
import lynx.com.domain.event.Event;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EventApplicationMapper {
    Event toDomain(CreateEventRequestDto entity);

    Event toDomain(EventDto dto);

    EventDto toDto(Event domain);
}
