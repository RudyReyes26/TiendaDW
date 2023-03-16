package com.Tienda_DW.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author jefry
 */

@Data
@Entity
@Table(name= "credito")
public class Credito implements Serializable  {
    
    
    private static final long serialVersionUID = 1L;
    
 @Id   
 @GeneratedValue(strategy = GenerationType.IDENTITY) 
 @Column(name="id_credito")
 private Long idCredito; //Hibernate lo transforma a id_cliente en la BD
 private double limite;

    public Credito() {
    }

    public Credito(double limite) {
        this.limite = limite;
    }
 
 
    
}
