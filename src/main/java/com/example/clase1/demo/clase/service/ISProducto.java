/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.clase1.demo.clase.service;

import com.example.clase1.demo.clase.entity.Producto;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jdomi
 */
public interface ISProducto {
    List<Map<String, Object>> readAll();
    int create(Producto p);
    int update(Producto p);
    int delete(int id);
    Producto read(int id);
    Producto searchUser(String produ);
}
