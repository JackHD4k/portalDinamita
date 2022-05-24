/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author joelr
 */
@Entity
@Table(name = "suscripcion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Suscripcion.findAll", query = "SELECT s FROM Suscripcion s"),
    @NamedQuery(name = "Suscripcion.findByIdeSus", query = "SELECT s FROM Suscripcion s WHERE s.ideSus = :ideSus"),
    @NamedQuery(name = "Suscripcion.findByValSus", query = "SELECT s FROM Suscripcion s WHERE s.valSus = :valSus"),
    @NamedQuery(name = "Suscripcion.findByIniSus", query = "SELECT s FROM Suscripcion s WHERE s.iniSus = :iniSus")})
public class Suscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDE_SUS")
    private Integer ideSus;
    @Basic(optional = false)
    @Column(name = "VAL_SUS")
    private float valSus;
    @Basic(optional = false)
    @Column(name = "INI_SUS")
    @Temporal(TemporalType.DATE)
    private Date iniSus;
    @JoinColumn(name = "IDE_CAT", referencedColumnName = "IDE_CAT")
    @ManyToOne(optional = false)
    private Categoria ideCat;
    @JoinColumn(name = "IDE_DIV", referencedColumnName = "IDE_DIV")
    @ManyToOne(optional = false)
    private Divisa ideDiv;
    @JoinColumn(name = "IDE_USU", referencedColumnName = "IDE_USU")
    @ManyToOne(optional = false)
    private Usuario ideUsu;
    @JoinColumn(name = "IDE_SER", referencedColumnName = "IDE_SER")
    @ManyToOne(optional = false)
    private Servicio ideSer;

    public Suscripcion() {
    }

    public Suscripcion(Integer ideSus) {
        this.ideSus = ideSus;
    }

    public Suscripcion(Integer ideSus, float valSus, Date iniSus) {
        this.ideSus = ideSus;
        this.valSus = valSus;
        this.iniSus = iniSus;
    }

    public Integer getIdeSus() {
        return ideSus;
    }

    public void setIdeSus(Integer ideSus) {
        this.ideSus = ideSus;
    }

    public float getValSus() {
        return valSus;
    }

    public void setValSus(float valSus) {
        this.valSus = valSus;
    }

    public Date getIniSus() {
        return iniSus;
    }

    public void setIniSus(Date iniSus) {
        this.iniSus = iniSus;
    }

    public Categoria getIdeCat() {
        return ideCat;
    }

    public void setIdeCat(Categoria ideCat) {
        this.ideCat = ideCat;
    }

    public Divisa getIdeDiv() {
        return ideDiv;
    }

    public void setIdeDiv(Divisa ideDiv) {
        this.ideDiv = ideDiv;
    }

    public Usuario getIdeUsu() {
        return ideUsu;
    }

    public void setIdeUsu(Usuario ideUsu) {
        this.ideUsu = ideUsu;
    }

    public Servicio getIdeSer() {
        return ideSer;
    }

    public void setIdeSer(Servicio ideSer) {
        this.ideSer = ideSer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideSus != null ? ideSus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Suscripcion)) {
            return false;
        }
        Suscripcion other = (Suscripcion) object;
        if ((this.ideSus == null && other.ideSus != null) || (this.ideSus != null && !this.ideSus.equals(other.ideSus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Suscripcion[ ideSus=" + ideSus + " ]";
    }
    
}
