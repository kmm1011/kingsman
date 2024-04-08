package com.projectFinal.kingsmanOne.services;

import com.projectFinal.kingsmanOne.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {  /*JpaRepository interface requires the model/entity we created(Product) & the type of the primary key (Integer) */
}
