package com.example.EEET2580Sem1GroupProject.Service;

import com.example.EEET2580Sem1GroupProject.Models.Buyer;
import com.example.EEET2580Sem1GroupProject.Models.Product;
import com.example.EEET2580Sem1GroupProject.Models.ProductOrder;
import com.example.EEET2580Sem1GroupProject.Models.Seller;
import com.example.EEET2580Sem1GroupProject.Repository.BuyerRepository;
import com.example.EEET2580Sem1GroupProject.Repository.OrderDetailRepository;
import com.example.EEET2580Sem1GroupProject.Repository.OrderRepository;
import com.example.EEET2580Sem1GroupProject.Repository.ProductRepository;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<ProductOrder> getAllOrder(){
        return orderRepository.findAll();
    }

    public ProductOrder getOrderById(Long id){
        return orderRepository.findByOrderID(id);
    }

    public void addOrder(ProductOrder order){
        orderRepository.save(order);
    }
    public void deleteOrder(Long id){
        ProductOrder order = orderRepository.getOne(Long.valueOf(id));
        orderRepository.delete(order);
    }
    public List<ProductOrder> getOrderbyBuyerId(Long id){
        return orderRepository.findAllByBuyerID(id);
    }

}
