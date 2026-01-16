package lynx.com.application.booking.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lynx.com.application.booking.port.in.BookingUseCase;
import lynx.com.application.booking.port.out.TicketRepositoryPort;
import lynx.com.domain.booking.Ticket;

@Service
@AllArgsConstructor
public class BookingService implements BookingUseCase {
    private TicketRepositoryPort ticketRepository;

    @Override
    public void placeOrder() {
        var ticket = new Ticket();
        ticket.setEventId("xxx");
        ticket.setStartDate(LocalDate.now());
        ticketRepository.save(ticket);
    }
}

