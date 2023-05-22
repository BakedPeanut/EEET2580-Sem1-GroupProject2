package com.example.EEET2580Sem1GroupProject.Controller;

import com.example.EEET2580Sem1GroupProject.Exception.ObjectIdException;
import com.example.EEET2580Sem1GroupProject.Exception.ParaNumErrorException;
import com.example.EEET2580Sem1GroupProject.Exception.ParaStringErrorException;
import com.example.EEET2580Sem1GroupProject.Models.Buyer;
import com.example.EEET2580Sem1GroupProject.Models.Seller;
import com.example.EEET2580Sem1GroupProject.Service.BuyerService;
import com.example.EEET2580Sem1GroupProject.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Buyer")
public class BuyerController {
    @Autowired
    BuyerService buyerService;

    @ExceptionHandler(ObjectIdException.class)
    public ResponseEntity<String> handleObjectIdException() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Something wrong when saving the user");
    }
    @ExceptionHandler(ParaNumErrorException.class)
    public ResponseEntity<String> handleParameterErrorNumber() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("User id does not exist!");
    }
    @ExceptionHandler(ParaStringErrorException.class)
    public ResponseEntity<String> handleParameterErrorString() {
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                .body("Parameter is not a number!");
    }
    @GetMapping
    public List<Buyer> getAllBuyer(){
        return buyerService.getAllBuyers();
    }

    @GetMapping(path = "/{id}")
    public Buyer getBuyerById(@PathVariable Long id){
        return buyerService.getBuyerById(id);
    }

    @PostMapping
    public void addBuyer(@RequestBody Buyer buyer){
        buyerService.addBuyer(buyer);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteBuyer(@PathVariable Long id){
        this.buyerService.deleteBuyer(id);
    }

    @GetMapping(path = "/login/{username}/{password}")
    public Buyer login(@PathVariable String username,@PathVariable String password ){
        return this.buyerService.login(username,password);
    }
}
