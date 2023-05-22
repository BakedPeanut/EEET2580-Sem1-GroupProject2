
package com.example.EEET2580Sem1GroupProject.Controller;

import com.example.EEET2580Sem1GroupProject.Models.Seller;
import com.example.EEET2580Sem1GroupProject.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seller")
public class SellerController {
    @Autowired
    SellerService sellerService;

    @GetMapping
    public List<Seller> getAllSeller(){
        return sellerService.getAllSeller();
    }

    @GetMapping(path = "/{id}")
    public Seller getSellerById(@PathVariable Long id){
        return sellerService.getSellerById(id);
    }

    @PostMapping
    public void addSeller(@RequestBody Seller seller){
        sellerService.addSeller(seller);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteSeller(@PathVariable int id){
        this.sellerService.deleteSeller(id);
    }

}
