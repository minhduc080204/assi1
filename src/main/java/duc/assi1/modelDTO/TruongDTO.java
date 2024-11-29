package duc.assi1.modelDTO;

import duc.assi1.model.Truong;

public class TruongDTO {
    private Long maTruong;
    private String tenTruong;
    private String diaChi;
    private String soDT;

    public TruongDTO(){}

    public TruongDTO(Truong truong) {
        this.maTruong = truong.getMaTruong();
        this.tenTruong = truong.getTenTruong();
        this.diaChi = truong.getDiaChi();
        this.soDT = truong.getSoDT();
    }

    public Long getMaTruong() {
        return maTruong;
    }

    public void setMaTruong(Long maTruong) {
        this.maTruong = maTruong;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
}
