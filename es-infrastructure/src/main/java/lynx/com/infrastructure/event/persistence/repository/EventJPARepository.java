package lynx.com.infrastructure.event.persistence.repository;

import lynx.com.infrastructure.event.persistence.entities.EventJPAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventJPARepository extends JpaRepository<EventJPAEntity, String> {
}
