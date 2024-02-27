package fernandez.braian.doggroomen.logic;

import fernandez.braian.doggroomen.logic.Owner;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-23T09:11:30", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Dogs.class)
public class Dogs_ { 

    public static volatile SingularAttribute<Dogs, String> allergic;
    public static volatile SingularAttribute<Dogs, Integer> number_client;
    public static volatile SingularAttribute<Dogs, String> race;
    public static volatile SingularAttribute<Dogs, String> color;
    public static volatile SingularAttribute<Dogs, String> observation;
    public static volatile SingularAttribute<Dogs, String> name;
    public static volatile SingularAttribute<Dogs, Owner> oneOnwer;
    public static volatile SingularAttribute<Dogs, String> special_attention;

}