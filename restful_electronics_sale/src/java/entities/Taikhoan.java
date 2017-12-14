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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author minhh
 */
@Entity
@Table(name = "taikhoan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Taikhoan.findAll", query = "SELECT t FROM Taikhoan t")
    , @NamedQuery(name = "Taikhoan.findByMaTk", query = "SELECT t FROM Taikhoan t WHERE t.maTk = :maTk")
    , @NamedQuery(name = "Taikhoan.findByUsername", query = "SELECT t FROM Taikhoan t WHERE t.username = :username")
    , @NamedQuery(name = "Taikhoan.findByPassword", query = "SELECT t FROM Taikhoan t WHERE t.password = :password")
    , @NamedQuery(name = "Taikhoan.findByHoten", query = "SELECT t FROM Taikhoan t WHERE t.hoten = :hoten")
    , @NamedQuery(name = "Taikhoan.findByEmail", query = "SELECT t FROM Taikhoan t WHERE t.email = :email")
    , @NamedQuery(name = "Taikhoan.findBySodienthoai", query = "SELECT t FROM Taikhoan t WHERE t.sodienthoai = :sodienthoai")
    , @NamedQuery(name = "Taikhoan.findByDiachi", query = "SELECT t FROM Taikhoan t WHERE t.diachi = :diachi")
    , @NamedQuery(name = "Taikhoan.findByMaTt", query = "SELECT t FROM Taikhoan t WHERE t.maTt = :maTt")})
public class Taikhoan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ma_tk")
    private Integer maTk;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "password")
    private String password;
    @Size(max = 50)
    @Column(name = "hoten")
    private String hoten;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Size(max = 20)
    @Column(name = "sodienthoai")
    private String sodienthoai;
    @Size(max = 200)
    @Column(name = "diachi")
    private String diachi;
    @Column(name = "ma_tt")
    private Integer maTt;
    @JoinColumn(name = "ma_q", referencedColumnName = "ma_q")
    @ManyToOne
    private Quyen maQ;

    public Taikhoan() {
    }

    public Taikhoan(Integer maTk) {
        this.maTk = maTk;
    }

    public Taikhoan(Integer maTk, String username, String password) {
        this.maTk = maTk;
        this.username = username;
        this.password = password;
    }

    public Integer getMaTk() {
        return maTk;
    }

    public void setMaTk(Integer maTk) {
        this.maTk = maTk;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getMaTt() {
        return maTt;
    }

    public void setMaTt(Integer maTt) {
        this.maTt = maTt;
    }

    public Quyen getMaQ() {
        return maQ;
    }

    public void setMaQ(Quyen maQ) {
        this.maQ = maQ;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maTk != null ? maTk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Taikhoan)) {
            return false;
        }
        Taikhoan other = (Taikhoan) object;
        if ((this.maTk == null && other.maTk != null) || (this.maTk != null && !this.maTk.equals(other.maTk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Taikhoan[ maTk=" + maTk + " ]";
    }
    
}
