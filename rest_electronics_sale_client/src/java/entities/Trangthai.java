/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "trangthai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trangthai.findAll", query = "SELECT t FROM Trangthai t")
    , @NamedQuery(name = "Trangthai.findByMaTt", query = "SELECT t FROM Trangthai t WHERE t.maTt = :maTt")
    , @NamedQuery(name = "Trangthai.findByTentrangthai", query = "SELECT t FROM Trangthai t WHERE t.tentrangthai = :tentrangthai")})
public class Trangthai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ma_tt")
    private Integer maTt;
    @Size(max = 50)
    @Column(name = "tentrangthai")
    private String tentrangthai;
    @OneToMany(mappedBy = "maTt")
    private Collection<Lienhe> lienheCollection;
    @OneToMany(mappedBy = "maTt")
    private Collection<Sanpham> sanphamCollection;
    @OneToMany(mappedBy = "matrangthai")
    private Collection<Donhang> donhangCollection;

    public Trangthai() {
    }

    public Trangthai(Integer maTt) {
        this.maTt = maTt;
    }

    public Integer getMaTt() {
        return maTt;
    }

    public void setMaTt(Integer maTt) {
        this.maTt = maTt;
    }

    public String getTentrangthai() {
        return tentrangthai;
    }

    public void setTentrangthai(String tentrangthai) {
        this.tentrangthai = tentrangthai;
    }

    @XmlTransient
    public Collection<Lienhe> getLienheCollection() {
        return lienheCollection;
    }

    public void setLienheCollection(Collection<Lienhe> lienheCollection) {
        this.lienheCollection = lienheCollection;
    }

    @XmlTransient
    public Collection<Sanpham> getSanphamCollection() {
        return sanphamCollection;
    }

    public void setSanphamCollection(Collection<Sanpham> sanphamCollection) {
        this.sanphamCollection = sanphamCollection;
    }

    @XmlTransient
    public Collection<Donhang> getDonhangCollection() {
        return donhangCollection;
    }

    public void setDonhangCollection(Collection<Donhang> donhangCollection) {
        this.donhangCollection = donhangCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maTt != null ? maTt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trangthai)) {
            return false;
        }
        Trangthai other = (Trangthai) object;
        if ((this.maTt == null && other.maTt != null) || (this.maTt != null && !this.maTt.equals(other.maTt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Trangthai[ maTt=" + maTt + " ]";
    }
    
}
