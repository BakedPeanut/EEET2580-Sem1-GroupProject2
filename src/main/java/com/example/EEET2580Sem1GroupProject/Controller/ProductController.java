package com.example.EEET2580Sem1GroupProject.Controller;

import com.example.EEET2580Sem1GroupProject.Models.Product;
import com.example.EEET2580Sem1GroupProject.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping(path = "{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PostMapping(path = "{id}")
    public void addProduct(@RequestBody Product product, @PathVariable Long id){
        productService.addProduct(product, id);
    }
    @RequestMapping(path = "{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable int id){
        this.productService.deleteProduct(id);
    }

    @GetMapping(path = "priceAsc")
    public List<Product> SortByPriceAsc(){return productService.sortByPriceAsc();}

    @GetMapping(path = "priceDesc")
    public List<Product> SortByPriceDesc(){return productService.sortByPriceDesc();}

    @GetMapping(path = "{name}")
    public List<Product> FindByName(String name){return productService.findByName(name);}

    @GetMapping(path = "{brand}")
    public List<Product> FindByBrand(String brand){return productService.findByBrand(brand);}
}
