package com.Tienda_DW.service;

import com.Tienda_DW.dao.CategoriaDao;
import com.Tienda_DW.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jefry
 */

@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias(boolean activos) {
    var lista = (List<Categoria>) categoriaDao.findAll();
    
    if(activos == true) {
        lista.removeIf(e -> !e.isActivo());
    }
    return lista;
    }

    @Override
    @Transactional(readOnly=true)
    public Categoria getCategoria(Categoria categoria) {
    return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categoria categoria) {
    categoriaDao.save(categoria);    
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
    categoriaDao.deleteById(categoria.getIdCategoria());    
    }
    
}
