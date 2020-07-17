package tdd;

import java.util.ArrayList;

public class Basket {

  private ArrayList<IProduct> productsInBasket;

  private Basket() {};
  private static Basket basket = new Basket();
  public static Basket getBasketInstance() {
    return basket;
  }

  public void getProducts(){};

  public void addToBasket(){};

  public void addProductToBasket(IProduct product){
    productsInBasket.add(product);
  }

}
