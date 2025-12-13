package lynx.com.application.event.port.in;


import lynx.com.application.event.dto.CreateEventRequestDto;
import lynx.com.application.event.dto.EventDto;

public interface EventUseCase {
    EventDto createEvent(CreateEventRequestDto event);

    EventDto findEventById(String id);
}
