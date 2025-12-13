package lynx.com.infrastructure.booking.persistence.repository;

import lynx.com.infrastructure.booking.persistence.entity.TicketJPAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketJPARepository extends JpaRepository<TicketJPAEntity, String> {
}
