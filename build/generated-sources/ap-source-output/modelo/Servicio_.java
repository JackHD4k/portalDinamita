package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Suscripcion;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-05-23T18:53:56")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> nomSer;
    public static volatile CollectionAttribute<Servicio, Suscripcion> suscripcionCollection;
    public static volatile SingularAttribute<Servicio, Integer> ideSer;

}