package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        products.add(new DigitalProduct(
                nextId++, "Java For Dummies", 59.99,
                "/resources/ebooks/java_for_dummies.pdf", 12
        ));
        products.add(new PhysicalProduct(
                nextId++, "Sony Headphones", 99.99, 0.7, "9x4x3"
        ));
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(product -> product.getName().contains(name))
                .toList();
    }

    public List<Product> findCheaperThan(double price) {
        return products.stream()
                .filter(product -> product.getPrice() < price)
                .toList();
    }
}
