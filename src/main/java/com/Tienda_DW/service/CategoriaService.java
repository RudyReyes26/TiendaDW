package com.Tienda_DW.service;

import com.Tienda_DW.domain.Categoria;
import java.util.List;

/**
 *
 * @author jefry
 */
public interface CategoriaService {
    
public List<Categoria> getCategorias(boolean activos);

public Categoria getCategoria(Categoria categoria);

public void save(Categoria categoria);

public void delete(Categoria categoria);
    
}
