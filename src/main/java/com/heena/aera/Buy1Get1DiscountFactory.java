package com.heena.aera;

/*input: This is test string this is test string used in app
        Output: This is test string this is array used in app*/

/*Shopping cart :I want to design basic class diagram using shopping cart application. I have below requirement

        I should be able to see list of all products here only one list is fine
        - I should be able to add below dynamic discount to product
        - Percentage discount
        - Buy one get X discount
        - Checkout cart*/

class Product {
    String name;
    String type;
    Double price;

}

class Cart {

}

interface Discount {
    void applyDiscount();

}

class Buy1Get1Discount implements Discount {

    Product originalProduct;
    Product offerProduct;


    @Override
    public void applyDiscount() {

    }
}

class PercentageDiscount implements Discount {
    Product product;
    Integer percent;

    @Override
    public void applyDiscount() {

    }
}

public class Buy1Get1DiscountFactory {
    void getBuy1Get1DiscountInstance(Product original, Product offer) {

    }
}

