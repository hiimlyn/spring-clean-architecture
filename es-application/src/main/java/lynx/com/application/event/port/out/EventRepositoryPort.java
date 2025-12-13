package lynx.com.application.event.port.out;


import lynx.com.domain.event.Event;

public interface EventRepositoryPort {
    Event save(Event event);
    Event findById(String id);
}
