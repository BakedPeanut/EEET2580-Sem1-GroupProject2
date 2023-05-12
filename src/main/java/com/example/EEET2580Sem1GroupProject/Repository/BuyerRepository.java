package com.example.EEET2580Sem1GroupProject.Repository;

import com.example.EEET2580Sem1GroupProject.Models.Buyer;
import com.example.EEET2580Sem1GroupProject.Models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BuyerRepository extends JpaRepository <Buyer, Long>{
    Buyer findByBuyerID(Long id);
}
