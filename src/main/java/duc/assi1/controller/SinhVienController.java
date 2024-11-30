package duc.assi1.controller;

import duc.assi1.modelDTO.CongViecDTO;
import duc.assi1.modelDTO.SinhVienAndTotNghiep;
import duc.assi1.modelDTO.SinhVienDTO;
import duc.assi1.modelDTO.TotNghiepDTO;
import duc.assi1.repository.NganhRepository;
import duc.assi1.repository.TotNghiepRepository;
import duc.assi1.repository.TruongRepository;
import duc.assi1.service.*;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SinhVienController {
    @Autowired
    private SinhVienService sinhVienService;
    @Autowired
    private TruongService truongService;
    @Autowired
    private NganhService nganhService;
    @Autowired
    private TotNghiepService TotNghiepDTO;
    @Autowired
    private CongViecService congViecService;
    @Autowired
    private TotNghiepService totNghiepService;

    @GetMapping("/")
    public String index(){
        return "redirect:/timkiemsinhvien";
    }

    @GetMapping("sinhvienkhaibao")
    public String sinhVienKhaiBao(Model model) {
        model.addAttribute("sinhVienAndTotNghiep", new SinhVienAndTotNghiep(new SinhVienDTO(), new TotNghiepDTO()));
        model.addAttribute("truongList", truongService.getAllTruong());
        model.addAttribute("nganhList", nganhService.getAllNganh());
        return "sinhVienKhaiBao";
    }

    @PostMapping("sinhvienkhaibao")
    public String doSinhVienKhaiBao(@ModelAttribute("sinhVienAndTotNghiep") SinhVienAndTotNghiep sinhVienAndTotNghiep) {
        System.out.println(sinhVienAndTotNghiep);
        sinhVienService.insertSinhVienAndTotNghiep(sinhVienAndTotNghiep);
        return "redirect:/sinhvienkhaibao";
    }

    @GetMapping("timkiemsinhvien")
    public String timKiemSinhVien(Model model){
        model.addAttribute("sinhVien", new SinhVienDTO());
        return "timKiemSinhVien";
    }

    @PostMapping("timkiemsinhvien")
    public String doTimKiemSinhVien(@ModelAttribute("sinhVien") SinhVienDTO sinhVien, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("ketQuaSinhViens", sinhVienService.timKiemSinhVien(sinhVien));
        return "redirect:/timkiemsinhvien";
    }

    @GetMapping("thongtinvieclam")
    public String thongTinViecLam(Model model){
        model.addAttribute("sinhVien", new SinhVienDTO());
        return "thongTinViecLam";
    }

    @PostMapping("thongtinvieclam")
    public String doThongTinViecLam(@ModelAttribute("sinhVien") SinhVienDTO sinhVien, RedirectAttributes redirectAttributes){
        String soCMND = sinhVien.getSoCMND();
        SinhVienDTO sinhVienDTO = sinhVienService.getSinhVien(soCMND);
        List<TotNghiepDTO> totNghiepDTOS = totNghiepService.getTotNghiepBySoCMND(soCMND);
        List<CongViecDTO> congViecDTOS = congViecService.getCongViecBySoCMND(soCMND);


        redirectAttributes.addFlashAttribute("sinhVienInfo", sinhVienDTO);
        redirectAttributes.addFlashAttribute("totNghieps", totNghiepDTOS);
        redirectAttributes.addFlashAttribute("congViecs", congViecDTOS);
        return "redirect:/thongtinvieclam";
    }
}
