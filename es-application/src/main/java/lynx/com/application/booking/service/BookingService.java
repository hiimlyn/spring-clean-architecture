package lynx.com.application.booking.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lynx.com.application.booking.port.in.BookingUseCase;
import lynx.com.application.booking.port.out.TicketRepositoryPort;
import lynx.com.domain.booking.Ticket;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class BookingService implements BookingUseCase {
    private TicketRepositoryPort ticketRepository;

    @Override
    @Transactional
    public void placeOrder() {
        var ticket = new Ticket();
        ticket.setEventId("xxx");
        ticket.setStartDate(LocalDate.now());
        ticketRepository.save(ticket);
    }
}

