package uk.ac.westminster.products_api;

public interface Discountable {

    void applyDiscount (double rate);
    double getDiscountedPrice();

//    Both classes compile because they implement same
//    Discountable interface and follow its methods
//    while each providing its own implementation of those methods.


}