package duc.assi1.modelDTO;

import duc.assi1.model.SinhVien;

public class SinhVienDTO {
    private String soCMND;
    private String hoTen;
    private String email;
    private String soDT;
    private String diaChi;

    public SinhVienDTO(){}

    public SinhVienDTO(SinhVien sinhVien) {
        this.soCMND = sinhVien.getSoCMND();
        this.hoTen = sinhVien.getHoTen();
        this.email = sinhVien.getEmail();
        this.soDT = sinhVien.getSoDT();
        this.diaChi = sinhVien.getDiaChi();
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "SinhVienDTO{" +
                "soCMND='" + soCMND + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", email='" + email + '\'' +
                ", soDT='" + soDT + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
