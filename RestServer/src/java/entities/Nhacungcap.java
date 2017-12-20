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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author minhh
 */
@Entity
@Table(name = "nhacungcap")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nhacungcap.findAll", query = "SELECT n FROM Nhacungcap n")
    , @NamedQuery(name = "Nhacungcap.findByMaNcc", query = "SELECT n FROM Nhacungcap n WHERE n.maNcc = :maNcc")
    , @NamedQuery(name = "Nhacungcap.findByTennhacc", query = "SELECT n FROM Nhacungcap n WHERE n.tennhacc = :tennhacc")
    , @NamedQuery(name = "Nhacungcap.findByEmail", query = "SELECT n FROM Nhacungcap n WHERE n.email = :email")
    , @NamedQuery(name = "Nhacungcap.findBySodienthoai", query = "SELECT n FROM Nhacungcap n WHERE n.sodienthoai = :sodienthoai")
    , @NamedQuery(name = "Nhacungcap.findByDiachi", query = "SELECT n FROM Nhacungcap n WHERE n.diachi = :diachi")})
public class Nhacungcap implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ma_ncc")
    private Integer maNcc;
    @Size(max = 50)
    @Column(name = "tennhacc")
    private String tennhacc;
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
    @OneToMany(mappedBy = "maNcc")
    private Collection<Sanpham> sanphamCollection;

    public Nhacungcap() {
    }

    public Nhacungcap(Integer maNcc) {
        this.maNcc = maNcc;
    }

    public Integer getMaNcc() {
        return maNcc;
    }

    public void setMaNcc(Integer maNcc) {
        this.maNcc = maNcc;
    }

    public String getTennhacc() {
        return tennhacc;
    }

    public void setTennhacc(String tennhacc) {
        this.tennhacc = tennhacc;
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
        hash += (maNcc != null ? maNcc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nhacungcap)) {
            return false;
        }
        Nhacungcap other = (Nhacungcap) object;
        if ((this.maNcc == null && other.maNcc != null) || (this.maNcc != null && !this.maNcc.equals(other.maNcc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Nhacungcap[ maNcc=" + maNcc + " ]";
    }
    
}
