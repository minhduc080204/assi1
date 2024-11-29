package duc.assi1.service;

import duc.assi1.model.Truong;
import duc.assi1.modelDTO.TruongDTO;
import duc.assi1.repository.TruongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TruongService {
    @Autowired
    private TruongRepository truongRepository;

    public List<TruongDTO> getAllTruong(){
        return truongRepository.findAll().stream()
                .map(TruongDTO::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
