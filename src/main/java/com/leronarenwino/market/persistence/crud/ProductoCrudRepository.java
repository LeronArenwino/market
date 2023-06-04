package com.leronarenwino.market.persistence.crud;

import com.leronarenwino.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
