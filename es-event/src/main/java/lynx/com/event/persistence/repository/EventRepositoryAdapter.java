package lynx.com.event.persistence.repository;

import lombok.AllArgsConstructor;
import lynx.com.event.application.port.out.EventRepositoryPort;
import lynx.com.event.entities.Event;
import lynx.com.event.persistence.mapper.EventMapper;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class EventRepositoryAdapter implements EventRepositoryPort {
    private final EventJPARepository eventJPARepository;
    private final EventMapper eventMapper;
    @Override
    public Event save(Event event) {
        var entity = eventMapper.toEntity(event);
        var result = eventJPARepository.save(entity);
        return eventMapper.toDomain(result);
    }

    @Override
    public Event findById(String id) {
        var entity = eventJPARepository.findById(id).orElse(null);
        return eventMapper.toDomain(entity);
    }
}
