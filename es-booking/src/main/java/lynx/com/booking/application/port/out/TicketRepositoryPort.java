package lynx.com.booking.application.port.out;

import lynx.com.booking.entities.Ticket;

import java.util.List;

public interface TicketRepositoryPort {
    Ticket save(Ticket ticket);
    Ticket findById(String id);
    List<Ticket> findAll();
}
