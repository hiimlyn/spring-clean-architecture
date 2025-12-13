package lynx.com.infrastructure.event.persistence.mapper;

import lynx.com.application.event.dto.EventDto;
import lynx.com.domain.event.Event;
import lynx.com.infrastructure.event.persistence.entities.EventJPAEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EventMapper {

    Event toDomain(EventJPAEntity entity);

    Event toDomain(EventDto dto);

    EventJPAEntity toEntity(Event domain);

    EventDto toDto(Event domain);
}
