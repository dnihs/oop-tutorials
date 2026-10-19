// A PhysicalProduct IS-A product because its a subclass of product and inherits fields and methods of Product class
// A ShoppingCart HAS-A product. It is a collection of Products and not a subclass of products.

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){

    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }


    public double getWeightKg(){
        return weightKg;
    }
    public String getDimensions(){
        return dimensions;
    }



}
