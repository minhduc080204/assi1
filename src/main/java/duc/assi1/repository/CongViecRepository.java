package duc.assi1.repository;

import duc.assi1.idClass.CongViecId;
import duc.assi1.model.CongViec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CongViecRepository extends JpaRepository<CongViec, CongViecId> {
}
