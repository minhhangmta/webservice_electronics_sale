package pojo;
// Generated Dec 2, 2017 3:44:02 AM by Hibernate Tools 4.3.1



/**
 * Chitiethd generated by hbm2java
 */
public class Chitiethd  implements java.io.Serializable {


     private Integer maCt;
     private Donhang donhang;
     private Sanpham sanpham;
     private Integer soluong;
     private Float tongtien;
     private Float thanhtien;

    public Chitiethd() {
    }

	
    public Chitiethd(Donhang donhang, Sanpham sanpham) {
        this.donhang = donhang;
        this.sanpham = sanpham;
    }
    public Chitiethd(Donhang donhang, Sanpham sanpham, Integer soluong, Float tongtien, Float thanhtien) {
       this.donhang = donhang;
       this.sanpham = sanpham;
       this.soluong = soluong;
       this.tongtien = tongtien;
       this.thanhtien = thanhtien;
    }
   
    public Integer getMaCt() {
        return this.maCt;
    }
    
    public void setMaCt(Integer maCt) {
        this.maCt = maCt;
    }
    public Donhang getDonhang() {
        return this.donhang;
    }
    
    public void setDonhang(Donhang donhang) {
        this.donhang = donhang;
    }
    public Sanpham getSanpham() {
        return this.sanpham;
    }
    
    public void setSanpham(Sanpham sanpham) {
        this.sanpham = sanpham;
    }
    public Integer getSoluong() {
        return this.soluong;
    }
    
    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }
    public Float getTongtien() {
        return this.tongtien;
    }
    
    public void setTongtien(Float tongtien) {
        this.tongtien = tongtien;
    }
    public Float getThanhtien() {
        return this.thanhtien;
    }
    
    public void setThanhtien(Float thanhtien) {
        this.thanhtien = thanhtien;
    }




}


