package com.example.EEET2580Sem1GroupProject.Repository;

import com.example.EEET2580Sem1GroupProject.Models.Product;
import com.example.EEET2580Sem1GroupProject.Models.ProductOrder;
import com.example.EEET2580Sem1GroupProject.Models.Seller;
import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository <ProductOrder, Long>{
    ProductOrder findByOrderID(Long id);

    List<ProductOrder> findAllByBuyerId(Long id);

    //List<Seller> findAllByEmailOrOrderBy

}
