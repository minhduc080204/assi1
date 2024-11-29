package duc.assi1.repository;

import duc.assi1.idClass.TotNghiepId;
import duc.assi1.model.TotNghiep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotNghiepRepository extends JpaRepository<TotNghiep, TotNghiepId> {
}
