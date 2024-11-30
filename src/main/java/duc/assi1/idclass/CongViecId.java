package duc.assi1.idclass;

import duc.assi1.model.SinhVien;

import java.io.Serializable;

public class CongViecId  implements Serializable {
    private SinhVien sinhVien;
    private String ngayVaoCongTy;

    public CongViecId(){}

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public String getNgayVaoCongTy() {
        return ngayVaoCongTy;
    }

    public void setNgayVaoCongTy(String ngayVaoCongTy) {
        this.ngayVaoCongTy = ngayVaoCongTy;
    }
}
