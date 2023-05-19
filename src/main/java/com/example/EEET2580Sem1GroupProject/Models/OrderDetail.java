package com.example.EEET2580Sem1GroupProject.Models;

import jakarta.persistence.*;


@Entity
@Table
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer orderDetailId;

    @Column
    private Integer Quantity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_ID")
    private ProductOrder productOrder;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_ID")
    private Product product;

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderID) {
        this.orderDetailId = orderID;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(ProductOrder productOrder) {
        this.productOrder = productOrder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
