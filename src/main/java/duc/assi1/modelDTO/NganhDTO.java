package duc.assi1.modelDTO;

import duc.assi1.model.Nganh;

public class NganhDTO {
    private Long maNganh;
    private String tenNganh;
    private String loaiNganh;

    public NganhDTO(){}

    public NganhDTO(Nganh nganh) {
        this.maNganh = nganh.getMaNganh();
        this.tenNganh = nganh.getTenNganh();
        this.loaiNganh = nganh.getLoaiNganh();
    }

    public Long getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(Long maNganh) {
        this.maNganh = maNganh;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

    public String getLoaiNganh() {
        return loaiNganh;
    }

    public void setLoaiNganh(String loaiNganh) {
        this.loaiNganh = loaiNganh;
    }
}
