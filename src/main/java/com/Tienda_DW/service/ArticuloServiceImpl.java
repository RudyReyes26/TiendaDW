package com.Tienda_DW.service;

import com.Tienda_DW.dao.ArticuloDao;
import com.Tienda_DW.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jefry
 */

@Service
public class ArticuloServiceImpl implements ArticuloService {
    
    @Autowired
    ArticuloDao articuloDao;

    @Override
    @Transactional(readOnly=true)
    public List<Articulo> getArticulos(boolean activos) {
    var lista = (List<Articulo>) articuloDao.findAll();
    
    if(activos == true) {
        lista.removeIf(e -> !e.isActivo());
    }
    return lista;
    }

    @Override
    @Transactional(readOnly=true)
    public Articulo getArticulo(Articulo articulo) {
    return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Articulo articulo) {
    articuloDao.save(articulo);    
    }

    @Override
    @Transactional
    public void delete(Articulo articulo) {
    articuloDao.deleteById(articulo.getIdArticulo());    
    }
    
}
