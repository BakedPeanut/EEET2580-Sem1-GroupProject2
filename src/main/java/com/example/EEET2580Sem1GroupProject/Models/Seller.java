package com.example.EEET2580Sem1GroupProject.Models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long sellerID;

    @Column
    private String sellerShopName;

    @Column(length = 20, nullable = false, unique = true)
    private String username;

    @Column(columnDefinition = "TEXT")
    private String password;

    @Column(length = 128, nullable = false, unique = true)
    private String email;

    @Column(length = 20, nullable = false)
    private String firstName;

    @Column(length = 20, nullable = false)
    private String lastName;

    @Column(length = 32, nullable = false)
    private String shopAddress;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "seller")
    public Set<ProductOrder> orders;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "seller")
    public Set<Product> products;

    public Set<ProductOrder> getOrders() {
        return orders;
    }

    public void setOrders(Set<ProductOrder> orders) {
        this.orders = orders;
    }

    public Long getSellerID() {
        return sellerID;
    }

    public void setSellerID(Long sellerID) {
        this.sellerID = sellerID;
    }

    public String getSellerShopName() {
        return sellerShopName;
    }

    public void setSellerShopName(String sellerShopName) {
        this.sellerShopName = sellerShopName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
