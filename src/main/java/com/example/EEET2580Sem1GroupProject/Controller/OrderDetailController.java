package com.example.EEET2580Sem1GroupProject.Controller;

import com.example.EEET2580Sem1GroupProject.Models.OrderDetail;
import com.example.EEET2580Sem1GroupProject.Models.Product;
import com.example.EEET2580Sem1GroupProject.Service.OrderDetailService;
import com.example.EEET2580Sem1GroupProject.Service.OrderService;
import jakarta.persistence.criteria.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/orderDetail")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;

    @GetMapping
    public List<OrderDetail> getAllProducts(){
        return orderDetailService.getAllOrderDetail();
    }

    @GetMapping(path = "{id}")
    public OrderDetail getProductById(@PathVariable Long id){
        return orderDetailService.getOrderDetailById(id);
    }

    @PostMapping(path = "{id}")
    public void addProduct(@RequestBody OrderDetail orderDetail, @PathVariable int id){
        orderDetailService.addOrderDetail(orderDetail, id);
    }
    @RequestMapping(path = "{id}", method = RequestMethod.DELETE)
    public void deleteOrderDetail(@PathVariable int id){
        this.orderDetailService.deleteOrderDetail(id);
    }
}
