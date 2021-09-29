/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.restapiadsi.repository;

import com.adsi.restapiadsi.modelo.Productos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jesus
 */
public interface ProductosRepository extends JpaRepository<Productos, Integer> {

    //List<Productos> findById(String id);
    
    List<Productos> findByValor(String valor);
    
    List<Productos> findByNombreCompleto(String nombreCompleto);
    
    //List<Productos> findByCantidad(String cantidad);
    
    //List<Productos> findByDescripcion(String descripcion);
    
    //List<Productos> findByFechaIng(String fechaIng);

}
