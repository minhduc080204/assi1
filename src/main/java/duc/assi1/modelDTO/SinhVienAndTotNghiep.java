package duc.assi1.modelDTO;

public class SinhVienAndTotNghiep {
    private SinhVienDTO sinhVienDTO;
    private TotNghiepDTO totNghiepDTO;

    public SinhVienAndTotNghiep(SinhVienDTO sinhVienDTO, TotNghiepDTO totNghiepDTO) {
        this.sinhVienDTO = sinhVienDTO;
        this.totNghiepDTO = totNghiepDTO;
    }

    public SinhVienAndTotNghiep(){}

    public SinhVienDTO getSinhVienDTO() {
        return sinhVienDTO;
    }

    public void setSinhVienDTO(SinhVienDTO sinhVienDTO) {
        this.sinhVienDTO = sinhVienDTO;
    }

    public TotNghiepDTO getTotNghiepDTO() {
        return totNghiepDTO;
    }

    public void setTotNghiepDTO(TotNghiepDTO totNghiepDTO) {
        this.totNghiepDTO = totNghiepDTO;
    }
}
