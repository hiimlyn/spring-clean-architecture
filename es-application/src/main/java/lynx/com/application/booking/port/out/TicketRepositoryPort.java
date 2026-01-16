package lynx.com.application.booking.port.out;


import lynx.com.domain.booking.Ticket;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TicketRepositoryPort {
    Ticket save(Ticket ticket);
    Ticket findById(String id);
    List<Ticket> findAll();
}
