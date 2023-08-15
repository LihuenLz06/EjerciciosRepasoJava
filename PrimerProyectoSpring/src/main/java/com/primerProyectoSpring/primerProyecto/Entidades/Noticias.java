package com.primerProyectoSpring.primerProyecto.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Noticias {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id;
    private String cuerpo;
    private String titulo;
    @ManyToOne
    private Autor autor;
    

}
