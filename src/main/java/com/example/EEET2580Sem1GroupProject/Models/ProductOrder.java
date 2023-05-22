package com.example.EEET2580Sem1GroupProject.Models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table
public class ProductOrder {
    public enum Status {
        Completed, Pending, Declined, InCart
    }

    public ProductOrder() {
        if (buyer != null){
            buyerId = buyer.getBuyerId();
        }
    }



    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    protected Integer orderID;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public Seller seller;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "buyer")
    private Buyer buyer;


    private Long buyerId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "productOrder")
    public Set<OrderDetail> orderDetails;

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

}
