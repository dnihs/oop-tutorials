package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//Week 2 tutorial Stretch Tasks 3 - removed  class level @RequestMapping("/products")
// The "/products/{id}" path is now mapped directly to method.

public class ProductController {
    @GetMapping("/products/{id}")
    public Product getById(@PathVariable Long id){
        return new Product(id, "Laptop", 999.99);
    }
}
