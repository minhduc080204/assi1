package duc.assi1.service;

import duc.assi1.modelDTO.NganhDTO;
import duc.assi1.modelDTO.TruongDTO;
import duc.assi1.repository.NganhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NganhService {
    @Autowired
    private NganhRepository nganhRepository;

    public List<NganhDTO> getAllNganh(){
        return nganhRepository.findAll().stream()
                .map(NganhDTO::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
