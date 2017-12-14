/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author minhh
 */
@Entity
@Table(name = "donhang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Donhang.findAll", query = "SELECT d FROM Donhang d")
    , @NamedQuery(name = "Donhang.findByMaHd", query = "SELECT d FROM Donhang d WHERE d.maHd = :maHd")
    , @NamedQuery(name = "Donhang.findByHoten", query = "SELECT d FROM Donhang d WHERE d.hoten = :hoten")
    , @NamedQuery(name = "Donhang.findByNgaytao", query = "SELECT d FROM Donhang d WHERE d.ngaytao = :ngaytao")
    , @NamedQuery(name = "Donhang.findBySodienthoai", query = "SELECT d FROM Donhang d WHERE d.sodienthoai = :sodienthoai")
    , @NamedQuery(name = "Donhang.findByEmail", query = "SELECT d FROM Donhang d WHERE d.email = :email")
    , @NamedQuery(name = "Donhang.findByDiachi", query = "SELECT d FROM Donhang d WHERE d.diachi = :diachi")
    , @NamedQuery(name = "Donhang.findByTongtien", query = "SELECT d FROM Donhang d WHERE d.tongtien = :tongtien")
    , @NamedQuery(name = "Donhang.findByThanhtoan", query = "SELECT d FROM Donhang d WHERE d.thanhtoan = :thanhtoan")})
public class Donhang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ma_hd")
    private Integer maHd;
    @Size(max = 50)
    @Column(name = "hoten")
    private String hoten;
    @Column(name = "ngaytao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaytao;
    @Size(max = 20)
    @Column(name = "sodienthoai")
    private String sodienthoai;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Size(max = 200)
    @Column(name = "diachi")
    private String diachi;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tongtien")
    private Float tongtien;
    @Column(name = "thanhtoan")
    private Float thanhtoan;
    @JoinColumn(name = "matrangthai", referencedColumnName = "ma_tt")
    @ManyToOne
    private Trangthai matrangthai;
    @JoinColumn(name = "ma_kh", referencedColumnName = "ma_kh")
    @ManyToOne
    private Khachhang maKh;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maDh")
    private Collection<Chitiethd> chitiethdCollection;

    public Donhang() {
    }

    public Donhang(Integer maHd) {
        this.maHd = maHd;
    }

    public Integer getMaHd() {
        return maHd;
    }

    public void setMaHd(Integer maHd) {
        this.maHd = maHd;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Float getTongtien() {
        return tongtien;
    }

    public void setTongtien(Float tongtien) {
        this.tongtien = tongtien;
    }

    public Float getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(Float thanhtoan) {
        this.thanhtoan = thanhtoan;
    }

    public Trangthai getMatrangthai() {
        return matrangthai;
    }

    public void setMatrangthai(Trangthai matrangthai) {
        this.matrangthai = matrangthai;
    }

    public Khachhang getMaKh() {
        return maKh;
    }

    public void setMaKh(Khachhang maKh) {
        this.maKh = maKh;
    }

    @XmlTransient
    public Collection<Chitiethd> getChitiethdCollection() {
        return chitiethdCollection;
    }

    public void setChitiethdCollection(Collection<Chitiethd> chitiethdCollection) {
        this.chitiethdCollection = chitiethdCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maHd != null ? maHd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donhang)) {
            return false;
        }
        Donhang other = (Donhang) object;
        if ((this.maHd == null && other.maHd != null) || (this.maHd != null && !this.maHd.equals(other.maHd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Donhang[ maHd=" + maHd + " ]";
    }
    
}
