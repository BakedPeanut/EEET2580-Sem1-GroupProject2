package com.example.EEET2580Sem1GroupProject.Service;

import com.example.EEET2580Sem1GroupProject.Models.Product;
import com.example.EEET2580Sem1GroupProject.Models.Seller;
import com.example.EEET2580Sem1GroupProject.Repository.ProductRepository;
import com.example.EEET2580Sem1GroupProject.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SellerRepository sellerRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Long id){
        return productRepository.findByProductID(id);
    }

    public void addProduct(Product product, Long sellerID){
        Seller seller = sellerRepository.findBySellerID(sellerID);
        product.setSeller(seller);
        System.out.println(seller.getEmail());
        System.out.println(product.getName());
        productRepository.save(product);
    }
    public void deleteProduct(int id){
        Product product = productRepository.getOne(Long.valueOf(id));
        productRepository.delete(product);
    }
    public Product sortByPriceAsc(){
        return productRepository.findByOrderByPriceAsc();
    }
    public Product sortByPriceDesc(){
        return productRepository.findByOrderByPriceDesc();
    }
    public Product findByName(String name){
        return productRepository.findByName(name);
    }
}
