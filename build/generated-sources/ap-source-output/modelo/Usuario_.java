package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Suscripcion;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-05-23T18:53:56")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Integer> ideUsu;
    public static volatile SingularAttribute<Usuario, String> corUsu;
    public static volatile CollectionAttribute<Usuario, Suscripcion> suscripcionCollection;
    public static volatile SingularAttribute<Usuario, String> conUsu;
    public static volatile SingularAttribute<Usuario, String> apeUsu;
    public static volatile SingularAttribute<Usuario, String> nomUsu;

}