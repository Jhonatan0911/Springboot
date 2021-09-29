/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.restapiadsi.rest;

import com.adsi.restapiadsi.modelo.Productos;
import com.adsi.restapiadsi.repository.ProductosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductosRest {
    @Autowired
    ProductosRepository productosRepository;
    @GetMapping("/api/productos/list")
    public List<Productos>listarProductos(){
        return productosRepository.findAll();
    }
    
    @GetMapping("/api/productos/valor/{valor}")
    public List<Productos>findByValor(@PathVariable("valor") String valor){
        return productosRepository.findByValor(valor);
    }
    
    @GetMapping("/api/productos/nombre/{nombreCompleto}")
    public List<Productos>findByNombreCompleto(@PathVariable("nombreCompleto") String nombreCompleto){
        return productosRepository.findByNombreCompleto(nombreCompleto);
    }
    
    @GetMapping("/api/productos/cantidad/{cantidad}")
    public List<Productos>findByCantidad(@PathVariable("cantidad") String cantidad){
        return productosRepository.findByCantidad(cantidad);
    }
    
    /* @GetMapping("/api/productos/id/{id}")
    public List<Productos>findById(@PathVariable("valor") String id){
        return productosRepository.findById(id);
    }

    
    @GetMapping("/api/productos/descripcion/{descripcion}")
    public List<Productos>findByDescripcion(@PathVariable("descripcion") String descripcion){
        return productosRepository.findByDescripcion(descripcion);
    }
    
    @GetMapping("/api/productos/fecha/{fechaIng}")
    public List<Productos>findByFechaIng(@PathVariable("fechaIng") String fechaIng){
        return productosRepository.findByFechaIng(fechaIng);
    }
*/
}






























