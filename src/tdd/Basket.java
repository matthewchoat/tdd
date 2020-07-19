package tdd;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Basket {
  Calculator calculator = new Calculator();
  Receipt receipt = Receipt.getReceiptInstance();

  private ArrayList<IProduct> productsInBasket = new ArrayList<>();

  private Basket() {};

  private static Basket basket = new Basket();

  public static Basket getBasketInstance() {
    return basket;
  }



  public ArrayList<IProduct> getProductsInBasket() { return this.productsInBasket; }

  public void addProductToBasket(String name, BigDecimal price, boolean imported, boolean exempt) {

    Product product = new Product(name, price, imported, exempt);
    productsInBasket.add(product);
  }

//find the product by name in the basket
  public String inBasket(String productName) {
    for (IProduct product : productsInBasket) {
      if (product.getName().equals(productName)) {
        return product.getName();
      }
    }
    return "Item not found";
  }

  public ArrayList<IProduct> getBasket(){
    return this.productsInBasket;
  }

  private void emptyBasket() {
    this.productsInBasket.clear();
  }

  public void buyProductsInBasket(){
    BigDecimal totalTaxes = calculator.addTaxes(productsInBasket);
    BigDecimal purchaseTotal = calculator.getBasketTotal(productsInBasket);
    receipt.printReceipt(productsInBasket, totalTaxes, purchaseTotal);
    emptyBasket();
  }

}
