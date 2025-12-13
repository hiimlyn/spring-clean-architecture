package lynx.com.booking.persistence.repository;

import lombok.AllArgsConstructor;
import lynx.com.booking.application.port.out.TicketRepositoryPort;
import lynx.com.booking.entities.Ticket;
import lynx.com.booking.persistence.mapper.TicketMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class TicketRepositoryAdapter implements TicketRepositoryPort {
    private final TicketJPARepository ticketRepository;
    private final TicketMapper ticketMapper;


    @Override
    public Ticket save(Ticket ticket) {
        var entity = ticketMapper.toEntity(ticket);
        var savedEntity = ticketRepository.save(entity);
        return ticketMapper.toDomain(savedEntity);
    }

    @Override
    public Ticket findById(String id) {
        return ticketRepository.findById(id)
                .map(ticketMapper::toDomain)
                .orElse(null);
    }

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAll().stream()
                .map(ticketMapper::toDomain)
                .toList();
    }
}
