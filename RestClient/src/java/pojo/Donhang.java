package pojo;
// Generated Dec 2, 2017 3:44:02 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Donhang generated by hbm2java
 */
public class Donhang  implements java.io.Serializable {


     private Integer maHd;
     private Khachhang khachhang;
     private Trangthai trangthai;
     private String hoten;
     private Date ngaytao;
     private String sodienthoai;
     private String email;
     private String diachi;
     private Float tongtien;
     private Float thanhtoan;
     private Set chitiethds = new HashSet(0);

    public Donhang() {
    }

    public Donhang(Khachhang khachhang, Trangthai trangthai, String hoten, Date ngaytao, String sodienthoai, String email, String diachi, Float tongtien, Float thanhtoan, Set chitiethds) {
       this.khachhang = khachhang;
       this.trangthai = trangthai;
       this.hoten = hoten;
       this.ngaytao = ngaytao;
       this.sodienthoai = sodienthoai;
       this.email = email;
       this.diachi = diachi;
       this.tongtien = tongtien;
       this.thanhtoan = thanhtoan;
       this.chitiethds = chitiethds;
    }
   
    public Integer getMaHd() {
        return this.maHd;
    }
    
    public void setMaHd(Integer maHd) {
        this.maHd = maHd;
    }
    public Khachhang getKhachhang() {
        return this.khachhang;
    }
    
    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }
    public Trangthai getTrangthai() {
        return this.trangthai;
    }
    
    public void setTrangthai(Trangthai trangthai) {
        this.trangthai = trangthai;
    }
    public String getHoten() {
        return this.hoten;
    }
    
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public Date getNgaytao() {
        return this.ngaytao;
    }
    
    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }
    public String getSodienthoai() {
        return this.sodienthoai;
    }
    
    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDiachi() {
        return this.diachi;
    }
    
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public Float getTongtien() {
        return this.tongtien;
    }
    
    public void setTongtien(Float tongtien) {
        this.tongtien = tongtien;
    }
    public Float getThanhtoan() {
        return this.thanhtoan;
    }
    
    public void setThanhtoan(Float thanhtoan) {
        this.thanhtoan = thanhtoan;
    }
    public Set getChitiethds() {
        return this.chitiethds;
    }
    
    public void setChitiethds(Set chitiethds) {
        this.chitiethds = chitiethds;
    }




}


