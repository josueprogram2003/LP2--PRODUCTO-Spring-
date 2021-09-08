/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.clase1.demo.clase.Controller;

import com.example.clase1.demo.clase.service.ProductoService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jdomi
 */

@RestController
public class HomeController {
    
    
    
    @Autowired
    private ProductoService pr;
    
    @GetMapping("/productos")
    List<Map<String, Object>>mensaje(){   
    return pr.readAll();
    }
    
    
   
}
