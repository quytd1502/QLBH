package Ass.Model;
import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "products")
public class Products {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String maSP;
  private String tenSP;
  private String giaSP;
  private String hinhAnh;
  private String ghiChu;
  public Products(){}
  public Products(String maSP, String tenSP, String giaSP, String hinhAnh, String ghiChu){
      this.maSP=maSP;
      this.tenSP=tenSP;
      this.giaSP=giaSP;
      this.hinhAnh=hinhAnh;
      this.ghiChu=ghiChu;
  }
  @Override
  public String toString(){
      return "Products{"+"id="+id+",maSP='"+maSP+'\''+",tenSP='"+tenSP+'\''+",giaSp='"+giaSP+'\''+
                                        ",hinhAnh='"+hinhAnh+'\''+",ghichu='"+ghiChu+'\''+'}';
  }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(String giaSP) {
        this.giaSP = giaSP;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
