package com.example.EEET2580Sem1GroupProject.Repository;

import com.example.EEET2580Sem1GroupProject.Models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository <Seller, Long>{
    Seller findBySellerID(Long id);

    //List<Seller> findAllByEmailOrOrderBy

}
