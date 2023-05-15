package com.example.EEET2580Sem1GroupProject.Controller;

import com.example.EEET2580Sem1GroupProject.Models.Product;
import com.example.EEET2580Sem1GroupProject.Models.ProductOrder;
import com.example.EEET2580Sem1GroupProject.Service.OrderService;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<ProductOrder> getAllOrderDetails(){
        return orderService.getAllOrder();
    }

    @GetMapping(path = "{id}")
    public ProductOrder getOrderById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }

    @PostMapping(path = "{id}")
    public void addOrder(@RequestBody ProductOrder productOrder){
        orderService.addOrder(productOrder);
    }
    @RequestMapping(path = "{id}", method = RequestMethod.DELETE)
    public void deleteOrder(@PathVariable Long id){
        this.orderService.deleteOrder(id);
    }



}
