package com.example.EEET2580Sem1GroupProject.Repository;

import com.example.EEET2580Sem1GroupProject.Models.OrderDetail;
import com.example.EEET2580Sem1GroupProject.Models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository <OrderDetail, Long>{
    OrderDetail findByOrderDetailId(long id);
}
