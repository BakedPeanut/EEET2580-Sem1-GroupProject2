package com.example.EEET2580Sem1GroupProject.Service;

import com.example.EEET2580Sem1GroupProject.Models.Buyer;
import com.example.EEET2580Sem1GroupProject.Models.Seller;
import com.example.EEET2580Sem1GroupProject.Repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {

    @Autowired
    BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers(){
        return buyerRepository.findAll();
    }

    public Buyer getBuyerById(Long id){
        return buyerRepository.findByBuyerId(id);
    }

    public void addBuyer(Buyer buyer){
        buyerRepository.save(buyer);
    }

    public void deleteBuyer(Long id){
        Buyer buyer = buyerRepository.getOne(Long.valueOf(id));
        buyerRepository.delete(buyer);
    }
    public boolean loginCheck(String username,String password){
        Buyer buyer = buyerRepository.findByUsernameAndPassword(username,password);
        if (buyer !=null){
            return true;
        }else return false;
    }
    public Buyer login(String username,String password){
        if (loginCheck(username,password)){
            return buyerRepository.findByUsernameAndPassword(username,password);
        }else return null;
    }

    public void updateBuyer(Long id,Buyer newBuyer){
        Buyer buyer = buyerRepository.findByBuyerId(id);
        buyer.setFirstName(newBuyer.getFirstName());
        buyer.setAddress(newBuyer.getAddress());
        buyer.setEmail(newBuyer.getEmail());
        buyer.setLastName(newBuyer.getLastName());
        buyer.setPassword(newBuyer.getPassword());
        buyer.setPhoneNumber(newBuyer.getPhoneNumber());
        buyerRepository.save(buyer);
    }

}
