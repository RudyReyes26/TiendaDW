/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda_DW.dao;

import com.Tienda_DW.domain.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jefry
 */
public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
