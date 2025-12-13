package lynx.com.infrastructure.vendor.persistence.repository;

import lynx.com.infrastructure.vendor.persistence.entity.VendorJPAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorJPARepository extends JpaRepository<VendorJPAEntity, String> {
}
