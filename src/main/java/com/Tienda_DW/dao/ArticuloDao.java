package com.Tienda_DW.dao;

import com.Tienda_DW.domain.Articulo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jefry
 */
public interface ArticuloDao extends CrudRepository<Articulo, Long> {
    
}
