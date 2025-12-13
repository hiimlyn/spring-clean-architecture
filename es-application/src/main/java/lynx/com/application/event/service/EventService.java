package lynx.com.application.event.service;

import lombok.AllArgsConstructor;
import lynx.com.application.event.dto.CreateEventRequestDto;
import lynx.com.application.event.dto.EventDto;
import lynx.com.application.event.EventApplicationMapper;
import lynx.com.application.event.port.in.EventUseCase;
import lynx.com.application.event.port.out.EventRepositoryPort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventService implements EventUseCase {
    private final EventRepositoryPort eventRepository;
    private final EventApplicationMapper eventApplicationMapper;

    @Override
    public EventDto createEvent(CreateEventRequestDto event) {
        var eventDomain = eventApplicationMapper.toDomain(event);
        var eventDto = eventRepository.save(eventDomain);
        return eventApplicationMapper.toDto(eventDto);
    }

    @Override
    public EventDto findEventById(String id) {
        var event = eventRepository.findById(id);
        return eventApplicationMapper.toDto(event);
    }
}
