package duc.assi1.controller;

import duc.assi1.modelDTO.SinhVienAndTotNghiep;
import duc.assi1.modelDTO.SinhVienDTO;
import duc.assi1.modelDTO.TotNghiepDTO;
import duc.assi1.repository.NganhRepository;
import duc.assi1.repository.TruongRepository;
import duc.assi1.service.NganhService;
import duc.assi1.service.SinhVienService;
import duc.assi1.service.TruongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {
    @Autowired
    private SinhVienService sinhVienService;
    @Autowired
    private TruongService truongService;
    @Autowired
    private NganhService nganhService;

    @GetMapping("sinhvienkhaibao")
    public String sinhVienKhaiBao(Model model) {
        model.addAttribute("sinhVienAndTotNghiep", new SinhVienAndTotNghiep(new SinhVienDTO(), new TotNghiepDTO()));
        model.addAttribute("truongList", truongService.getAllTruong());
        model.addAttribute("nganhList", nganhService.getAllNganh());
        return "sinhVienKhaiBao";
    }
}
