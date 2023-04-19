package com.Tienda_DW.service;

import com.Tienda_DW.domain.Cliente;
import java.util.List;

/**
 *
 * @author jefry
 */
public interface ClienteService {
    
public List<Cliente> getClientes();

public Cliente getCliente(Cliente cliente);

public void save(Cliente cliente);

public void delete(Cliente cliente);

public List<Cliente> getClientePorNombre(String nombre);

}

