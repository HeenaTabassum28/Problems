package com.heena.designpatterns.strategy.example2;

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.doPay(new PayPalStrategy("myemail@example.com", "mypwd"));
        cart.doPay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));

    }
}
