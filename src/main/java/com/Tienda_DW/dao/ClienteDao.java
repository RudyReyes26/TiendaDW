package com.Tienda_DW.dao;

import com.Tienda_DW.domain.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long> {

    public List<Cliente> findByNombre(String nombre);
    
}
