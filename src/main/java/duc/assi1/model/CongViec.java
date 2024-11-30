package duc.assi1.model;

import duc.assi1.idclass.CongViecId;
import jakarta.persistence.*;

@Table
@Entity
@IdClass(CongViecId.class)
public class CongViec {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private SinhVien sinhVien;

    @Id
    private String ngayVaoCongTy;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "maNganh")
    private Nganh nganh;

    @Column
    private String tenCongViec;

    @Column
    private String tenCongTy;

    @Column
    private String diaChiCongTy;

    @Column
    private String thoiGianLamViec;

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

    public Nganh getNganh() {
        return nganh;
    }

    public void setNganh(Nganh nganh) {
        this.nganh = nganh;
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
