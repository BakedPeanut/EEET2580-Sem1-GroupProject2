package com.example.EEET2580Sem1GroupProject.Models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table
public class ProductOrder {
    public enum Status {
        Completed, Pending, Declined
    }

    public ProductOrder() {
    }

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    protected Integer orderID;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public Seller seller;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "buyerID")
    private Buyer buyer;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "productOrder")
    public Set<OrderDetail> orderDetails;

}
