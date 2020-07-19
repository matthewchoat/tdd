package tdd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Calculator {
  Basket basket = Basket.getBasketInstance();

  public Calculator(){}

  public BigDecimal addTaxes(ArrayList<IProduct> productsCart) {
    BigDecimal priceAddTax = null;
    BigDecimal totalTaxes = BigDecimal.valueOf(0.00);
      for(IProduct product : productsCart){
        totalTaxes = totalTaxes.add(product.getPrice().multiply(Constants.TAX_RATE)).setScale(2, RoundingMode.HALF_EVEN);
        priceAddTax = product.getPrice().multiply(Constants.TAX_MULTIPLIER).setScale(2, RoundingMode.HALF_EVEN);
        product.setPrice(priceAddTax);

        System.out.println("price add tax "+ priceAddTax + " price total tax " + totalTaxes + " New price " + product.getPrice());
      }
    return totalTaxes;
  }

}
