package com.example.EEET2580Sem1GroupProject.Models;

import jakarta.persistence.*;

import java.util.Set;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

@Entity
@Table
public class Buyer {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long buyerID;

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
    private String address;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "buyer")
    public Set<ProductOrder> productOrders;

    public Long getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(Long buyerID) {
        this.buyerID = buyerID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
