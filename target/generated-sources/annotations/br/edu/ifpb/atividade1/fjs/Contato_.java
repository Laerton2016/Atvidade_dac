package br.edu.ifpb.atividade1.fjs;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-06T22:14:41")
@StaticMetamodel(Contato.class)
public class Contato_ { 

    public static volatile SingularAttribute<Contato, String> telefone;
    public static volatile SingularAttribute<Contato, String> nome;
    public static volatile SingularAttribute<Contato, LocalDate> dataNascimento;
    public static volatile SingularAttribute<Contato, String> email;

}