package ingjulianvega.ximic.msscasuvisittype.domain.repositories;

import ingjulianvega.ximic.msscasuvisittype.domain.VisitTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface VisitTypeRepository extends JpaRepository<VisitTypeEntity, UUID>, JpaSpecificationExecutor<VisitTypeEntity> {
}
