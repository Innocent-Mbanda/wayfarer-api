package com.springdata.product.Repositories;

import com.springdata.product.Model.product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<product, Integer> {
}
