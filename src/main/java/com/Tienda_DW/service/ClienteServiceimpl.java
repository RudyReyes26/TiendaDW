package com.Tienda_DW.service;

import com.Tienda_DW.dao.ClienteDao;
import com.Tienda_DW.dao.CreditoDao;
import com.Tienda_DW.domain.Cliente;
import com.Tienda_DW.domain.Credito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceimpl implements ClienteService {
    
    @Autowired
    ClienteDao clienteDao;
    
    @Autowired
    CreditoDao creditoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Cliente> getClientes() {
    return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Cliente getCliente(Cliente cliente) {
    return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
    
      Credito credito = cliente.getCredito();
      credito = creditoDao.save(credito);
     
      cliente.setCredito(credito);
     clienteDao.save(cliente);    
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
    clienteDao.deleteById(cliente.getIdCliente());    
    }
    
}
