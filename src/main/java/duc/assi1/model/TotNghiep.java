package duc.assi1.model;

import duc.assi1.idclass.TotNghiepId;
import jakarta.persistence.*;

import java.time.LocalDate;

@Table
@Entity
@IdClass(TotNghiepId.class)
public class TotNghiep {

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "soCMND")
    private SinhVien sinhVien;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "maTruong")
    private Truong truong;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "maNganh")
    private Nganh nganh;

    @Column
    private String heTN;

    @Column
    private LocalDate ngayTN;

    @Column
    private String loaiTN;

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public Truong getTruong() {
        return truong;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    public Nganh getNganh() {
        return nganh;
    }

    public void setNganh(Nganh nganh) {
        this.nganh = nganh;
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
}
