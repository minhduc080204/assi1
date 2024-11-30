package duc.assi1.repository;

import duc.assi1.idclass.CongViecId;
import duc.assi1.model.CongViec;
import duc.assi1.model.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CongViecRepository extends JpaRepository<CongViec, CongViecId> {
    public List<CongViec> findAllBySinhVien(SinhVien sinhVien);
}
