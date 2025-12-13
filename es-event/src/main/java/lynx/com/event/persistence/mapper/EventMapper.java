package lynx.com.event.persistence.mapper;

import lynx.com.common.dto.event.EventDto;
import lynx.com.event.entities.Event;
import lynx.com.event.persistence.entities.EventJPAEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EventMapper {

    Event toDomain(EventJPAEntity entity);

    Event toDomain(EventDto dto);

    EventJPAEntity toEntity(Event domain);

    EventDto toDto(Event domain);
}
