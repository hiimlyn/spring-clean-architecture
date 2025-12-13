package lynx.com.booking.persistence.repository;

import lynx.com.booking.persistence.entity.TicketJPAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketJPARepository extends JpaRepository<TicketJPAEntity, String> {
}
