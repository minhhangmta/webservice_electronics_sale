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
@Table(name = "quyen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quyen.findAll", query = "SELECT q FROM Quyen q")
    , @NamedQuery(name = "Quyen.findByMaQ", query = "SELECT q FROM Quyen q WHERE q.maQ = :maQ")
    , @NamedQuery(name = "Quyen.findByTenquyen", query = "SELECT q FROM Quyen q WHERE q.tenquyen = :tenquyen")})
public class Quyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ma_q")
    private Integer maQ;
    @Size(max = 50)
    @Column(name = "tenquyen")
    private String tenquyen;
    @OneToMany(mappedBy = "maQ")
    private Collection<Taikhoan> taikhoanCollection;

    public Quyen() {
    }

    public Quyen(Integer maQ) {
        this.maQ = maQ;
    }

    public Integer getMaQ() {
        return maQ;
    }

    public void setMaQ(Integer maQ) {
        this.maQ = maQ;
    }

    public String getTenquyen() {
        return tenquyen;
    }

    public void setTenquyen(String tenquyen) {
        this.tenquyen = tenquyen;
    }

    @XmlTransient
    public Collection<Taikhoan> getTaikhoanCollection() {
        return taikhoanCollection;
    }

    public void setTaikhoanCollection(Collection<Taikhoan> taikhoanCollection) {
        this.taikhoanCollection = taikhoanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maQ != null ? maQ.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quyen)) {
            return false;
        }
        Quyen other = (Quyen) object;
        if ((this.maQ == null && other.maQ != null) || (this.maQ != null && !this.maQ.equals(other.maQ))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Quyen[ maQ=" + maQ + " ]";
    }
    
}
