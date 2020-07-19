package tdd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Calculator {

  public Calculator(){}

  public BigDecimal addTaxes(ArrayList<IProduct> productsCart) {

    BigDecimal totalTaxes = BigDecimal.valueOf(0.00);
      for(IProduct product : productsCart){
        if (!product.isExempt() && !product.isImported()) {
          totalTaxes = totalTaxes.add(product.getPrice().multiply(Constants.TAX_RATE)).setScale(2, RoundingMode.HALF_EVEN);
              product.setPrice(product.getPrice().multiply(Constants.TAX_MULTIPLIER).setScale(2, RoundingMode.HALF_EVEN));

        }

        else if (!product.isExempt() && product.isImported()) {
          totalTaxes = totalTaxes.add(product.getPrice().multiply(Constants.TAXANDIMPORT_RATE)).setScale(2, RoundingMode.HALF_EVEN);
              product.setPrice(product.getPrice().multiply(Constants.TAXANDIMPORT_MULTIPLIER).setScale(2, RoundingMode.HALF_EVEN));

        }

        else if (product.isExempt() && product.isImported()){
          totalTaxes = totalTaxes.add(product.getPrice().multiply(Constants.IMPORT_RATE)).setScale(2, RoundingMode.HALF_EVEN);
              product.setPrice(product.getPrice().multiply(Constants.IMPORT_MULTIPLIER).setScale(2, RoundingMode.HALF_EVEN));
        }

      }
    return totalTaxes;
  }

  public BigDecimal getBasketTotal(ArrayList<IProduct> basket) {
    return basket.stream().map(IProduct::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
  }

}
