package com.example.EEET2580Sem1GroupProject.Service;


import com.example.EEET2580Sem1GroupProject.Models.OrderDetail;
import com.example.EEET2580Sem1GroupProject.Repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {
    @Autowired
    OrderDetailRepository orderDetailRepository;

    public List<OrderDetail> getAllOrderDetail(){
        return orderDetailRepository.findAll();
    }

    public OrderDetail getOrderDetailById(Long id){
        return orderDetailRepository.findByOrderDetailId(id);
    }

    public void addOrderDetail (OrderDetail orderDetail, int id){
        orderDetail.setOrderDetailId(id);
        orderDetailRepository.save(orderDetail);
    }

    public void deleteOrderDetail (int id){
        OrderDetail orderDetail = orderDetailRepository.getOne(Long.valueOf(id));
        orderDetailRepository.delete(orderDetail);
    }


}
