package duc.assi1.service;

import duc.assi1.model.SinhVien;
import duc.assi1.modelDTO.CongViecDTO;
import duc.assi1.repository.CongViecRepository;
import duc.assi1.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CongViecService {
    @Autowired
    private CongViecRepository congViecRepository;

    @Autowired
    SinhVienRepository sinhVienRepository;

    public List<CongViecDTO> getCongViecBySoCMND(String soCMND){
        SinhVien sinhVien = sinhVienRepository.getReferenceById(soCMND);

        return congViecRepository.findAllBySinhVien(sinhVien).stream()
                .map(CongViecDTO::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
