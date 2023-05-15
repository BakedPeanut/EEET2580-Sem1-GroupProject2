package com.example.EEET2580Sem1GroupProject.Service;

import com.example.EEET2580Sem1GroupProject.Models.Product;
import com.example.EEET2580Sem1GroupProject.Models.Seller;
import com.example.EEET2580Sem1GroupProject.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;

    public List<Seller> getAllSeller(){
        return sellerRepository.findAll();
    }

    public Seller getSellerById(Long id){
        return sellerRepository.findBySellerID(id);
    }

    public void addSeller(Seller seller){
        sellerRepository.save(seller);
    }

    public void deleteSeller(int id) {
        Seller seller = sellerRepository.getOne(Long.valueOf(id));
        sellerRepository.delete(seller);
    }
}
