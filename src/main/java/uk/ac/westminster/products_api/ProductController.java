package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

//Week 2 tutorial Stretch Tasks 3 - removed  class level @RequestMapping("/products")
// The "/products/{id}" path is now mapped directly to method.

public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElse(null);
    }

    @PostMapping("/products")
//    Changed from Product to DigitalProduct because Jackson cannot build abstract classes
    public Product addProduct(@RequestBody DigitalProduct product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct (@PathVariable Long id){
        productService.deleteProduct(id);
    }

    @GetMapping("/products/search")
    public List<Product> search (@RequestParam String name){
        return productService.findByName(name);
    }

@GetMapping("/products/cheaper-than")
public List<Product> findCheaperThan (@RequestParam double price) {
    return productService.findCheaperThan(price);
}

}