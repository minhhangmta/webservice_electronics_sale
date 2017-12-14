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
@Table(name = "khachhang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khachhang.findAll", query = "SELECT k FROM Khachhang k")
    , @NamedQuery(name = "Khachhang.findByMaKh", query = "SELECT k FROM Khachhang k WHERE k.maKh = :maKh")
    , @NamedQuery(name = "Khachhang.findByHoten", query = "SELECT k FROM Khachhang k WHERE k.hoten = :hoten")
    , @NamedQuery(name = "Khachhang.findByEmail", query = "SELECT k FROM Khachhang k WHERE k.email = :email")
    , @NamedQuery(name = "Khachhang.findByPassword", query = "SELECT k FROM Khachhang k WHERE k.password = :password")
    , @NamedQuery(name = "Khachhang.findBySodienthoai", query = "SELECT k FROM Khachhang k WHERE k.sodienthoai = :sodienthoai")
    , @NamedQuery(name = "Khachhang.findByDiachi", query = "SELECT k FROM Khachhang k WHERE k.diachi = :diachi")})
public class Khachhang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ma_kh")
    private Integer maKh;
    @Size(max = 50)
    @Column(name = "hoten")
    private String hoten;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Size(max = 50)
    @Column(name = "password")
    private String password;
    @Size(max = 20)
    @Column(name = "sodienthoai")
    private String sodienthoai;
    @Size(max = 200)
    @Column(name = "diachi")
    private String diachi;
    @OneToMany(mappedBy = "maKh")
    private Collection<Donhang> donhangCollection;

    public Khachhang() {
    }

    public Khachhang(Integer maKh) {
        this.maKh = maKh;
    }

    public Integer getMaKh() {
        return maKh;
    }

    public void setMaKh(Integer maKh) {
        this.maKh = maKh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
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
        hash += (maKh != null ? maKh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khachhang)) {
            return false;
        }
        Khachhang other = (Khachhang) object;
        if ((this.maKh == null && other.maKh != null) || (this.maKh != null && !this.maKh.equals(other.maKh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Khachhang[ maKh=" + maKh + " ]";
    }
    
}
