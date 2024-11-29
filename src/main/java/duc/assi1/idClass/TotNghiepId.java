package duc.assi1.idClass;

import java.io.Serializable;

public class TotNghiepId implements Serializable {
    private String sinhVien; // Ánh xạ tới soCMND
    private Long truong;   // Ánh xạ tới maTruong
    private Long nganh;    // Ánh xạ tới maNganh

    public TotNghiepId(){}

    public String getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(String sinhVien) {
        this.sinhVien = sinhVien;
    }

    public Long getTruong() {
        return truong;
    }

    public void setTruong(Long truong) {
        this.truong = truong;
    }

    public Long getNganh() {
        return nganh;
    }

    public void setNganh(Long nganh) {
        this.nganh = nganh;
    }
}
