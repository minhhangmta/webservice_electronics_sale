/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author minhh
 */
@Entity
@Table(name = "chitiethd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chitiethd.findAll", query = "SELECT c FROM Chitiethd c")
    , @NamedQuery(name = "Chitiethd.findByMaCt", query = "SELECT c FROM Chitiethd c WHERE c.maCt = :maCt")
    , @NamedQuery(name = "Chitiethd.findBySoluong", query = "SELECT c FROM Chitiethd c WHERE c.soluong = :soluong")
    , @NamedQuery(name = "Chitiethd.findByTongtien", query = "SELECT c FROM Chitiethd c WHERE c.tongtien = :tongtien")
    , @NamedQuery(name = "Chitiethd.findByThanhtien", query = "SELECT c FROM Chitiethd c WHERE c.thanhtien = :thanhtien")})
public class Chitiethd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ma_ct")
    private Integer maCt;
    @Column(name = "soluong")
    private Integer soluong;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tongtien")
    private Float tongtien;
    @Column(name = "thanhtien")
    private Float thanhtien;
    @JoinColumn(name = "ma_dh", referencedColumnName = "ma_hd")
    @ManyToOne(optional = false)
    private Donhang maDh;
    @JoinColumn(name = "ma_sp", referencedColumnName = "ma_sp")
    @ManyToOne(optional = false)
    private Sanpham maSp;

    public Chitiethd() {
    }

    public Chitiethd(Integer maCt) {
        this.maCt = maCt;
    }

    public Integer getMaCt() {
        return maCt;
    }

    public void setMaCt(Integer maCt) {
        this.maCt = maCt;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public Float getTongtien() {
        return tongtien;
    }

    public void setTongtien(Float tongtien) {
        this.tongtien = tongtien;
    }

    public Float getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(Float thanhtien) {
        this.thanhtien = thanhtien;
    }

    public Donhang getMaDh() {
        return maDh;
    }

    public void setMaDh(Donhang maDh) {
        this.maDh = maDh;
    }

    public Sanpham getMaSp() {
        return maSp;
    }

    public void setMaSp(Sanpham maSp) {
        this.maSp = maSp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCt != null ? maCt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chitiethd)) {
            return false;
        }
        Chitiethd other = (Chitiethd) object;
        if ((this.maCt == null && other.maCt != null) || (this.maCt != null && !this.maCt.equals(other.maCt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Chitiethd[ maCt=" + maCt + " ]";
    }
    
}
