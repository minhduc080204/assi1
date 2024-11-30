package duc.assi1.repository;

import duc.assi1.idclass.TotNghiepId;
import duc.assi1.model.SinhVien;
import duc.assi1.model.TotNghiep;
import duc.assi1.modelDTO.TotNghiepDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TotNghiepRepository extends JpaRepository<TotNghiep, TotNghiepId> {
    List<TotNghiep> findAllBySinhVien(SinhVien sinhVien);
}
