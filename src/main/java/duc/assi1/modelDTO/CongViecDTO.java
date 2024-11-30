package duc.assi1.modelDTO;

import duc.assi1.model.CongViec;

public class CongViecDTO {
    private String soCMND;
    private String ngayVaoCongTy;
    private Long maNganh;
    private String tenCongViec;
    private String tenCongTy;
    private String diaChiCongTy;
    private String thoiGianLamViec;

    public CongViecDTO(){}

    public CongViecDTO(CongViec congViec) {
        this.soCMND = congViec.getSinhVien().getSoCMND();
        this.ngayVaoCongTy = congViec.getNgayVaoCongTy();
        this.maNganh = congViec.getNganh().getMaNganh();
        this.tenCongViec = congViec.getTenCongViec();
        this.tenCongTy = congViec.getTenCongTy();
        this.diaChiCongTy = congViec.getDiaChiCongTy();
        this.thoiGianLamViec = congViec.getThoiGianLamViec();
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getNgayVaoCongTy() {
        return ngayVaoCongTy;
    }

    public void setNgayVaoCongTy(String ngayVaoCongTy) {
        this.ngayVaoCongTy = ngayVaoCongTy;
    }

    public Long getMaNgang() {
        return maNganh;
    }

    public void setMaNgang(Long maNganh) {
        this.maNganh = maNganh;
    }

    public String getTenCongViec() {
        return tenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getDiaChiCongTy() {
        return diaChiCongTy;
    }

    public void setDiaChiCongTy(String diaChiCongTy) {
        this.diaChiCongTy = diaChiCongTy;
    }

    public String getThoiGianLamViec() {
        return thoiGianLamViec;
    }

    public void setThoiGianLamViec(String thoiGianLamViec) {
        this.thoiGianLamViec = thoiGianLamViec;
    }
}
