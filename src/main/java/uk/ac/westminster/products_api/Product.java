package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product() {

    }

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSummary(){
        return "Name: "+name+ " | Price: "+price;
    }


//    When this method is commented out, Jackson cannot see the field,
    //    and it silently skips over it. This can be identified with API testing using Postman or Swagger UI.

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
