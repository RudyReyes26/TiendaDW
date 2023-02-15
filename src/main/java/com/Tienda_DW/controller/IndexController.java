package com.Tienda_DW.controller;

import com.Tienda_DW.domain.Cliente;
import com.Tienda_DW.dao.ClienteDao;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jefry
 */
@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
   //     log.info("Ahora desde Desampakistan");
   //     model.addAttribute("Mensaje", "Hola desde el controlador");
        
   //     Cliente cliente = new Cliente("Jefry", "Reyes Siles", "rureyes2601@gmail.com", "83880104");
   //     model.addAttribute("objetoCliente", cliente);
   //     Cliente cliente2 = new Cliente("Rudy", "Reyes Siles", "rureyes2601@gmail.com", "83880104");
   //     Cliente cliente3 = new Cliente("Jelkin", "Reyes Siles", "rureyes2601@gmail.com", "83880104");
        
   //     List<Cliente> clientes = Arrays.asList(cliente, cliente2, cliente3);
   
     var clientes = clienteDao.findAll();
     model.addAttribute("clientes", clientes);
        
        return "index";
    }
    
}
