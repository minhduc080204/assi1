package duc.assi1.service;

import duc.assi1.model.SinhVien;
import duc.assi1.model.TotNghiep;
import duc.assi1.modelDTO.SinhVienAndTotNghiep;
import duc.assi1.modelDTO.SinhVienDTO;
import duc.assi1.modelDTO.TotNghiepDTO;
import duc.assi1.repository.NganhRepository;
import duc.assi1.repository.SinhVienRepository;
import duc.assi1.repository.TotNghiepRepository;
import duc.assi1.repository.TruongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SinhVienService {
    @Autowired
    private SinhVienRepository sinhVienRepository;
    @Autowired
    private TruongRepository truongRepository;
    @Autowired
    private NganhRepository nganhRepository;
    @Autowired
    private TotNghiepRepository totNghiepRepository;

    public boolean insertSinhVienAndTotNghiep(SinhVienAndTotNghiep sinhVienAndTotNghiep){
        SinhVien sinhVien = dtoToSinhVien(sinhVienAndTotNghiep.getSinhVienDTO());
        sinhVienRepository.save(sinhVien);

        sinhVienAndTotNghiep.getTotNghiepDTO().setSoCMND(sinhVien.getSoCMND());
        TotNghiep totNghiep = dtoToTotNghiep(sinhVienAndTotNghiep.getTotNghiepDTO());
        totNghiepRepository.save(totNghiep);
        return true;
    }

    public List<SinhVienDTO> timKiemSinhVien(SinhVienDTO sinhVienDTO){
        Specification<SinhVien> specification = Specification.where(null);

        if (sinhVienDTO.getSoCMND() != null && !sinhVienDTO.getSoCMND().isEmpty()) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.like(root.get("soCMND"), "%" + sinhVienDTO.getSoCMND() + "%")
            );
        }

        if (sinhVienDTO.getHoTen() != null && !sinhVienDTO.getHoTen().isEmpty()) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.equal(root.get("hoTen"), sinhVienDTO.getHoTen())
            );
        }

        if (sinhVienDTO.getEmail() != null && !sinhVienDTO.getEmail().isEmpty()) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.equal(root.get("email"), sinhVienDTO.getEmail())
            );
        }

        if (sinhVienDTO.getDiaChi() != null && !sinhVienDTO.getDiaChi().isEmpty()) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.equal(root.get("diaChi"), sinhVienDTO.getDiaChi())
            );
        }

        return sinhVienRepository.findAll(specification).stream()
                .map(SinhVienDTO::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public SinhVienDTO getSinhVien(String soCMND){
        SinhVien sinhVien = sinhVienRepository.findById(soCMND).orElse(null);
        if(sinhVien==null){
            return null;
        }
        return new SinhVienDTO(sinhVien);
    }

    private SinhVien dtoToSinhVien(SinhVienDTO sinhVienDTO){
        if(sinhVienDTO==null){
            return null;
        }
        SinhVien sinhVien = new SinhVien();
        sinhVien.setSoCMND(sinhVienDTO.getSoCMND());
        sinhVien.setHoTen(sinhVienDTO.getHoTen());
        sinhVien.setEmail(sinhVienDTO.getEmail());
        sinhVien.setDiaChi(sinhVienDTO.getDiaChi());
        sinhVien.setSoDT(sinhVienDTO.getSoDT());
        return sinhVien;
    }

    private TotNghiep dtoToTotNghiep(TotNghiepDTO totNghiepDTO){
        if(totNghiepDTO==null){
            return null;
        }

//        TotNghiepId totNghiepId = new TotNghiepId();
//        totNghiepId.setTruong(totNghiepDTO.getMaTruong());
//        totNghiepId.setNganh(totNghiepDTO.getMaNganh());
//        totNghiepId.setSinhVien(totNghiepDTO.getSoCMND());

        TotNghiep totNghiep = new TotNghiep();
        totNghiep.setTruong(truongRepository.getReferenceById(totNghiepDTO.getMaTruong()));
        totNghiep.setNganh(nganhRepository.getReferenceById(totNghiepDTO.getMaNganh()));
        totNghiep.setSinhVien(sinhVienRepository.getReferenceById(totNghiepDTO.getSoCMND()));
        totNghiep.setNgayTN(totNghiepDTO.getNgayTN());
        totNghiep.setHeTN(totNghiepDTO.getHeTN());
        totNghiep.setLoaiTN(totNghiepDTO.getLoaiTN());
        return totNghiep;
    }
}
