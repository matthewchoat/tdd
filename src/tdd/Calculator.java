package tdd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Calculator {
  Basket basket = Basket.getBasketInstance();

  private ArrayList<IProduct> productsCart = Basket.getBasketInstance().getProductsInBasket();

  public Calculator(){}

  public BigDecimal addTaxes() {
    BigDecimal priceAddTax = null;
    BigDecimal totalTaxes = null;
      for(IProduct product : basket.getProductsInBasket()){
        priceAddTax = product.getPrice().multiply(Constants.TAX_MULTIPLIER).setScale(2, RoundingMode.HALF_EVEN);
        product.setPrice(priceAddTax);

      }
    return priceAddTax;
  }

}
