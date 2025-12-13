package lynx.com.event.persistence.repository;

import lynx.com.event.persistence.entities.EventJPAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventJPARepository extends JpaRepository<EventJPAEntity, String> {
}
