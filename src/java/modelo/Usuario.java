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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdeUsu", query = "SELECT u FROM Usuario u WHERE u.ideUsu = :ideUsu"),
    @NamedQuery(name = "Usuario.findByNomUsu", query = "SELECT u FROM Usuario u WHERE u.nomUsu = :nomUsu"),
    @NamedQuery(name = "Usuario.findByApeUsu", query = "SELECT u FROM Usuario u WHERE u.apeUsu = :apeUsu"),
    @NamedQuery(name = "Usuario.findByCorUsu", query = "SELECT u FROM Usuario u WHERE u.corUsu = :corUsu"),
    @NamedQuery(name = "Usuario.findByConUsu", query = "SELECT u FROM Usuario u WHERE u.conUsu = :conUsu")})
public class Usuario implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ideUsu")
    private Collection<Suscripcion> suscripcionCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDE_USU")
    private Integer ideUsu;
    @Basic(optional = false)
    @Column(name = "NOM_USU")
    private String nomUsu;
    @Basic(optional = false)
    @Column(name = "APE_USU")
    private String apeUsu;
    @Basic(optional = false)
    @Column(name = "COR_USU")
    private String corUsu;
    @Basic(optional = false)
    @Column(name = "CON_USU")
    private String conUsu;

    public Usuario() {
    }

    public Usuario(Integer ideUsu) {
        this.ideUsu = ideUsu;
    }

    public Usuario(Integer ideUsu, String nomUsu, String apeUsu, String corUsu, String conUsu) {
        this.ideUsu = ideUsu;
        this.nomUsu = nomUsu;
        this.apeUsu = apeUsu;
        this.corUsu = corUsu;
        this.conUsu = conUsu;
    }

    public Integer getIdeUsu() {
        return ideUsu;
    }

    public void setIdeUsu(Integer ideUsu) {
        this.ideUsu = ideUsu;
    }

    public String getNomUsu() {
        return nomUsu;
    }

    public void setNomUsu(String nomUsu) {
        this.nomUsu = nomUsu;
    }

    public String getApeUsu() {
        return apeUsu;
    }

    public void setApeUsu(String apeUsu) {
        this.apeUsu = apeUsu;
    }

    public String getCorUsu() {
        return corUsu;
    }

    public void setCorUsu(String corUsu) {
        this.corUsu = corUsu;
    }

    public String getConUsu() {
        return conUsu;
    }

    public void setConUsu(String conUsu) {
        this.conUsu = conUsu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideUsu != null ? ideUsu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.ideUsu == null && other.ideUsu != null) || (this.ideUsu != null && !this.ideUsu.equals(other.ideUsu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Usuario[ ideUsu=" + ideUsu + " ]";
    }

    @XmlTransient
    public Collection<Suscripcion> getSuscripcionCollection() {
        return suscripcionCollection;
    }

    public void setSuscripcionCollection(Collection<Suscripcion> suscripcionCollection) {
        this.suscripcionCollection = suscripcionCollection;
    }
    
}
