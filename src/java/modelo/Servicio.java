/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author joelr
 */
@Entity
@Table(name = "servicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicio.findAll", query = "SELECT s FROM Servicio s"),
    @NamedQuery(name = "Servicio.findByIdeSer", query = "SELECT s FROM Servicio s WHERE s.ideSer = :ideSer"),
    @NamedQuery(name = "Servicio.findByNomSer", query = "SELECT s FROM Servicio s WHERE s.nomSer = :nomSer")})
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDE_SER")
    private Integer ideSer;
    @Basic(optional = false)
    @Column(name = "NOM_SER")
    private String nomSer;

    public Servicio() {
    }

    public Servicio(Integer ideSer) {
        this.ideSer = ideSer;
    }

    public Servicio(Integer ideSer, String nomSer) {
        this.ideSer = ideSer;
        this.nomSer = nomSer;
    }

    public Integer getIdeSer() {
        return ideSer;
    }

    public void setIdeSer(Integer ideSer) {
        this.ideSer = ideSer;
    }

    public String getNomSer() {
        return nomSer;
    }

    public void setNomSer(String nomSer) {
        this.nomSer = nomSer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideSer != null ? ideSer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicio)) {
            return false;
        }
        Servicio other = (Servicio) object;
        if ((this.ideSer == null && other.ideSer != null) || (this.ideSer != null && !this.ideSer.equals(other.ideSer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Servicio[ ideSer=" + ideSer + " ]";
    }
    
}
