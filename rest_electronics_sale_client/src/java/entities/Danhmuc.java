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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "danhmuc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Danhmuc.findAll", query = "SELECT d FROM Danhmuc d")
    , @NamedQuery(name = "Danhmuc.findByMaDm", query = "SELECT d FROM Danhmuc d WHERE d.maDm = :maDm")
    , @NamedQuery(name = "Danhmuc.findByMaDmcha", query = "SELECT d FROM Danhmuc d WHERE d.maDmcha = :maDmcha")
    , @NamedQuery(name = "Danhmuc.findByTendanhmuc", query = "SELECT d FROM Danhmuc d WHERE d.tendanhmuc = :tendanhmuc")})
public class Danhmuc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ma_dm")
    private Integer maDm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ma_dmcha")
    private int maDmcha;
    @Size(max = 50)
    @Column(name = "tendanhmuc")
    private String tendanhmuc;
    @OneToMany(mappedBy = "maDm")
    private Collection<Sanpham> sanphamCollection;

    public Danhmuc() {
    }

    public Danhmuc(Integer maDm) {
        this.maDm = maDm;
    }

    public Danhmuc(Integer maDm, int maDmcha) {
        this.maDm = maDm;
        this.maDmcha = maDmcha;
    }

    public Integer getMaDm() {
        return maDm;
    }

    public void setMaDm(Integer maDm) {
        this.maDm = maDm;
    }

    public int getMaDmcha() {
        return maDmcha;
    }

    public void setMaDmcha(int maDmcha) {
        this.maDmcha = maDmcha;
    }

    public String getTendanhmuc() {
        return tendanhmuc;
    }

    public void setTendanhmuc(String tendanhmuc) {
        this.tendanhmuc = tendanhmuc;
    }

    @XmlTransient
    public Collection<Sanpham> getSanphamCollection() {
        return sanphamCollection;
    }

    public void setSanphamCollection(Collection<Sanpham> sanphamCollection) {
        this.sanphamCollection = sanphamCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maDm != null ? maDm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Danhmuc)) {
            return false;
        }
        Danhmuc other = (Danhmuc) object;
        if ((this.maDm == null && other.maDm != null) || (this.maDm != null && !this.maDm.equals(other.maDm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Danhmuc[ maDm=" + maDm + " ]";
    }
    
}
