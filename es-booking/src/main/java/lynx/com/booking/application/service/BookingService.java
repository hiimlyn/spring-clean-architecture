package lynx.com.booking.application.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lynx.com.booking.application.port.in.BookingUseCase;
import lynx.com.booking.application.port.out.TicketRepositoryPort;
import lynx.com.booking.entities.Ticket;
import lynx.com.common.ports.EventUseCase;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class BookingService implements BookingUseCase {
    private TicketRepositoryPort ticketRepository;
    private EventUseCase eventService;


    @Override
    @Transactional
    public void placeOrder() {
        var existingEvent =
        var ticket = new Ticket();
        ticket.setEventId("xxx");
        ticket.setStartDate(LocalDate.now());
        ticketRepository.save(ticket);
    }
}

