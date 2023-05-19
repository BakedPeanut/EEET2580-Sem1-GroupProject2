package com.example.EEET2580Sem1GroupProject.Repository;

import com.example.EEET2580Sem1GroupProject.Models.Product;
import com.example.EEET2580Sem1GroupProject.Models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long>{
    Product findByProductID(Long id);

    Product findByOrderByPriceAsc();

    Product findByOrderByPriceDesc();

    Product findByName(String name);

}
