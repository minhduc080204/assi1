package duc.assi1.modelDTO;

import duc.assi1.model.TotNghiep;

import java.time.LocalDate;

public class TotNghiepDTO {
    private String soCMND;
    private Long maTruong;
    private Long maNganh;
    private String heTN;
    private LocalDate ngayTN;
    private String loaiTN;

    public TotNghiepDTO(){}

    public TotNghiepDTO(TotNghiep totNghiep) {
        this.soCMND = totNghiep.getSinhVien().getSoCMND();
        this.maTruong = totNghiep.getTruong().getMaTruong();
        this.maNganh = totNghiep.getNganh().getMaNganh();
        this.heTN = totNghiep.getHeTN();
        this.ngayTN = totNghiep.getNgayTN();
        this.loaiTN = totNghiep.getLoaiTN();
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public Long getMaTruong() {
        return maTruong;
    }

    public void setMaTruong(Long maTruong) {
        this.maTruong = maTruong;
    }

    public Long getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(Long maNganh) {
        this.maNganh = maNganh;
    }

    public String getHeTN() {
        return heTN;
    }

    public void setHeTN(String heTN) {
        this.heTN = heTN;
    }

    public LocalDate getNgayTN() {
        return ngayTN;
    }

    public void setNgayTN(LocalDate ngayTN) {
        this.ngayTN = ngayTN;
    }

    public String getLoaiTN() {
        return loaiTN;
    }

    public void setLoaiTN(String loaiTN) {
        this.loaiTN = loaiTN;
    }

    @Override
    public String toString() {
        return "TotNghiepDTO{" +
                "soCMND='" + soCMND + '\'' +
                ", maTruong=" + maTruong +
                ", maNganh=" + maNganh +
                ", heTN='" + heTN + '\'' +
                ", ngayTN='" + ngayTN + '\'' +
                ", loaiTN='" + loaiTN + '\'' +
                '}';
    }
}
