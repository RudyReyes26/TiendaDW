package com.Tienda_DW.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author jefry
 */


@Data
@Entity
@Table(name= "categoria")
public class Categoria {
    private static final long serialVersionUID = 1L;
    
 @Id   
 @GeneratedValue(strategy = GenerationType.IDENTITY) 
 private Long idCategoria;
 private String descripcion;
 private boolean activo;

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
 
 
 
}
