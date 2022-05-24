/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author joelr
 */
@Entity
@Table(name = "categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c"),
    @NamedQuery(name = "Categoria.findByIdeCat", query = "SELECT c FROM Categoria c WHERE c.ideCat = :ideCat"),
    @NamedQuery(name = "Categoria.findByNomCat", query = "SELECT c FROM Categoria c WHERE c.nomCat = :nomCat")})
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDE_CAT")
    private Integer ideCat;
    @Basic(optional = false)
    @Column(name = "NOM_CAT")
    private String nomCat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ideCat")
    private Collection<Suscripcion> suscripcionCollection;

    public Categoria() {
    }

    public Categoria(Integer ideCat) {
        this.ideCat = ideCat;
    }

    public Categoria(Integer ideCat, String nomCat) {
        this.ideCat = ideCat;
        this.nomCat = nomCat;
    }

    public Integer getIdeCat() {
        return ideCat;
    }

    public void setIdeCat(Integer ideCat) {
        this.ideCat = ideCat;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    @XmlTransient
    public Collection<Suscripcion> getSuscripcionCollection() {
        return suscripcionCollection;
    }

    public void setSuscripcionCollection(Collection<Suscripcion> suscripcionCollection) {
        this.suscripcionCollection = suscripcionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideCat != null ? ideCat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.ideCat == null && other.ideCat != null) || (this.ideCat != null && !this.ideCat.equals(other.ideCat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Categoria[ ideCat=" + ideCat + " ]";
    }
    
}
