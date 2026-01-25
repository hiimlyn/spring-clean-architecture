package lynx.com.infrastructure.vendor.persistence.repository;

import lynx.com.infrastructure.vendor.persistence.entity.VendorJPAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendorJPARepository extends JpaRepository<VendorJPAEntity, String>, JpaSpecificationExecutor<VendorJPAEntity> {
}
