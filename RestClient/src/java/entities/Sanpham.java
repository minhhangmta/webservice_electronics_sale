/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author minhh
 */
@Entity
@Table(name = "sanpham")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sanpham.findAll", query = "SELECT s FROM Sanpham s")
    , @NamedQuery(name = "Sanpham.findByMaSp", query = "SELECT s FROM Sanpham s WHERE s.maSp = :maSp")
    , @NamedQuery(name = "Sanpham.findByTensanpham", query = "SELECT s FROM Sanpham s WHERE s.tensanpham = :tensanpham")
    , @NamedQuery(name = "Sanpham.findByMota", query = "SELECT s FROM Sanpham s WHERE s.mota = :mota")
    , @NamedQuery(name = "Sanpham.findByAnh", query = "SELECT s FROM Sanpham s WHERE s.anh = :anh")
    , @NamedQuery(name = "Sanpham.findByGia", query = "SELECT s FROM Sanpham s WHERE s.gia = :gia")
    , @NamedQuery(name = "Sanpham.findBySale", query = "SELECT s FROM Sanpham s WHERE s.sale = :sale")
    , @NamedQuery(name = "Sanpham.findBySoluong", query = "SELECT s FROM Sanpham s WHERE s.soluong = :soluong")
    , @NamedQuery(name = "Sanpham.findByAnh2", query = "SELECT s FROM Sanpham s WHERE s.anh2 = :anh2")
    , @NamedQuery(name = "Sanpham.findByAnh3", query = "SELECT s FROM Sanpham s WHERE s.anh3 = :anh3")
    , @NamedQuery(name = "Sanpham.findByAnh4", query = "SELECT s FROM Sanpham s WHERE s.anh4 = :anh4")})
public class Sanpham implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ma_sp")
    private Integer maSp;
    @Size(max = 100)
    @Column(name = "tensanpham")
    private String tensanpham;
    @Size(max = 1000)
    @Column(name = "mota")
    private String mota;
    @Size(max = 200)
    @Column(name = "anh")
    private String anh;
    @Column(name = "gia")
    private Integer gia;
    @Column(name = "sale")
    private Integer sale;
    @Column(name = "soluong")
    private Integer soluong;
    @Size(max = 200)
    @Column(name = "anh2")
    private String anh2;
    @Size(max = 200)
    @Column(name = "anh3")
    private String anh3;
    @Size(max = 200)
    @Column(name = "anh4")
    private String anh4;
    @JoinColumn(name = "ma_dm", referencedColumnName = "ma_dm")
    @ManyToOne
    private Danhmuc maDm;
    @JoinColumn(name = "ma_ncc", referencedColumnName = "ma_ncc")
    @ManyToOne
    private Nhacungcap maNcc;
    @JoinColumn(name = "ma_tt", referencedColumnName = "ma_tt")
    @ManyToOne
    private Trangthai maTt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maSp")
    private Collection<Chitiethd> chitiethdCollection;

    public Sanpham() {
    }

    public Sanpham(Integer maSp) {
        this.maSp = maSp;
    }

    public Integer getMaSp() {
        return maSp;
    }

    public void setMaSp(Integer maSp) {
        this.maSp = maSp;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public String getAnh2() {
        return anh2;
    }

    public void setAnh2(String anh2) {
        this.anh2 = anh2;
    }

    public String getAnh3() {
        return anh3;
    }

    public void setAnh3(String anh3) {
        this.anh3 = anh3;
    }

    public String getAnh4() {
        return anh4;
    }

    public void setAnh4(String anh4) {
        this.anh4 = anh4;
    }

    public Danhmuc getMaDm() {
        return maDm;
    }

    public void setMaDm(Danhmuc maDm) {
        this.maDm = maDm;
    }

    public Nhacungcap getMaNcc() {
        return maNcc;
    }

    public void setMaNcc(Nhacungcap maNcc) {
        this.maNcc = maNcc;
    }

    public Trangthai getMaTt() {
        return maTt;
    }

    public void setMaTt(Trangthai maTt) {
        this.maTt = maTt;
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
        hash += (maSp != null ? maSp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sanpham)) {
            return false;
        }
        Sanpham other = (Sanpham) object;
        if ((this.maSp == null && other.maSp != null) || (this.maSp != null && !this.maSp.equals(other.maSp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sanpham[ maSp=" + maSp + " ]";
    }
    
}
