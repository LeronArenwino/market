package com.leronarenwino.market.persistence;

import com.leronarenwino.market.persistence.crud.ProductoCrudRepository;
import com.leronarenwino.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

}
