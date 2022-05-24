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
@Table(name = "divisa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Divisa.findAll", query = "SELECT d FROM Divisa d"),
    @NamedQuery(name = "Divisa.findByIdeDiv", query = "SELECT d FROM Divisa d WHERE d.ideDiv = :ideDiv"),
    @NamedQuery(name = "Divisa.findByNomDiv", query = "SELECT d FROM Divisa d WHERE d.nomDiv = :nomDiv"),
    @NamedQuery(name = "Divisa.findByValDiv", query = "SELECT d FROM Divisa d WHERE d.valDiv = :valDiv")})
public class Divisa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDE_DIV")
    private Integer ideDiv;
    @Basic(optional = false)
    @Column(name = "NOM_DIV")
    private String nomDiv;
    @Basic(optional = false)
    @Column(name = "VAL_DIV")
    private float valDiv;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ideDiv")
    private Collection<Suscripcion> suscripcionCollection;

    public Divisa() {
    }

    public Divisa(Integer ideDiv) {
        this.ideDiv = ideDiv;
    }

    public Divisa(Integer ideDiv, String nomDiv, float valDiv) {
        this.ideDiv = ideDiv;
        this.nomDiv = nomDiv;
        this.valDiv = valDiv;
    }

    public Integer getIdeDiv() {
        return ideDiv;
    }

    public void setIdeDiv(Integer ideDiv) {
        this.ideDiv = ideDiv;
    }

    public String getNomDiv() {
        return nomDiv;
    }

    public void setNomDiv(String nomDiv) {
        this.nomDiv = nomDiv;
    }

    public float getValDiv() {
        return valDiv;
    }

    public void setValDiv(float valDiv) {
        this.valDiv = valDiv;
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
        hash += (ideDiv != null ? ideDiv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Divisa)) {
            return false;
        }
        Divisa other = (Divisa) object;
        if ((this.ideDiv == null && other.ideDiv != null) || (this.ideDiv != null && !this.ideDiv.equals(other.ideDiv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Divisa[ ideDiv=" + ideDiv + " ]";
    }
    
}
