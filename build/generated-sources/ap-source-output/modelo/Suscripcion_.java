package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Categoria;
import modelo.Divisa;
import modelo.Servicio;
import modelo.Usuario;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-05-23T18:53:56")
@StaticMetamodel(Suscripcion.class)
public class Suscripcion_ { 

    public static volatile SingularAttribute<Suscripcion, Categoria> ideCat;
    public static volatile SingularAttribute<Suscripcion, Usuario> ideUsu;
    public static volatile SingularAttribute<Suscripcion, Float> valSus;
    public static volatile SingularAttribute<Suscripcion, Date> iniSus;
    public static volatile SingularAttribute<Suscripcion, Integer> ideSus;
    public static volatile SingularAttribute<Suscripcion, Divisa> ideDiv;
    public static volatile SingularAttribute<Suscripcion, Servicio> ideSer;

}