package com.heena.aera;

/*input: This is test string this is test string used in app
        Output: This is test string this is array used in app*/

/*Shopping cart :I want to design basic class diagram using shopping cart application. I have below requirement

        I should be able to see list of all products here only one list is fine
        - I should be able to add below dynamic discount to product
        - Percentage discount
        - Buy one get X discount
        - Checkout cart*/

class Product{
    String name;
    String type;
    Double price;

}

class Cart{

}

interface Discount{
    void applyDiscount();

}

class Buy1Get1Discount implements Discount{

    Product originalProduct;
    Product offerProduct;


    @Override
    public void applyDiscount() {

    }
}

class PercentageDiscount implements Discount{
    Product product;
    Integer percent;

    @Override
    public void applyDiscount() {

    }
}

class Buy1Get1DiscountFactory{
    void getBuy1Get1DiscountInstance(Product original, Product offer){

    }
}





public class ReplaceLastText {
    public static void main(String[] args) {
        ReplaceLastText replaceLastText = new ReplaceLastText();
        System.out.println(replaceLastText.replaceLast("This is test string this is test string used in app"
                , "test string", "array"));
    }

    private String replaceLast(String input, String stringToBeReplaced, String stringToBeReplacedWith) {
        int index = input.lastIndexOf(stringToBeReplaced);
        String substring = input.substring(index);
        String replace = substring.replace(stringToBeReplaced, stringToBeReplacedWith);
        String start = input.substring(0, index);
        return start.concat(replace);

    }
}
