package tdd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Calculator {
  Basket basket = Basket.getBasketInstance();

  public Calculator(){}

  public BigDecimal addTaxes() {
    BigDecimal temp = null;
      for(IProduct product:basket.getProductsInBasket()){
        temp = product.getPrice();
      }
      temp = temp.multiply(BigDecimal.valueOf(1.10)).setScale(2, RoundingMode.HALF_EVEN);
    return temp;
  }

}
