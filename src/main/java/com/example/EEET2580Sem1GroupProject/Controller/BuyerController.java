package com.example.EEET2580Sem1GroupProject.Controller;

import com.example.EEET2580Sem1GroupProject.Models.Buyer;
import com.example.EEET2580Sem1GroupProject.Models.Seller;
import com.example.EEET2580Sem1GroupProject.Service.BuyerService;
import com.example.EEET2580Sem1GroupProject.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Buyer")
public class BuyerController {
    @Autowired
    BuyerService buyerService;

    @GetMapping
    public List<Buyer> getAllBuyer(){
        return buyerService.getAllBuyers();
    }

    @GetMapping(path = "{id}")
    public Buyer getBuyerById(@PathVariable Long id){
        return buyerService.getBuyerById(id);
    }

    @PostMapping
    public void addBuyer(@RequestBody Buyer buyer){
        buyerService.addBuyer(buyer);
    }

    @RequestMapping(path = "{id}", method = RequestMethod.DELETE)
    public void deleteBuyer(@PathVariable Long id){
        this.buyerService.deleteBuyer(id);
    }
}
