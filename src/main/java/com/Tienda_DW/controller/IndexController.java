package com.Tienda_DW.controller;

import com.Tienda_DW.domain.Cliente;
import com.Tienda_DW.service.ArticuloService;
import com.Tienda_DW.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jefry
 */
@Slf4j
@Controller
public class IndexController {
    
    @Autowired
   ArticuloService articuloService;
    
    @GetMapping("/")
    public String inicio(Model model) {
      log.info("Ahora desde Desampakistan");
  
   
     var articulos = articuloService.getArticulos(true);
     model.addAttribute("articulos",articulos);
        
        return "index";
        
    } 
}
