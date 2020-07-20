package tdd;

import java.math.BigDecimal;

public class Main {

  public static void main(String[] args){

    Basket basket = Basket.getBasketInstance();

    basket.addProductToBasket("Animal Farm", BigDecimal.valueOf(12.49), false, true);
    basket.addProductToBasket("The White Album", BigDecimal.valueOf(14.99), false, false);
    basket.addProductToBasket("Hershey's Chocolate Bar", BigDecimal.valueOf(.85), false, true);
      basket.buyProductsInBasket();

    basket.addProductToBasket("Swiss Box of Chocolates", BigDecimal.valueOf(10.00), true, true);
    basket.addProductToBasket("French Bottle of Perfume-12oz", BigDecimal.valueOf(47.50), true, false);
      basket.buyProductsInBasket();

    basket.addProductToBasket("French Bottle of Perfume-6oz", BigDecimal.valueOf(27.99), true, false);
    basket.addProductToBasket("A&F Perfume-6oz", BigDecimal.valueOf(18.99), false, false);
    basket.addProductToBasket("Bottle of Ibuprofen", BigDecimal.valueOf(9.75), false, true);
    basket.addProductToBasket("Swedish Box of Chocolates", BigDecimal.valueOf(11.25), true, true);
      basket.buyProductsInBasket();
  }

}