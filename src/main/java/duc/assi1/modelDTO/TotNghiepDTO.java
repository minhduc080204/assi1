package duc.assi1.modelDTO;

import duc.assi1.model.Nganh;
import duc.assi1.model.SinhVien;
import duc.assi1.model.Truong;
import jakarta.persistence.*;

public class TotNghiepDTO {
    private String soCMND;
    private Long maTruong;
    private Long maNganh;
    private String heTN;
    private String ngayTN;
    private String loaiTN;

    public TotNghiepDTO(){}

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

    public String getNgayTN() {
        return ngayTN;
    }

    public void setNgayTN(String ngayTN) {
        this.ngayTN = ngayTN;
    }

    public String getLoaiTN() {
        return loaiTN;
    }

    public void setLoaiTN(String loaiTN) {
        this.loaiTN = loaiTN;
    }
}
