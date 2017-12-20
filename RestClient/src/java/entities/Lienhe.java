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
@Table(name = "lienhe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lienhe.findAll", query = "SELECT l FROM Lienhe l")
    , @NamedQuery(name = "Lienhe.findByMaLh", query = "SELECT l FROM Lienhe l WHERE l.maLh = :maLh")
    , @NamedQuery(name = "Lienhe.findByEmail", query = "SELECT l FROM Lienhe l WHERE l.email = :email")
    , @NamedQuery(name = "Lienhe.findByLienhe", query = "SELECT l FROM Lienhe l WHERE l.lienhe = :lienhe")})
public class Lienhe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ma_lh")
    private Integer maLh;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;
    @Size(max = 1000)
    @Column(name = "lienhe")
    private String lienhe;
    @JoinColumn(name = "ma_tt", referencedColumnName = "ma_tt")
    @ManyToOne
    private Trangthai maTt;

    public Lienhe() {
    }

    public Lienhe(Integer maLh) {
        this.maLh = maLh;
    }

    public Lienhe(Integer maLh, String email) {
        this.maLh = maLh;
        this.email = email;
    }

    public Integer getMaLh() {
        return maLh;
    }

    public void setMaLh(Integer maLh) {
        this.maLh = maLh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLienhe() {
        return lienhe;
    }

    public void setLienhe(String lienhe) {
        this.lienhe = lienhe;
    }

    public Trangthai getMaTt() {
        return maTt;
    }

    public void setMaTt(Trangthai maTt) {
        this.maTt = maTt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maLh != null ? maLh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lienhe)) {
            return false;
        }
        Lienhe other = (Lienhe) object;
        if ((this.maLh == null && other.maLh != null) || (this.maLh != null && !this.maLh.equals(other.maLh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Lienhe[ maLh=" + maLh + " ]";
    }
    
}
