package tdd;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Basket {

  private ArrayList<Product> productsInBasket = new ArrayList<>();

  private Basket() {};

  private static Basket basket = new Basket();

  public static Basket getBasketInstance() {
    return basket;
  }


  public ArrayList<Product> getProductsInBasket() {
    return productsInBasket;
  }

  public void addProductToBasket(String name, BigDecimal price, boolean imported, boolean exempt) {
    Product product = new Product(name, price, imported, exempt);
    productsInBasket.add(product);
  }


  public String inBasket(String productName) {
    for (Product product : productsInBasket) {
      if (product.getName().equals(productName)) {
        return product.getName();
      }
    }
    return "Item not found";
  }

}
