package duc.assi1.service;

import duc.assi1.model.SinhVien;
import duc.assi1.modelDTO.TotNghiepDTO;
import duc.assi1.repository.SinhVienRepository;
import duc.assi1.repository.TotNghiepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TotNghiepService {
    @Autowired
    TotNghiepRepository totNghiepRepository;

    @Autowired
    SinhVienRepository sinhVienRepository;

    public List<TotNghiepDTO> getTotNghiepBySoCMND(String soCMND){
        SinhVien sinhVien = sinhVienRepository.getReferenceById(soCMND);

        return totNghiepRepository.findAllBySinhVien(sinhVien).stream()
                .map(TotNghiepDTO::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
