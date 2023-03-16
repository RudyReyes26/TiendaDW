package com.Tienda_DW.service;

import com.Tienda_DW.domain.Articulo;
import java.util.List;

/**
 *
 * @author jefry
 */
public interface ArticuloService {
    
    
public List<Articulo> getArticulos(boolean activos);

public Articulo getArticulo(Articulo articulo);

public void save(Articulo articulo);

public void delete(Articulo articulo);
}
